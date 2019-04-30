package cn.hhj.controller;

import cn.hhj.ResponsResult;
import cn.hhj.po.StudentClassDepartmentPo;
import cn.hhj.pojo.StudentsInfo;
import cn.hhj.service.StudentsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/quire")
    public ResponsResult<List<StudentClassDepartmentPo>> quire(StudentsInfo StudentsInfo){
        List<StudentClassDepartmentPo> list = studentsInfoService.quire(StudentsInfo);
        return inbound(list,"查询成功");
    }
}
