package cn.hhj.controller;

import cn.hhj.ResponsResult;
import cn.hhj.mapper.ClassMapper;
import cn.hhj.pojo.Class;
import cn.hhj.pojo.TeachersCourse;
import cn.hhj.service.TeachersCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/list")
    @ResponseBody
    public ResponsResult<List<TeachersCourse>> list(@RequestBody String className){
        Class aClass = new Class();
        aClass.setName(className);
        List<Class> classList = classMapper.quire(aClass);
        if(classList.size() != 1)
            return failHandler("班级名不存在或存在多个");

        List<TeachersCourse> courseList = teachersCourseService.quireByClassId(classList.get(0).getId());

        return inbound(courseList,"查询成功");
    }
}
