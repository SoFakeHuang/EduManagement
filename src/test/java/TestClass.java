import cn.hhj.mapper.ClassMapper;
import cn.hhj.pojo.Class;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/16 10:18
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestClass {
    @Autowired
    ClassMapper classMapper;

    @Test
    public void add(){
        Class aClass = new Class();
        aClass.setName("计算机");
        aClass.setStudents_number(60);
        aClass.setDepartment_id(2);
        classMapper.add(aClass);
    }

    @Test
    public void deleteById(){
        Class aClass = new Class();
        aClass.setId(4);
        classMapper.deleteById(aClass);
    }

    @Test
    public void update(){
        Class aClass = new Class();
        aClass.setId(5);
        aClass.setName("16计算机");
        classMapper.update(aClass);
    }

    @Test
    public void quire(){
        Class aClass = new Class();
        aClass.setName("16计算机");
        System.out.println(classMapper.quire(aClass).get(0).getName());
    }
}
