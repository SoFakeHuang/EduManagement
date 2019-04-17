package cn.hhj.mapper;

import cn.hhj.pojo.Class;
import java.util.List;

public interface ClassMapper {
    Integer add(Class c);
    Integer deleteById(Class c);
    Integer update(Class c);
    List<Class> quire(Class c);
}