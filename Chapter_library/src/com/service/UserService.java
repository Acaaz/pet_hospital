package com.service;

import com.pojo.User;

import java.util.List;

public interface UserService {
    /*
     *管理员
     */
    //查询所有用户
    List<User> findAllUser();

    //用户登录
    User findUser(User user);

    //用户注册
    Integer addUser(User user);

    //删除用户
    Integer deleteUser(String username);

    //查询用户
    User findByUserId(int user_id);

    //修改用户
    User updateUser(int user_id, String username, String password, String email, String role);

    //注册时的重名检测
    User checkReg(String username);

    /*
     * 用户
     */
    //用户查询个人信息
    User findDetailByUsername(int user_id);

    //用户修改个人信息
    User updateDetail(String username, String password, String email);


}

