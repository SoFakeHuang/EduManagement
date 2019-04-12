package cn.hhj.service;

import cn.hhj.pojo.Announcement;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 19:00
 * @Version 1.0
 */
public interface AnnouncementService {
    public Integer add(Announcement announcement);
    public Integer deleteById(Announcement announcement);
    public Integer update(Announcement announcement);
    public List<Announcement> quire(Announcement announcement);
}
