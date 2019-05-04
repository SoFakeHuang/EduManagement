package cn.hhj.service.impl;

import cn.hhj.mapper.StudentsInfoMapper;
import cn.hhj.mapper.UserMapper;
import cn.hhj.po.StudentClassDepartmentPo;
import cn.hhj.pojo.StudentsInfo;
import cn.hhj.pojo.User;
import cn.hhj.service.StudentsInfoService;
import cn.hhj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StudentsInfoMapper studentsInfoMapper;

    public List<User> quireByAccountPassWord(User user) {
        return userMapper.quireByAccountPassWord(user);
    }

    public Object quireUserInfo(User user) {

        switch(user.getType()){
            case 2:
                StudentsInfo studentsInfo = new StudentsInfo();
                studentsInfo.setUser_id(user.getId());
                return studentsInfoMapper.quire(studentsInfo).get(0);
            default:
                return null;
        }
    }
}
