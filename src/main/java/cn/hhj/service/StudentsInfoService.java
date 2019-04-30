package cn.hhj.service;

import cn.hhj.po.StudentClassDepartmentPo;
import cn.hhj.pojo.StudentsInfo;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 23:26
 * @Version 1.0
 */
public interface StudentsInfoService {
    public Integer add(StudentsInfo studentsInfo);
    public Integer deleteById(StudentsInfo studentsInfo);
    public Integer update(StudentsInfo studentsInfo);
    public List<StudentClassDepartmentPo> quire(StudentsInfo studentsInfo);
}
