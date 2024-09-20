package com.mapper;

import com.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookMapper {
    //管理员
    //查询所有记录
    @Select("select * from library.book")
    List<Book> findAllBook();

    //按ID查询
    @Select("select * from library.book where book_id=#{book_id}")
    Book findById(int book_id);

    //插入操作
    @Insert("insert into library.Book" +
            "(book_no,book_name,author,type,publisher,price,synopsis,borrow_count,borrow_sum) " +
            "values" +
            "(#{book_no},#{book_name},#{author},#{type},#{publisher},#{price},#{synopsis},#{borrow_count},#{borrow_sum})")
    int addBook(Book book);

    //修改操作
    @Update("update library.book " +
            "set book_no=#{book_no},book_name=#{book_name},author=#{author},type=#{type}," +
            "publisher=#{publisher},price=#{price},synopsis=#{synopsis},borrow_count=#{borrow_count},borrow_sum=#{borrow_sum} " +
            "where book_id=#{book_id}")
    int updateBook(
            @Param("book_id") int book_id,
            @Param("book_no") String book_no,
            @Param("book_name") String book_name,
            @Param("author") String author,
            @Param("type") String type,
            @Param("publisher") String publisher,
            @Param("price") double price,
            @Param("synopsis") String synopsis,
            @Param("borrow_count") int borrow_count,
            @Param("borrow_sum") int borrow_sum
    );

    //删除操作
    @Delete("delete from library.book where book_id=#{book_id}")
    int deleteBook(@Param("book_id") int book_id);

    //搜索
    @Select("select * from library.book where book_name like #{query} or author like #{query} or type like #{query}")
    List<Book> searchBooks(@Param("query") String query);

    //用户
    //查看所有书籍
    @Select("select book_id, book_name, author, type, publisher from library.book")
    List<Book> findBook();

    //查看书籍详情
    @Select("select book_id,book_name, author, type, publisher, price ,synopsis from library.book where book_name=#{book_name} ")
    Book findBookByBookName(String book_name);

    //借书修改操作
    @Update("update library.book set borrow_count = borrow_count + 1, borrow_sum = borrow_sum - 1 " +
            "where book_id=#{book_id}")
    int updateBookBorrow(Integer book_id);

    //还书修改操作
    @Update("update library.book set borrow_count = borrow_count - 1, borrow_sum = borrow_sum + 1 " +
            "where book_id=#{book_id}")
    int updateBookReturn(Integer book_id);

}
