package cn.hhj.mapper;

import cn.hhj.pojo.Course;
import java.util.List;

public interface CourseMapper {
    Integer add(Course course);
    Integer deleteById(Course course);
    Integer update(Course course);
    List<Course> quire(Course course);
}