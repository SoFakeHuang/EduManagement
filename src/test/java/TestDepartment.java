import cn.hhj.mapper.DepartmentMapper;
import cn.hhj.pojo.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/16 9:56
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestDepartment {
        @Autowired
        DepartmentMapper departmentMapper;

        @Test
        public void add(){
            Department department = new Department();
            department.setName("信息工程学院");
            department.setIntroduce("信工啊");
            departmentMapper.add(department);
        }

        @Test
        public void deleteById(){
            Department department = new Department();
            department.setId(1);
            departmentMapper.deleteById(department);
        }

        @Test
        public void update(){
            Department department = new Department();
            department.setId(2);
            department.setIntroduce("打代码的");
            departmentMapper.update(department);
        }

        @Test
        public void quire(){
            Department department = new Department();
            department.setName("信息工程学院");
            System.out.println(departmentMapper.quire(department).get(0).getIntroduce());
        }
}
