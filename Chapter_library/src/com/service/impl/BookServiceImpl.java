package com.service.impl;

import com.mapper.BookMapper;
import com.pojo.Book;
import com.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper bookMapper;//业务层调用DAO（mapper)层

    //管理员
    @Override
    public List<Book> findAllBook() {
        return bookMapper.findAllBook();
    }

    @Override
    public Book findById(int book_id) {
        return bookMapper.findById(book_id);
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int updateBook(int book_id, String book_no, String book_name, String author, String type,
                          String publisher, double price, String synopsis, int borrow_count, int borrow_sum) {
        return bookMapper.updateBook(book_id, book_no, book_name, author, type, publisher, price, synopsis, borrow_count, borrow_sum);
    }

    @Override
    public int deleteBook(int book_id) {
        return bookMapper.deleteBook(book_id);
    }

    @Override
    public List<Book> searchBooks(String query) {
        return bookMapper.searchBooks("%" + query + "%");
    }

    //用户
    //查看所有书籍
    @Override
    public List<Book> findBook() {
        return bookMapper.findBook();
    }


    //查看书籍详情
    public Book findBookByBookName(String book_name) {
        return bookMapper.findBookByBookName(book_name);
    }

    @Override
    public int updateBookBorrow(Integer book_id) {
        return bookMapper.updateBookBorrow(book_id);
    }

    @Override
    public int updateBookReturn(Integer book_id) {
        return bookMapper.updateBookReturn(book_id);
    }

}
