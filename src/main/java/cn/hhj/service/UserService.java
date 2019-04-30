package cn.hhj.service;

import cn.hhj.pojo.User;

import java.util.List;

public interface UserService {
    List<User> quireByAccountPassWord(User user);
    Object quireUserInfo(User user);
}
