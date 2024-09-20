package com.service.impl;

import com.mapper.UserMapper;
import com.pojo.Users;
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
    public List<Users> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public Users findUser(Users user) {
        return userMapper.findUser(user);
    }

    @Override
    public Integer addUser(Users user) {
        return userMapper.addUser(user);
    }

    @Override
    public Users checkReg(String username) {
        return userMapper.checkReg(username);
    }
}
