package cn.hhj.service.impl;

import cn.hhj.mapper.TeachersCourseMapper;
import cn.hhj.po.TeacherCourseClassPo;
import cn.hhj.pojo.Course;
import cn.hhj.pojo.TeachersCourse;
import cn.hhj.service.TeachersCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/4 15:11
 * @Version 1.0
 */
@Service("teachersCourseService")
public class TeachersCourseServiceImpl implements TeachersCourseService {

    @Autowired
    TeachersCourseMapper teachersCourseMapper;

    public Integer add(TeachersCourse teachersCourse) {
        return null;
    }

    public Integer deleteById(TeachersCourse teachersCourse) {
        return null;
    }

    public Integer update(TeachersCourse teachersCourse) {
        return null;
    }

    public List<TeachersCourse> quire(TeachersCourse teachersCourse) {
        return teachersCourseMapper.quire(teachersCourse);
    }

    public List<TeachersCourse> quireByClassId(Integer classId){
        TeachersCourse teachersCourse = new TeachersCourse();
        teachersCourse.setClass_id(classId);
        return teachersCourseMapper.quire(teachersCourse);
    }

    public List<TeacherCourseClassPo> jointQuire(TeachersCourse teachersCourse) {
        return teachersCourseMapper.jointQuire(teachersCourse);
    }

    public List<TeacherCourseClassPo> courseListQuire(TeachersCourse teachersCourse,Course course) {
        return teachersCourseMapper.courseListQuire(teachersCourse,course);
    }
}
