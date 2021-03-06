import cn.hhj.mapper.GradeMapper;
import cn.hhj.pojo.Grade;
import cn.hhj.pojo.TeachersCourse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/17 9:40
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestGrade {
    @Autowired
    GradeMapper gradeMapper;

    @Test
    public void add(){
        Grade grade = new Grade();
        grade.setGrade(80);
        grade.setStudents_info_id(2);
        grade.setTeachers_course_id(1);
        gradeMapper.add(grade);
    }

    @Test
    public void deleteById(){
        Grade grade = new Grade();
        grade.setId(1);
        gradeMapper.deleteById(grade);
    }

    @Test
    public void update(){
        Grade grade = new Grade();
        grade.setId(1);
        grade.setGrade(85);
        gradeMapper.update(grade);
    }

    @Test
    public void quire(){
        Grade grade = new Grade();
        grade.setStudents_info_id(2);
        System.out.println(gradeMapper.quire(grade).get(0).getGrade());
    }

    @Test
    public void jointQuire(){
        Grade grade = new Grade();
        grade.setStudents_info_id(2);
        TeachersCourse teachersCourse = new TeachersCourse();
        teachersCourse.setSemester(2);
        System.out.println(gradeMapper.jointQuire(grade,teachersCourse).get(0).getGrade());
    }
}
