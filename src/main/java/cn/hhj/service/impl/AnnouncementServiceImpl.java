package cn.hhj.service.impl;

import cn.hhj.mapper.AnnouncementMapper;
import cn.hhj.pojo.Announcement;
import cn.hhj.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 19:03
 * @Version 1.0
 */
@Service("announcementService")
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementMapper announcementMapper;

    public Integer add(Announcement announcement) {
        return announcementMapper.add(announcement);
    }

    public Integer deleteById(Announcement announcement) {
        return announcementMapper.deleteById(announcement);
    }

    public Integer update(Announcement announcement) {
        return announcementMapper.update(announcement);
    }

    public List<Announcement> quire(Announcement announcement) {
        return announcementMapper.quire(announcement);
    }
}
