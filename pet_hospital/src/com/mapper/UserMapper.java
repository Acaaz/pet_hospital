package com.mapper;

import com.pojo.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /*
     *管理员
     */
    //查询所有用户
    @Select("select * from pet_hospital.users")
    List<Users> findAllUser();

    //用户登录
    @Select("select * from pet_hospital.users where username=#{username} " +
            "and password=#{password} and role=#{role}")
    Users findUser(Users user);

    //用户注册
    @Select("insert into pet_hospital.users(username,password,email) values(#{username},#{password},#{email})")
    Integer addUser(Users user);

    //注册时的重名检测
    @Select("select * from pet_hospital.users where username=#{username}")
    Users checkReg(String username);

}
