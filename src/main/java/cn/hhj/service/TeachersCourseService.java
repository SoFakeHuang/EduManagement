package cn.hhj.service;

import cn.hhj.po.TeacherCourseClassPo;
import cn.hhj.pojo.Course;
import cn.hhj.pojo.TeachersCourse;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/4 15:10
 * @Version 1.0
 */
public interface TeachersCourseService {
    Integer add(TeachersCourse teachersCourse);
    Integer deleteById(TeachersCourse teachersCourse);
    Integer update(TeachersCourse teachersCourse);
    List<TeachersCourse> quire(TeachersCourse teachersCourse);
    List<TeachersCourse> quireByClassId(Integer classId);
    //联表查询
    List<TeacherCourseClassPo> jointQuire(TeachersCourse teachersCourse);
    //根据课程的信息来查询课程，比如课程类型，课程时长
    List<TeacherCourseClassPo> courseListQuire(TeachersCourse teachersCourse, Course course);
}
