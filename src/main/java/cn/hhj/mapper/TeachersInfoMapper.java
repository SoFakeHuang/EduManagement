package cn.hhj.mapper;

import cn.hhj.pojo.TeachersInfo;

import java.util.List;

public interface TeachersInfoMapper {
    Integer add(TeachersInfo teachersInfo);
    Integer deleteById(TeachersInfo teachersInfo);
    Integer update(TeachersInfo teachersInfo);
    List<TeachersInfo> quire(TeachersInfo teachersInfo);
}