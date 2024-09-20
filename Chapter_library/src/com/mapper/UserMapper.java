package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /*
     *管理员
     */
    //查询所有用户
    @Select("select * from library.user")
    List<User> findAllUser();

    //用户登录
    @Select("select * from library.user where username=#{username} " +
            "and password=#{password} and role=#{role}")
    User findUser(User user);

    //用户注册
    @Select("insert into library.user(username,password,email) values(#{username},#{password},#{email})")
    Integer addUser(User user);

    //注册时的重名检测
    @Select("select * from library.user where username=#{username}")
    User checkReg(String username);

    //删除用户
    @Delete("delete from library.user where username=#{username}")
    Integer deleteUser(@Param("username") String username);

    //查询用户
    @Select("select * from library.user where user_id=#{user_id}")
    User findByUserId(int user_id);

    //修改用户
    @Select("update library.user " +
            "set username=#{username},password=#{password},email=#{email}, role=#{role}" +
            "where user_id=#{user_id}")
    User updateUser(@Param("user_id") int user_id,
                    @Param("username") String username,
                    @Param("password") String password,
                    @Param("email") String email,
                    @Param("role") String role
    );


    /*
     * 用户
     */
    //用户查询个人信息
    @Select("select user_id,username,password,email from library.user where user_id=#{user_id}")
    User findDetailByUsername(int user_id);

    //用户修改个人信息
    @Select("update library.user " +
            "set username=#{username},password=#{password},email=#{email} where username=#{username}")
    User updateDetail(@Param("username") String username,
                      @Param("password") String password,
                      @Param("email") String email
    );

//    @Select("select user.username, book.book_name,book.author from library.user, book, borrow " +
//            "where user.user_id = #{user_id} and borrow.user_id = user.user_id " +
//            "and borrow.book_id = book.book_id")
//    User listBooksByUserid(@Param("user_id") int user_id);
}
