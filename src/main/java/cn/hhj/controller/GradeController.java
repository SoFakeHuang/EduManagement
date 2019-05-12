package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.ResponsResult;
import cn.hhj.mapper.TeachersInfoMapper;
import cn.hhj.po.GradeStudentsTeacherCoursePo;
import cn.hhj.po.TeacherCourseClassPo;
import cn.hhj.pojo.*;
import cn.hhj.service.GradeService;
import cn.hhj.service.StudentsInfoService;
import cn.hhj.service.TeachersCourseService;
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

    @Autowired
    TeachersInfoMapper teachersInfoMapper;

    @Autowired
    TeachersCourseService teachersCourseService;

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
        Grade grade = PackageGradeByUserId(session);
        //查询学生个人成绩
        List<GradeStudentsTeacherCoursePo> list = gradeService.jointQuire(grade,teachersCourse);
        return inbound(list,"查询成功");
    }

    /**
     * 学生个人选课，根据接收的课程id，判断课程是否已满，未满则填入grade表，课程人数+1
     * @param session
     * @param teachers_course_id
     * @return
     */
    @RequestMapping("/addElective")
    @ResponseBody
    public ResponsResult addElective(HttpSession session,@RequestBody Integer teachers_course_id){
        Grade grade = PackageGradeByUserId(session);
        grade.setTeachers_course_id(teachers_course_id);
        int i = gradeService.addElective(grade);
        switch (i){
            case -1: return failHandler("查无此课程");
            case -2: return failHandler("此课程已满");
            case -3: return failHandler("重复选择该课程");
            case 0: return failHandler("sql语句执行失败");
            case 1: return inbound(null,"选课成功");
            default:return failHandler("未知错误");
        }
    }

    @RequestMapping("/GradeAdd")
    public String gradeAdd(HttpSession session, Model model){
        TeachersInfo t1 = new TeachersInfo();
        //从session获取userID放入TeachersInfo对象
        t1.setUser_id(((User)session.getAttribute(BaseInfo.USER)).getId());
        //根据userID查询TeachersInfo信息
        TeachersInfo teachersInfo = teachersInfoMapper.quire(t1).get(0);
        TeachersCourse teachersCourse = new TeachersCourse();
        teachersCourse.setTeachers_info_id(teachersInfo.getId());
        //根据TeachersInfoID查询对应教师的课程
        List<TeacherCourseClassPo> courseList = teachersCourseService.jointQuire(teachersCourse);
        model.addAttribute("courseList", courseList);
        return "gradeadd_teacher";
    }

    //从session取出user数据，查询studentsInfo_id并用grade封装
    public Grade PackageGradeByUserId(HttpSession session){
        User user = (User)session.getAttribute(BaseInfo.USER);
        StudentsInfo s1 = new StudentsInfo();
        //根据用户id查询到学生信息id
        s1.setUser_id(user.getId());
        StudentsInfo studentsInfo = studentsInfoService.quire(s1).get(0);
        //用grade封装数据
        Grade grade = new Grade();
        grade.setStudents_info_id(studentsInfo.getId());
        return grade;
    }

}
