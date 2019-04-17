package cn.hhj.mapper;

import cn.hhj.pojo.Announcement;

import java.util.List;

public interface AnnouncementMapper {
    Integer add(Announcement announcement);
    Integer deleteById(Announcement announcement);
    Integer update(Announcement announcement);
    List<Announcement> quire(Announcement announcement);
}