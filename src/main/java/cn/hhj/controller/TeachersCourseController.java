package cn.hhj.controller;

import cn.hhj.ResponsResult;
import cn.hhj.mapper.ClassMapper;
import cn.hhj.po.TeacherCourseClassPo;
import cn.hhj.pojo.Class;
import cn.hhj.pojo.Course;
import cn.hhj.pojo.TeachersCourse;
import cn.hhj.service.TeachersCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/4 14:44
 * @Version 1.0
 */
@Controller
@RequestMapping("/teachersCourse")
public class TeachersCourseController extends BaseController{

    @Autowired
    ClassMapper classMapper;

    @Autowired
    TeachersCourseService teachersCourseService;

    /**
     * 根据班级名称查询对应的课程表
     * @param className
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public ResponsResult<List<TeacherCourseClassPo>> list(@RequestBody String className){
        Class aClass = new Class();
        aClass.setName(className);
        //查询是否存在该班级
        List<Class> classList = classMapper.quire(aClass);
        if(classList.size() != 1)
            return failHandler("班级名不存在或存在多个");

        TeachersCourse teachersCourse = new TeachersCourse();
        teachersCourse.setClass_id(classList.get(0).getId());
        List<TeacherCourseClassPo> courseList = teachersCourseService.jointQuire(teachersCourse);

        return inbound(courseList,"查询成功");
    }

    @RequestMapping("/electiveList")
    public String electiveList(Model model){
        TeachersCourse teachersCourse = new TeachersCourse();
        teachersCourse.setFull(0);
        Course course = new Course();
        course.setType("选修");
        List<TeacherCourseClassPo> courseList = teachersCourseService.courseListQuire(teachersCourse, course);
        model.addAttribute("courseList",courseList);
        return "elcourse";
    }
}
