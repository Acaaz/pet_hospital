package com.controller;

import com.pojo.Borrow;
import com.service.BookService;
import com.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BorrowController {
    @Resource
    BorrowService borrowService;
    BookService bookService;

    @Autowired
    private HttpSession httpSession;

    // 借阅书籍的方法
    @RequestMapping("/borrowBook")
    public String borrowBook(Borrow borrow) {
        if (null != borrowService.checkIfBorrow(borrow.getUser_id(), borrow.getBook_id())) {
            return "redirect:/findBook";
        }
        borrowService.borrowBook(borrow);
        httpSession.setAttribute("borrow", borrow);
        return "redirect:/borrowedBooks";
    }

    // 显示用户借阅的书籍列表
    @RequestMapping("/borrowedBooks")
    public String borrowedBooks(Integer user_id, Model model, HttpSession session) {
        Borrow borrow1 = (Borrow) session.getAttribute("borrow");


        if (borrow1 == null) {
            model.addAttribute("message", "您还没有借阅任何书籍。");
            return "user_borrow";
        }
        List<Borrow> borrowedBooks = borrowService.getBorrowedBooks(borrow1.getUser_id());

        if (borrowedBooks == null || borrowedBooks.isEmpty()) {
            model.addAttribute("message", "您还没有借阅任何书籍。");
        } else {
            model.addAttribute("borrowedBooks", borrowedBooks);
        }

        return "user_borrow";
    }

    // 还书的方法
    @RequestMapping("/returnBook")
    public String returnBook(Integer user_id, Integer book_id) {
        borrowService.returnBook(user_id, book_id);
        return "redirect:/borrowedBooks";
    }

}
