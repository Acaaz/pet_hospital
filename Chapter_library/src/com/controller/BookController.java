package com.controller;

import com.pojo.Book;
import com.pojo.User;
import com.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BookController {
    @Resource
    BookService bookService;//控制层调用业务层

    //管理员
    //查詢所有书籍
    @RequestMapping("/findAllBook")
    public String findAllBook(HttpServletRequest request) {
        List<Book> books = bookService.findAllBook();
        request.setAttribute("bs", books);
        return "admin_book_list"; //跳转到admin_book_list.jsp页面
    }

    //添加书籍信息
    @RequestMapping("/addBook")
    public String addBook(Book books, Model model) {

        Book book = bookService.findBookByBookName(books.getBook_name());
        if (book == null) {
            bookService.addBook(books);
            return "redirect:findAllBook";
        }
        model.addAttribute("message", "书籍已存在");
        return "admin_book_add";
    }

    //删除书籍信息
    @RequestMapping("/deleteBook")
    public String deleteBook(@RequestParam("book_id") int book_id) {
        bookService.deleteBook(book_id);
        return "redirect:findAllBook";
    }

    //按ID查询书籍
    @RequestMapping("/findByBookId")
    public String findByBookId(@RequestParam("book_id") int book_id,
                               HttpServletRequest request, HttpSession session) {
        User user = (User) session.getAttribute("user");
        Book book = bookService.findById(book_id);
        request.setAttribute("bk", book);
        return "admin_book_modify";//跳转到admin_book_modify.jsp页面
    }

    //修改书籍信息
    @RequestMapping("/updateBook")
    public String updateBook(Book book) {
        bookService.updateBook(book.getBook_id(), book.getBook_no(), book.getBook_name(), book.getAuthor(),
                book.getType(), book.getPublisher(), book.getPrice(), book.getSynopsis(), book.getBorrow_count(),
                book.getBorrow_sum());
        return "redirect:findAllBook";
    }

    //搜索
    @RequestMapping("/searchBook1")
    public String searchBook(@RequestParam("query") String query, HttpServletRequest request) {
        List<Book> books = bookService.searchBooks(query);
        request.setAttribute("bs", books);
        return "admin_book_list";
    }

    //用户
    //查看所有书籍
    @RequestMapping("/findBook")
    public String findBook(HttpServletRequest request, HttpSession session) {
        List<Book> book = bookService.findBook();
        request.setAttribute("ubk", book);
        return "user_book_list"; //跳转到user_book_list.jsp页面
    }

    //查看书籍详情
    @RequestMapping("/findBookDetail")
    public String findByBookName(@RequestParam("book_name") String book_name, HttpServletRequest request) {
        Book book = bookService.findBookByBookName(book_name);
        request.setAttribute("ubk", book);
        return "user_book_details"; //跳转到user_book_details.jsp页面
    }

    //搜索
    @RequestMapping("/searchBook2")
    public String searchBook2(@RequestParam("query") String query, HttpServletRequest request) {
        List<Book> books = bookService.searchBooks(query);
        request.setAttribute("ubk", books);
        return "user_book_list";
    }

}
