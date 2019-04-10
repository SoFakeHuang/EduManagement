import cn.hhj.mapper.UserMapper;
import cn.hhj.pojo.User;
import cn.hhj.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestUser {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;
    @Test
    public void testQuire(){
        User user = new User();
        user.setAccount("123");
        user.setPassword("123");
        List<User> list = userMapper.quireByAccountPassWord(user);
        System.out.println(list.get(0).getAccount()+" "+list.get(0).getPassword());
    }
    @Test
    public void testServiceQuire(){
        User user = new User();
        user.setAccount("123");
        user.setPassword("123");
        List<User> list = userService.quireByAccountPassWord(user);
        System.out.println("userService:"+list.get(0).getAccount()+" "+list.get(0).getPassword());
    }
}
