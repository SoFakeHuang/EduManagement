package cn.hhj.service.impl;

import cn.hhj.mapper.TeachersInfoMapper;
import cn.hhj.po.TeacherDepartmentPo;
import cn.hhj.pojo.Department;
import cn.hhj.pojo.TeachersInfo;
import cn.hhj.service.TeachersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/13 13:35
 * @Version 1.0
 */
@Service("teachersInfoService")
public class TeachersInfoServiceImpl implements TeachersInfoService {
    @Autowired
    TeachersInfoMapper teachersInfoMapper;

    public Integer add(TeachersInfo teachersInfo) {
        return teachersInfoMapper.add(teachersInfo);
    }

    public Integer deleteById(TeachersInfo teachersInfo) {
        return teachersInfoMapper.deleteById(teachersInfo);
    }

    public Integer update(TeachersInfo teachersInfo) {
        return teachersInfoMapper.update(teachersInfo);
    }

    public List<TeachersInfo> quire(TeachersInfo teachersInfo) {
        return teachersInfoMapper.quire(teachersInfo);
    }

    public List<TeacherDepartmentPo> jointQuire(TeachersInfo teachersInfo, Department department) {
        return teachersInfoMapper.jointQuire(teachersInfo,department);
    }
}
