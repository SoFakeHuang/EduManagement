import cn.hhj.mapper.TeachersCourseMapper;
import cn.hhj.pojo.TeachersCourse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/16 19:54
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestTeacherCourse {
    @Autowired
    TeachersCourseMapper teachersCourseMapper;

    @Test
    public void add(){
        TeachersCourse teachersInfo = new TeachersCourse();
        teachersInfo.setCourseId(2);
        teachersInfo.setTeachersInfoId(2);
        teachersInfo.setYears("2018-2019");
        teachersInfo.setSemester(2);
        teachersInfo.setClassId(5);
        teachersInfo.setClassroom("3301");
        teachersInfo.setClassTime("星期二 1-3节");
        teachersInfo.setStudentsNumber(60);
        teachersInfo.setMaxNumber(130);
        teachersCourseMapper.add(teachersInfo);
    }

    @Test
    public void deleteById(){
        TeachersCourse teachersInfo = new TeachersCourse();
        teachersInfo.setId(1);
        teachersCourseMapper.deleteById(teachersInfo);
    }

    @Test
    public void update(){
        TeachersCourse teachersInfo = new TeachersCourse();
        teachersInfo.setId(1);
        teachersInfo.setMaxNumber(200);
        teachersCourseMapper.update(teachersInfo);
    }

    @Test
    public void quire(){
        TeachersCourse teachersInfo = new TeachersCourse();
        teachersInfo.setClassId(5);
        System.out.println(teachersCourseMapper.quire(teachersInfo).get(0).getClassroom());
    }
}
