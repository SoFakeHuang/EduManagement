package cn.hhj.po;

import cn.hhj.pojo.Class;
import cn.hhj.pojo.Course;
import cn.hhj.pojo.TeachersInfo;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/5 10:38
 * @Version 1.0
 */
public class TeacherCourseClassPo {
    private Integer id;

    private Integer teachers_info_id;

    private Integer course_id;

    private String years;

    private Integer semester;

    private Integer class_id;

    private String classroom;

    private String class_time;

    private Integer students_number;

    private Integer max_number;

    private Integer week;

    private Integer full;

    private Course course;

    private TeachersInfo teachersInfo;

    private Class aClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeachers_info_id() {
        return teachers_info_id;
    }

    public void setTeachers_info_id(Integer teachers_info_id) {
        this.teachers_info_id = teachers_info_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getClass_time() {
        return class_time;
    }

    public void setClass_time(String class_time) {
        this.class_time = class_time;
    }

    public Integer getStudents_number() {
        return students_number;
    }

    public void setStudents_number(Integer students_number) {
        this.students_number = students_number;
    }

    public Integer getMax_number() {
        return max_number;
    }

    public void setMax_number(Integer max_number) {
        this.max_number = max_number;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getFull() {
        return full;
    }

    public void setFull(Integer full) {
        this.full = full;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public TeachersInfo getTeachersInfo() {
        return teachersInfo;
    }

    public void setTeachersInfo(TeachersInfo teachersInfo) {
        this.teachersInfo = teachersInfo;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
