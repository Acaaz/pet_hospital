package com.mapper;

import com.pojo.Borrow;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BorrowMapper {


    @Select("insert into library.borrow(user_id, book_id, book_name,borrow_date,status) " +
            "VALUES (#{user_id},#{book_id},#{book_name},NOW(),#{status})")
    void borrowBook(Borrow borrow);

    @Select("update library.borrow SET status = 0 ,borrow.return_date=NOW() " +
            "where user_id=#{user_id} and book_id = #{book_id}")
    Borrow returnBook(@Param("user_id") Integer user_id, @Param("book_id") Integer book_id);

    @Select("SELECT br.user_id, b.book_id, b.book_name ,br.borrow_date FROM" +
            " book b JOIN borrow br ON b.book_id = br.book_id " +
            " WHERE br.user_id = #{user_id} and br.status = 1")
    List<Borrow> getBorrowedBooks(Integer user_id);

    @Select("select borrow.borrow_id from library.borrow " +
            "where user_id = #{user_id} and book_id = #{book_id} and status = 1")
    Boolean checkIfBorrow(@Param("user_id") Integer user_id, @Param("book_id") Integer book_id);


}
