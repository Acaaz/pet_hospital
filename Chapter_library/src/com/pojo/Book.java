package com.pojo;

//书籍
public class Book {

    private int book_id;//编号
    private String book_no;//图书编号
    private String book_name;//书名
    private String author;//作者名
    private String type;//类型
    private String publisher;//出版社
    private double price;//价格
    private String synopsis;
    private int borrow_count;//借阅数
    private int borrow_sum;//库存量

    //构造方法初始化


    public Book() {
    }

    public Book(int book_id, String book_no, String book_name, String author, String type, String publisher, double price, String synopsis, int borrow_count, int borrow_sum) {
        this.book_id = book_id;
        this.book_no = book_no;
        this.book_name = book_name;
        this.author = author;
        this.type = type;
        this.publisher = publisher;
        this.price = price;
        this.synopsis = synopsis;
        this.borrow_count = borrow_count;
        this.borrow_sum = borrow_sum;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_no() {
        return book_no;
    }

    public void setBook_no(String book_no) {
        this.book_no = book_no;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getBorrow_count() {
        return borrow_count;
    }

    public void setBorrow_count(int borrow_count) {
        this.borrow_count = borrow_count;
    }

    public int getBorrow_sum() {
        return borrow_sum;
    }

    public void setBorrow_sum(int borrow_sum) {
        this.borrow_sum = borrow_sum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_no='" + book_no + '\'' +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", borrow_count=" + borrow_count +
                ", borrow_sum=" + borrow_sum +
                '}';
    }
}