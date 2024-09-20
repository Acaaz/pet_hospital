package com.pojo;

import java.util.Date;

public class Borrow {
    int borrow_id;
    Integer user_id;
    Integer book_id;
    String book_name;

    private Date borrow_date;
    private Date return_date;
    private Integer status;

    public int getBorrow_id() {
        return borrow_id;
    }

    public void setBorrow_id(int borrow_id) {
        this.borrow_id = borrow_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Date getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(Date borrow_date) {
        this.borrow_date = borrow_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "borrow_id=" + borrow_id +
                ", user_id=" + user_id +
                ", book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", borrow_date=" + borrow_date +
                ", return_date=" + return_date +
                ", status=" + status +
                '}';
    }
}
