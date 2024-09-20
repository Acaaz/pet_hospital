package com.service;

import com.pojo.Borrow;

import java.util.List;

public interface BorrowService {

    //借书
    void borrowBook(Borrow borrow);

    //还书
    Borrow returnBook(Integer user_id, Integer book_id);

    //借阅列表
    List<Borrow> getBorrowedBooks(Integer user_id);

    //判断用户是否已经借过此书(假设每种书每人只能借一本)
    Boolean checkIfBorrow(Integer user_id, Integer book_id);
}
