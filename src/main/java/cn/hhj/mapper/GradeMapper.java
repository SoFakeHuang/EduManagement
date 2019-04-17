package cn.hhj.mapper;

import cn.hhj.pojo.Grade;
import java.util.List;

public interface GradeMapper {
    Integer add(Grade grade);
    Integer deleteById(Grade grade);
    Integer update(Grade grade);
    List<Grade> quire(Grade grade);
}