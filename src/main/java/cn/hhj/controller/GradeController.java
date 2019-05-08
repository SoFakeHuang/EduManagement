package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.ResponsResult;
import cn.hhj.mapper.GradeMapper;
import cn.hhj.po.GradeStudentsTeacherCoursePo;
import cn.hhj.pojo.Grade;
import cn.hhj.pojo.StudentsInfo;
import cn.hhj.pojo.TeachersCourse;
import cn.hhj.pojo.User;
import cn.hhj.service.GradeService;
import cn.hhj.service.StudentsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/7 17:12
 * @Version 1.0
 */
@Controller
@RequestMapping("/grade")
public class GradeController extends BaseController{
    @Autowired
    GradeService gradeService;

    @Autowired
    StudentsInfoService studentsInfoService;

    /**
     * 查询学生个人成绩
     * @param session
     * @param teachersCourse 学年和学期
     * @return
     */
    @RequestMapping("/personalGrade")
    @ResponseBody
    public ResponsResult<List<GradeStudentsTeacherCoursePo>> personalGrade(HttpSession session, @RequestBody TeachersCourse teachersCourse){
        //从session获取用户信息
        User user = (User)session.getAttribute(BaseInfo.USER);
        StudentsInfo s1 = new StudentsInfo();
        //根据用户id查询到学生信息id
        s1.setUser_id(user.getId());
        StudentsInfo studentsInfo = studentsInfoService.quire(s1).get(0);
        //用grade包装数据
        Grade grade = new Grade();
        grade.setStudents_info_id(studentsInfo.getId());
        //查询学生个人成绩
        List<GradeStudentsTeacherCoursePo> list = gradeService.jointQuire(grade,teachersCourse);
        return inbound(list,"查询成功");
    }


}
