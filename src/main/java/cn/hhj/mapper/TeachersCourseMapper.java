package cn.hhj.mapper;

import cn.hhj.po.TeacherCourseClassPo;
import cn.hhj.pojo.Course;
import cn.hhj.pojo.TeachersCourse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachersCourseMapper {
    Integer add(TeachersCourse teachersCourse);
    Integer deleteById(TeachersCourse teachersCourse);
    Integer update(TeachersCourse teachersCourse);
    List<TeachersCourse> quire(TeachersCourse teachersCourse);
    List<TeacherCourseClassPo> jointQuire(TeachersCourse teachersCourse);
    List<TeacherCourseClassPo> courseListQuire(@Param("teachersCourse") TeachersCourse teachersCourse,@Param("course") Course course);
}