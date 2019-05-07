package cn.hhj.service.impl;

import cn.hhj.mapper.GradeMapper;
import cn.hhj.po.GradeStudentsTeacherCoursePo;
import cn.hhj.pojo.Grade;
import cn.hhj.pojo.TeachersCourse;
import cn.hhj.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/7 23:34
 * @Version 1.0
 */
@Service("gradeService")
public class GradeServiceImpl implements GradeService {

    @Autowired
    GradeMapper gradeMapper;

    public Integer add(Grade grade) {
        return gradeMapper.add(grade);
    }

    public Integer deleteById(Grade grade) {
        return gradeMapper.deleteById(grade);
    }

    public Integer update(Grade grade) {
        return gradeMapper.update(grade);
    }

    public List<Grade> quire(Grade grade) {
        return gradeMapper.quire(grade);
    }

    public List<GradeStudentsTeacherCoursePo> jointQuire(Grade grade, TeachersCourse teachersCourse) {
        return gradeMapper.jointQuire(grade,teachersCourse);
    }
}
