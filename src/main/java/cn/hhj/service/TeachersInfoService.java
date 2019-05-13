package cn.hhj.service;

import cn.hhj.po.TeacherDepartmentPo;
import cn.hhj.pojo.Department;
import cn.hhj.pojo.TeachersInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/13 13:35
 * @Version 1.0
 */
public interface TeachersInfoService {
    Integer add(TeachersInfo teachersInfo);
    Integer deleteById(TeachersInfo teachersInfo);
    Integer update(TeachersInfo teachersInfo);
    List<TeachersInfo> quire(TeachersInfo teachersInfo);
    List<TeacherDepartmentPo> jointQuire(@Param("teachersInfo") TeachersInfo teachersInfo, @Param("department") Department department);
}
