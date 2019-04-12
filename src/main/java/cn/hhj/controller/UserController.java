package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.pojo.User;
import cn.hhj.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    /**
     * 用户登陆，根据用户类型返回对应页面
     * @param user
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session){
        if(user.getAccount() == null || user.getPassword() == null)
            return "login";
        PageHelper.startPage(0,10);
        List<User> userList = userService.quireByAccountPassWord(user);
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        //账号密码正确且只有一个用户
        if(userList.size() == 1){
            session.setAttribute("user", userList.get(0));
            model.addAttribute("user",userList.get(0).getAccount());
            //model.addAttribute("user",pageInfo);
            model.addAttribute("msg",BaseInfo.SUCCESS);
            switch (userList.get(0).getType()){
                case 0:
                    return "index_admin";
                case 1:
                    return "index_teacher";
                case 2:
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
}
