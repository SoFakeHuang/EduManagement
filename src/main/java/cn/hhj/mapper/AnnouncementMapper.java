package cn.hhj.mapper;

import cn.hhj.pojo.Announcement;

import java.util.List;

public interface AnnouncementMapper {
    public Integer add(Announcement announcement);
    public Integer deleteById(Announcement announcement);
    public Integer update(Announcement announcement);
    public List<Announcement> quire(Announcement announcement);
}