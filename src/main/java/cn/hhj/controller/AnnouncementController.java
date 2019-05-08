package cn.hhj.controller;

import cn.hhj.ResponsResult;
import cn.hhj.pojo.Announcement;
import cn.hhj.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/4/12 18:04
 * @Version 1.0
 */

@Controller
@RequestMapping("/announcement")
public class AnnouncementController extends BaseController{

    @Autowired
    AnnouncementService announcementService;

    @RequestMapping("/add")
    public ResponsResult<Announcement> add(Announcement announcement){
        try {
            Integer i = announcementService.add(announcement);
            if(i == 1){
                return inbound(null,"添加成功");
            }else {
                return failHandler("添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return errorHandler(e);
        }
    }
    @RequestMapping("/delete")
    public ResponsResult<Announcement> delete(Announcement announcement){
        Integer i = announcementService.deleteById(announcement);
        if(i == 1){
            return inbound(null,"删除成功");
        }else {
            return failHandler("删除失败");
        }
    }

    @RequestMapping("/update")
    public ResponsResult<Announcement> update(Announcement announcement){
        Integer i = announcementService.update(announcement);
        if(i == 1){
            return inbound(null,"更新成功");
        }else {
            return failHandler("更新失败");
        }
    }

    @RequestMapping("/quireAll")
    @ResponseBody
    public ResponsResult<List<Announcement>> quireAll(Announcement announcement){
        List<Announcement> list = announcementService.quire(announcement);
        return inbound(list,"查询成功");
    }
}
