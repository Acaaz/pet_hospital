package com.service.impl;

import com.mapper.BookMapper;
import com.mapper.BorrowMapper;
import com.pojo.Book;
import com.pojo.Borrow;
import com.service.BorrowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper borrowMapper;
    @Resource
    BookMapper bookMapper;

    @Override
    public void borrowBook(Borrow borrow) {
        borrow.setUser_id(borrow.getUser_id());
        borrow.setBook_id(borrow.getBook_id());
        Book book = this.bookMapper.findById(borrow.getBook_id());
        if (book.getBorrow_sum() >= 1) {
            borrow.setBook_name(book.getBook_name());
            borrow.setStatus(1);
            this.bookMapper.updateBookBorrow(book.getBook_id());
            borrowMapper.borrowBook(borrow);
        } else {
            System.out.println("error");
        }

    }

    @Override
    public List<Borrow> getBorrowedBooks(Integer user_id) {
        return borrowMapper.getBorrowedBooks(user_id);
    }

    @Override
    public Boolean checkIfBorrow(Integer user_id, Integer book_id) {
        Borrow borrow = new Borrow();
        borrow.setUser_id(user_id);
        borrow.setBook_id(book_id);
        return borrowMapper.checkIfBorrow(user_id, book_id);
    }


    @Override
    public Borrow returnBook(Integer user_id, Integer book_id) {
        Borrow borrow = new Borrow();
        borrow.setUser_id(user_id);
        borrow.setBook_id(book_id);
        Book book = this.bookMapper.findById(book_id);
        this.bookMapper.updateBookReturn(book.getBook_id());
        return borrowMapper.returnBook(user_id, book_id);
    }


}
