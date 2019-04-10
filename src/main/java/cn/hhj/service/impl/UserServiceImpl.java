package cn.hhj.service.impl;

import cn.hhj.mapper.UserMapper;
import cn.hhj.pojo.User;
import cn.hhj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> quireByAccountPassWord(User user) {
        return userMapper.quireByAccountPassWord(user);
    }
}
