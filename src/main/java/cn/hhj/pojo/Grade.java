package cn.hhj.pojo;

public class Grade {
    private Integer id;

    private Integer grade;

    private Integer studentsInfoId;

    private Integer teachersCourseId;

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

    public Integer getStudentsInfoId() {
        return studentsInfoId;
    }

    public void setStudentsInfoId(Integer studentsInfoId) {
        this.studentsInfoId = studentsInfoId;
    }

    public Integer getTeachersCourseId() {
        return teachersCourseId;
    }

    public void setTeachersCourseId(Integer teachersCourseId) {
        this.teachersCourseId = teachersCourseId;
    }
}