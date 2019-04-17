package cn.hhj.mapper;

import cn.hhj.pojo.TeachersCourse;
import java.util.List;

public interface TeachersCourseMapper {
    Integer add(TeachersCourse teachersCourse);
    Integer deleteById(TeachersCourse teachersCourse);
    Integer update(TeachersCourse teachersCourse);
    List<TeachersCourse> quire(TeachersCourse teachersCourse);
}