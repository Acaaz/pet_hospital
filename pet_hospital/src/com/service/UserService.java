package com.service;

import com.pojo.Users;

import java.util.List;

public interface UserService {
    /*
     *管理员
     */
    //查询所有用户
    List<Users> findAllUser();

    //用户登录
    Users findUser(Users user);

    //用户注册
    Integer addUser(Users user);

    //注册时的重名检测
    Users checkReg(String username);

}
