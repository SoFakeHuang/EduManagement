package cn.hhj.service;

import cn.hhj.po.GradeStudentsTeacherCoursePo;
import cn.hhj.pojo.Grade;
import cn.hhj.pojo.TeachersCourse;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/7 23:33
 * @Version 1.0
 */
public interface GradeService {
    Integer add(Grade grade);
    Integer deleteById(Grade grade);
    Integer update(Grade grade);
    List<Grade> quire(Grade grade);
    List<GradeStudentsTeacherCoursePo> jointQuire(Grade grade, TeachersCourse teachersCourse);
}
