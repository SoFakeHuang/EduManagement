package cn.hhj.interceptor;

import cn.hhj.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 方法耗时统计拦截器
 */
public class MethodTimerInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodTimerInterceptor.class);

    //前置功能
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //定义开始时间
        long start = System.currentTimeMillis();
        //将开始时间放入请求域
        request.setAttribute("start",start);
        //返回true，才会找下一个拦截器，如果没有下一个，则到Controller
        //记录请求日志
        if (session == null || session.getAttribute("user") == null) {
            LOGGER.info("访问 " + request.getRequestURI());
        }else{
            User user = (User)session.getAttribute("user");
            LOGGER.info("用户:"+ user.getAccount() + " 访问 " + request.getRequestURI());
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long start = (Long) request.getAttribute("start");
        //获得到达时间
        long end = System.currentTimeMillis();
        //记录耗时
        long spendTime = end - start;
        if(spendTime>1000){
            LOGGER.warn("方法耗时严重，请及时处理，耗时："+ spendTime + "毫秒");
        }else{
            LOGGER.info("方法耗时："+ spendTime + "毫秒，速度正常");
    }
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
