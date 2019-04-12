import cn.hhj.mapper.AnnouncementMapper;
import cn.hhj.mapper.UserMapper;
import cn.hhj.pojo.Announcement;
import cn.hhj.pojo.User;
import cn.hhj.service.AnnouncementService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 19:08
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestAnnouncement {
    @Autowired
    AnnouncementMapper announcementMapper;

    @Autowired
    AnnouncementService announcementService;

    @Test
    public void add(){
        Announcement announcement = new Announcement();
        announcement.setText("test add announcement");
        announcement.setTittle("Test");
        announcementMapper.add(announcement);
    }

    @Test
    public void deleteById(){
        Announcement announcement = new Announcement();
        announcement.setId(7);
        announcementMapper.deleteById(announcement);
    }

    @Test
    public void update(){
        Announcement announcement = new Announcement();
        announcement.setId(2);
        announcement.setText("sad");
        announcement.setTittle("2");
        announcementMapper.update(announcement);
    }

    @Test
    public void quire(){
        Announcement announcement = new Announcement();
        announcement.setId(2);
        announcement.setText("sad");
        announcement.setTittle("2");
        System.out.println(announcementMapper.quire(announcement).get(0).getText());
    }
}
