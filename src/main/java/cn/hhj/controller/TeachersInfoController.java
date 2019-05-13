package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.pojo.TeachersInfo;
import cn.hhj.pojo.User;
import cn.hhj.service.TeachersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: SoFakeHuang
 * @Date: 2019/5/13 15:12
 * @Version 1.0
 */
@Controller
@RequestMapping("/teachersInfo")
public class TeachersInfoController {

    @Autowired
    TeachersInfoService teachersInfoService;

    @RequestMapping("/personalTeachersInfo")
    public String personalTeachersInfo(HttpSession session, Model model){
        TeachersInfo t1 = new TeachersInfo();
        t1.setUser_id(((User)session.getAttribute(BaseInfo.USER)).getId());
        TeachersInfo teachersInfo = teachersInfoService.quire(t1).get(0);
        model.addAttribute("teachersInfo",teachersInfo);
        return "info_teacher";
    }
}
