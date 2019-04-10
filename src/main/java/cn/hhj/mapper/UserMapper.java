package cn.hhj.mapper;

import cn.hhj.pojo.User;
import java.util.List;

public interface UserMapper {
    public List<User> quireByAccountPassWord(User user);
}