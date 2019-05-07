package cn.hhj.po;

import cn.hhj.pojo.Course;
import cn.hhj.pojo.StudentsInfo;
import cn.hhj.pojo.TeachersCourse;
import cn.hhj.pojo.TeachersInfo;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/7 17:33
 * @Version 1.0
 */
public class GradeStudentsTeacherCoursePo {
    private Integer id;

    private Integer grade;

    private Integer students_info_id;

    private Integer teachers_course_id;

    private StudentsInfo studentsInfo;

    private TeachersInfo teachersInfo;

    private Course course;

    private TeachersCourse teachersCourse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getStudents_info_id() {
        return students_info_id;
    }

    public void setStudents_info_id(Integer students_info_id) {
        this.students_info_id = students_info_id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getTeachers_course_id() {
        return teachers_course_id;
    }

    public void setTeachers_course_id(Integer teachers_course_id) {
        this.teachers_course_id = teachers_course_id;
    }

    public StudentsInfo getStudentsInfo() {
        return studentsInfo;
    }

    public void setStudentsInfo(StudentsInfo studentsInfo) {
        this.studentsInfo = studentsInfo;
    }

    public TeachersInfo getTeachersInfo() {
        return teachersInfo;
    }

    public void setTeachersInfo(TeachersInfo teachersInfo) {
        this.teachersInfo = teachersInfo;
    }

    public TeachersCourse getTeachersCourse() {
        return teachersCourse;
    }

    public void setTeachersCourse(TeachersCourse teachersCourse) {
        this.teachersCourse = teachersCourse;
    }
}
