package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class UserController {
    @Resource
    private UserService userService;

    /*
     *管理员
     */
    //查詢所有用户
    @RequestMapping("/findAllUser")
    public String findAllUser(HttpServletRequest request) {
        List<User> users = userService.findAllUser();
        request.setAttribute("users", users);
        return "admin_user_list"; //admin_user_list.jsp页面
    }

    //添加用户
    @RequestMapping("/addUser")
    public String addUser(User user) {
        System.out.println("---add---");
        userService.addUser(user);
        return "redirect:findAllUser"; //转发
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("username") String username) {
        userService.deleteUser(username);
        return "redirect:findAllUser";
    }

    //按用户id查询用户
    @RequestMapping("/findByUserId")
    public String findByUserId(@RequestParam("user_id") int user_id, HttpServletRequest request) {
        User user = userService.findByUserId(user_id);
        request.setAttribute("user", user);
        return "admin_user_modify";//跳转到admin_user_modify.jsp页面
    }

    //修改用户信息
    @RequestMapping("/updateUser")
    public String updateUser(User user) {
//        // 检查邮箱格式
//        if (!isEmailValid(user.getEmail())) {
//            return "redirect:findAllUser"; // 返回错误页面
//        }
        userService.updateUser(user.getUser_id(), user.getUsername(), user.getPassword(), user.getEmail(), user.getRole());
        return "redirect:findAllUser";
    }


    /*
     * 用户
     */
    //用户查询个人信息
    @RequestMapping("/userDetail")
    public String findDetailByUsername(HttpSession session, HttpServletRequest request) {
        User u = (User) session.getAttribute("detail");
        if (u != null) {
            User detailedUser = userService.findDetailByUsername(u.getUser_id());
            request.setAttribute("detail", detailedUser);
            return "user_detail"; // 跳转到显示个人信息的页面
        } else {
            return "redirect:index"; // 未登录则重定向到登录页面
        }
    }

    @RequestMapping("/detailModify")
    public String findDetail(@RequestParam("user_id") int user_id, HttpServletRequest request, HttpSession session) {
        User u = (User) session.getAttribute("detail");
        User user = userService.findDetailByUsername(u.getUser_id());
        request.setAttribute("detail", user);
        return "user_detail_modify";
    }

    //用户修改个人信息
    @RequestMapping("/updateDetail")
    public String updateDetail(User user, HttpSession session) {

        User sessionUser = (User) session.getAttribute("detail");
        user.setUser_id(sessionUser.getUser_id());
        userService.updateDetail(user.getUsername(), user.getPassword(), user.getEmail());
        session.setAttribute("detail", user); // 更新session中的用户信息
        return "redirect:userDetail"; // 重定向到查看个人信息页面
    }

//    // 验证邮箱格式的辅助方法
//    private boolean isEmailValid(String email) {
//        return EMAIL_PATTERN.matcher(email).matches();
//    }
//    // 正则表达式用于验证邮箱格式
//    private static final Pattern EMAIL_PATTERN =
//            Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");

}
