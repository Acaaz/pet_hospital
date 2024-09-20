package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Resource
    UserService userService;//控制层调用业务层

    //登录
    @RequestMapping("/goLogin")
    public String log(User user, HttpSession session) {
        User u = userService.findUser(user);
        if (u != null) {
            session.setAttribute("detail", u);
            // 根据用户的角色重定向到不同的页面
            if ("0".equals(u.getRole())) {
                return "admin_index";
            } else if ("1".equals(u.getRole())) {
                return "user_book_index";
            }
        }
        return "index";
    }


    //注册
    @RequestMapping("/goRegister")
    public String reg(User user) {
        User u = userService.checkReg(user.getUsername());
        if (u == null) {
            userService.addUser(user);
            return "registerOk"; //转发";
        }
        return "registerNo";
    }


}
