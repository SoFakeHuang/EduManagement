package cn.hhj.controller;

import cn.hhj.BaseInfo;
import cn.hhj.ResponsResult;
import cn.hhj.po.StudentClassDepartmentPo;
import cn.hhj.pojo.StudentsInfo;
import cn.hhj.pojo.User;
import cn.hhj.service.StudentsInfoService;
import cn.hhj.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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

    /**
     * 用户登陆，根据用户类型返回对应页面,并且查询对应基础信息
     * @param user
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session){
        if(user.getAccount() == null || user.getPassword() == null)
            return "redirect:/login/login.jsp";
        List<User> userList = userService.quireByAccountPassWord(user);
        //账号密码正确且只有一个用户
        if(userList.size() == 1){
            //账号密码正确，将用户信息存入session，用于后续用户相关操作
            session.setAttribute("user", userList.get(0));
            //返回成功信息
            model.addAttribute("msg",BaseInfo.SUCCESS);
            //根据用户类型返回对应页面，并查询基础信息
            switch (userList.get(0).getType()){
                case 0:
                    return "index_admin";
                case 1:
                    return "index_teacher";
                case 2:
                    StudentsInfo studentsInfo = new StudentsInfo();
                    studentsInfo.setUserId(userList.get(0).getId());
                    //查询基础信息并存入model
                    model.addAttribute("studentClassDepartmentPo",studentsInfoService.quire(studentsInfo).get(0));
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
    @ResponseBody
    public ResponsResult indexInfo(HttpSession session){
        User user = (User)session.getAttribute(BaseInfo.USER);
        if(user == null)
            return inbound(null,"用户会话为空");
        Object userInfo = userService.quireUserInfo(user);
        switch (user.getType()){
            case 0:
            case 1:
            case 2:
                StudentClassDepartmentPo studentClassDepartmentPo = (StudentClassDepartmentPo)userInfo;
                return inbound(studentClassDepartmentPo,"学生首页基本信息查询成功");
            default:
                return inbound(null,"用户类型错误");
        }
    }
}
