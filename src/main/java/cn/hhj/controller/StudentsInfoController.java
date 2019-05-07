package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.ResponsResult;
import cn.hhj.po.StudentClassDepartmentPo;
import cn.hhj.pojo.StudentsInfo;
import cn.hhj.pojo.User;
import cn.hhj.service.StudentsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 23:10
 * @Version 1.0
 */
@Controller
@RequestMapping("/studentsInfo")
public class StudentsInfoController extends BaseController{

    @Autowired
    StudentsInfoService studentsInfoService;

    @RequestMapping("/add")
    public ResponsResult<StudentsInfo> add(StudentsInfo studentsInfo){
        Integer i = studentsInfoService.add(studentsInfo);
        if(i == 1){
            return inbound(null,"添加成功");
        }else {
            return failHandler("添加失败");
        }
    }

    @RequestMapping("/delete")
    public ResponsResult<StudentsInfo> delete(StudentsInfo StudentsInfo){
        Integer i = studentsInfoService.deleteById(StudentsInfo);
        if(i == 1){
            return inbound(null,"删除成功");
        }else {
            return failHandler("删除失败");
        }
    }

    @RequestMapping("/update")
    public ResponsResult<StudentsInfo> update(StudentsInfo StudentsInfo){
        Integer i = studentsInfoService.update(StudentsInfo);
        if(i == 1){
            return inbound(null,"更新成功");
        }else {
            return failHandler("更新失败");
        }
    }

    @RequestMapping("/quireInfo")
    public String quire(HttpSession session, Model model){
        User user = (User)session.getAttribute(BaseInfo.USER);
        if(null == user)
            return "error";
        StudentsInfo studentsInfo = new StudentsInfo();
        studentsInfo.setUser_id(user.getId());
        List<StudentClassDepartmentPo> list = studentsInfoService.jointQuire(studentsInfo);
        model.addAttribute("studentClassDepartmentPo",list.get(0));
        return "info";
    }
}
