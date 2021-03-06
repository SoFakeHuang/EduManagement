package cn.hhj.mapper;

import cn.hhj.po.TeacherDepartmentPo;
import cn.hhj.pojo.Department;
import cn.hhj.pojo.TeachersInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachersInfoMapper {
    Integer add(TeachersInfo teachersInfo);
    Integer deleteById(TeachersInfo teachersInfo);
    Integer update(TeachersInfo teachersInfo);
    List<TeachersInfo> quire(TeachersInfo teachersInfo);
    List<TeacherDepartmentPo> jointQuire(@Param("teachersInfo")TeachersInfo teachersInfo,@Param("department") Department department);
}