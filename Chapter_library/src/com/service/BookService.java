package com.service;

import com.pojo.Book;

import java.util.List;

public interface BookService {
    /*
      管理员
    */
    //查找所有书籍
    List<Book> findAllBook();

    //通过ID查找书籍
    Book findById(int book_id);

    //添加书籍
    int addBook(Book book);

    //修改书籍信息
    int updateBook(int book_id, String book_no, String book_name, String author, String type, String publisher,
                   double price, String synopsis, int borrow_count, int borrow_sum);

    //更新借书时间
    int updateBookBorrow(Integer book_id);

    //更新还书时间
    int updateBookReturn(Integer book_id);

    //删除书籍
    int deleteBook(int book_id);

    //搜索书籍
    List<Book> searchBooks(String query);

    /*
    用户
    */
    //查看所有书籍
    List<Book> findBook();

    //查看书籍详情
    Book findBookByBookName(String book_name);

}
