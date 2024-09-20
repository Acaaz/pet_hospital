package com.service.impl;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;//业务层调用DAO（mapper)层

    /*
     *管理员
     */
    //查询所有用户
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findUser(User user) {
        return userMapper.findUser(user);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public Integer deleteUser(String username) {
        return userMapper.deleteUser(username);
    }

    @Override
    public User checkReg(String username) {
        return userMapper.checkReg(username);
    }

    @Override
    public User findByUserId(int user_id) {
        return userMapper.findByUserId(user_id);
    }

    @Override
    public User updateUser(int user_id, String username, String password, String email, String role) {
        return userMapper.updateUser(user_id, username, password, email, role);
    }


    /*
     * 用户
     */
    //用户查询个人信息
    @Override
    public User findDetailByUsername(int user_id) {
        return userMapper.findDetailByUsername(user_id);
    }

    //用户修改个人信息
    public User updateDetail(String username, String password, String email) {
        return userMapper.updateDetail(username, password, email);
    }

}
