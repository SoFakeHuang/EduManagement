import cn.hhj.mapper.CourseMapper;
import cn.hhj.pojo.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/16 15:30
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestCourse {
    @Autowired
    CourseMapper courseMapper;

    @Test
    public void add(){
        Course course = new Course();
        course.setName("Web");
        course.setHour(56);
        courseMapper.add(course);
    }

    @Test
    public void deleteById(){
        Course course = new Course();
        course.setId(1);
        courseMapper.deleteById(course);
    }

    @Test
    public void update(){
        Course course = new Course();
        course.setId(2);
        course.setType("必修");
        course.setIntroduce("web课程啊");
        courseMapper.update(course);
    }

    @Test
    public void quire(){
        Course course = new Course();
        course.setType("必修");
        System.out.println(courseMapper.quire(course).get(0).getName());
    }
}
