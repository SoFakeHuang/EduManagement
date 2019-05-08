package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.ResponsResult;
import cn.hhj.po.StudentClassDepartmentPo;
import cn.hhj.pojo.Announcement;
import cn.hhj.pojo.StudentsInfo;
import cn.hhj.pojo.User;
import cn.hhj.service.AnnouncementService;
import cn.hhj.service.StudentsInfoService;
import cn.hhj.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @Autowired
    private StudentsInfoService studentsInfoService;

    @Autowired
    private AnnouncementService announcementService;

    /**
     * 用户登陆，根据用户类型返回对应页面,并且查询对应基础信息
     * @param user
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session){
        if(user.getAccount() == null || user.getPassword() == null)
            return "redirect:/login/login.jsp";
        List<User> userList = userService.quireByAccountPassWord(user);
        //账号密码正确且只有一个用户
        if(userList.size() == 1){
            //账号密码正确，将用户信息存入session，用于后续用户相关操作
            session.setAttribute(BaseInfo.USER, userList.get(0));
            //查询公告，并放入model
            List<Announcement> announcementList = announcementService.quire(new Announcement());
            model.addAttribute("announcementList",announcementList);
            //根据用户类型返回对应页面，并查询基础信息
            switch (userList.get(0).getType()){
                case 0:
                    return "index_admin";
                case 1:
                    return "index_teacher";
                case 2:
                    StudentsInfo studentsInfo = new StudentsInfo();
                    studentsInfo.setUser_id(userList.get(0).getId());
                    //查询基础信息并存入model
                    model.addAttribute("studentClassDepartmentPo",studentsInfoService.jointQuire(studentsInfo).get(0));
                    return "index";
                default:
                    model.addAttribute("msg","用户类型不明确");
                    return "redirect:/login/login.jsp";
            }
        }else{
            model.addAttribute("msg", BaseInfo.FAIL);
            return "redirect:/login/login.jsp";
        }
    }

    @RequestMapping("/indexInfo")
    public String indexInfo(HttpSession session, Model model){
        User user = (User)session.getAttribute(BaseInfo.USER);
        Object userInfo = userService.quireUserInfo(user);

        //查询公告，并放入model
        List<Announcement> announcementList = announcementService.quire(new Announcement());
        model.addAttribute("announcementList",announcementList);
        switch (user.getType()){
            case 0:
            case 1:
            case 2:
                StudentClassDepartmentPo studentClassDepartmentPo = (StudentClassDepartmentPo)userInfo;
                model.addAttribute("studentClassDepartmentPo",studentClassDepartmentPo);
                return "index";
            default:
                return "redirect:/login/login.jsp";
        }
    }

}
