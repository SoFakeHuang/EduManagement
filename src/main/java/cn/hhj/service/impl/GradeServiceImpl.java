package cn.hhj.service.impl;

import cn.hhj.mapper.GradeMapper;
import cn.hhj.po.GradeStudentsTeacherCoursePo;
import cn.hhj.pojo.Grade;
import cn.hhj.pojo.TeachersCourse;
import cn.hhj.pojo.TeachersInfo;
import cn.hhj.service.GradeService;
import cn.hhj.service.TeachersCourseService;
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

    @Autowired
    TeachersCourseService teachersCourseService;

    public Integer add(Grade grade) {
        return gradeMapper.add(grade);
    }

    public Integer deleteById(Grade grade) {
        return gradeMapper.deleteById(grade);
    }

    //修改学生成绩，课程和学生id有误返回-1，教师不是该课程任课老师返回-2，sql执行失败返回0，成功返回1
    public Integer update(Grade grade, TeachersInfo teachersInfo) {
        Grade g1 = new Grade();
        g1.setId(grade.getId());
        g1.setTeachers_course_id(grade.getTeachers_course_id());
        g1.setStudents_info_id(grade.getStudents_info_id());
        List<GradeStudentsTeacherCoursePo> gradeList = gradeMapper.jointQuire(g1,new TeachersCourse());
        //查无此成绩信息
        if(gradeList.isEmpty())
            return -1;

        //查询该教师是否为该课程的任课老师，如果不是则没有权限修改该课程学生的成绩,返回-2
        TeachersCourse t1 = new TeachersCourse();
        t1.setId(grade.getTeachers_course_id());
        TeachersCourse teachersCourse = teachersCourseService.quire(t1).get(0);
        if(teachersCourse.getTeachers_info_id() != teachersInfo.getId())
            return -2;

        return gradeMapper.update(grade);
    }

    public Integer addElective(Grade grade) {
        if(!gradeMapper.quire(grade).isEmpty()){
            return -3;
        }
        TeachersCourse teachersCourse = new TeachersCourse();
        teachersCourse.setId(grade.getTeachers_course_id());
        List<TeachersCourse> list = teachersCourseService.quire(teachersCourse);
        if(list.isEmpty())
            return -1;
        if(list.get(0).getFull()==1)
            return -2;
        return add(grade);
    }

    public List<Grade> quire(Grade grade) {
        return gradeMapper.quire(grade);
    }

    public List<GradeStudentsTeacherCoursePo> jointQuire(Grade grade, TeachersCourse teachersCourse) {
        return gradeMapper.jointQuire(grade,teachersCourse);
    }
}
