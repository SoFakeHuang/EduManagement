import cn.hhj.mapper.TeachersInfoMapper;
import cn.hhj.pojo.TeachersInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/16 15:47
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestTeachersInfo {
    @Autowired
    TeachersInfoMapper teachersInfoMapper;

    @Test
    public void add(){
        TeachersInfo teachersInfo = new TeachersInfo();
        teachersInfo.setName("惠咸");
        teachersInfo.setDepartmentId(2);
        teachersInfo.setUserId(2);
        teachersInfo.setSex("女");
        teachersInfoMapper.add(teachersInfo);
    }

    @Test
    public void deleteById(){
        TeachersInfo teachersInfo = new TeachersInfo();
        teachersInfo.setId(1);
        teachersInfoMapper.deleteById(teachersInfo);
    }

    @Test
    public void update(){
        TeachersInfo teachersInfo = new TeachersInfo();
        teachersInfo.setId(2);
        teachersInfo.setPhone("15305855229");
        teachersInfo.setTeacherNumber("001");
        teachersInfoMapper.update(teachersInfo);
    }

    @Test
    public void quire(){
        TeachersInfo teachersInfo = new TeachersInfo();
        teachersInfo.setName("惠咸");
        System.out.println(teachersInfoMapper.quire(teachersInfo).get(0).getName());
    }
}
