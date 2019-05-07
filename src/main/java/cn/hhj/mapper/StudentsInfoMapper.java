package cn.hhj.mapper;

import cn.hhj.po.StudentClassDepartmentPo;
import cn.hhj.pojo.StudentsInfo;
import java.util.List;

public interface StudentsInfoMapper {
    Integer add(StudentsInfo studentsInfo);
    Integer deleteById(StudentsInfo studentsInfo);
    Integer update(StudentsInfo studentsInfo);
    List<StudentsInfo> quire(StudentsInfo studentsInfo);
    List<StudentClassDepartmentPo> jointQuire(StudentsInfo studentsInfo);
}