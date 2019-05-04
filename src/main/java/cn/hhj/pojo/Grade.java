package cn.hhj.pojo;

public class Grade {
    private Integer id;

    private Integer grade;

    private Integer students_info_id;

    private Integer teachers_course_id;

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

    public void setStudents_info_id(Integer students_infoId) {
        this.students_info_id = students_infoId;
    }

    public Integer getTeachers_course_id() {
        return teachers_course_id;
    }

    public void setTeachers_course_id(Integer teachers_courseId) {
        this.teachers_course_id = teachers_courseId;
    }
}