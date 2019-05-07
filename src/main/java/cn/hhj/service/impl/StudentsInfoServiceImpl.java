package cn.hhj.service.impl;

import cn.hhj.mapper.StudentsInfoMapper;
import cn.hhj.po.StudentClassDepartmentPo;
import cn.hhj.pojo.StudentsInfo;
import cn.hhj.service.StudentsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 23:28
 * @Version 1.0
 */
@Service("studentsInfoService")
public class StudentsInfoServiceImpl implements StudentsInfoService {

    @Autowired
    private StudentsInfoMapper studentsInfoMapper;

    public Integer add(StudentsInfo studentsInfo) {
        return studentsInfoMapper.add(studentsInfo);
    }

    public Integer deleteById(StudentsInfo studentsInfo) {
        return studentsInfoMapper.deleteById(studentsInfo);
    }

    public Integer update(StudentsInfo studentsInfo) {
        return studentsInfoMapper.update(studentsInfo);
    }

    public List<StudentsInfo> quire(StudentsInfo studentsInfo) {
        return studentsInfoMapper.quire(studentsInfo);
    }

    public List<StudentClassDepartmentPo> jointQuire(StudentsInfo studentsInfo) {
        return studentsInfoMapper.jointQuire(studentsInfo);
    }
}
