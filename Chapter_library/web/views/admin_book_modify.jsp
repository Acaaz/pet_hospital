<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*,com.pojo.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改书籍信息</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/admin_book_modify.css">
</head>
<body>
<h3>修改书籍信息</h3>
<%
    Book t = (Book) request.getAttribute("bk");
    if (t != null) {
%>
<form action="${pageContext.request.contextPath}/updateBook" method="post">
    <input type="hidden" name="book_id" value="<%=t.getBook_id() %>"/>
    <div class="form-group">
        <label for="book_no">图书编号:</label>
        <input type="text" id="book_no" name="book_no" value="<%=t.getBook_no() %>"/>
    </div>
    <div class="form-group">
        <label for="book_name">书名:</label>
        <input type="text" id="book_name" name="book_name" value="<%=t.getBook_name() %>"/>
    </div>
    <div class="form-group">
        <label for="author">作者:</label>
        <input type="text" id="author" name="author" value="<%=t.getAuthor() %>"/>
    </div>
    <div class="form-group">
        <label for="publisher">图书类型:</label>
        <input type="text" id="type" name="type" value="<%=t.getType() %>"/>
    </div>
    <div class="form-group">
        <label for="publisher">出版社:</label>
        <input type="text" id="publisher" name="publisher" value="<%=t.getPublisher() %>"/>
    </div>
    <div class="form-group">
        <label for="price">价格:</label>
        <input type="text" id="price" name="price" value="<%=t.getPrice() %>"/>
    </div>
    <div class="form-group">
        <label for="synopsis">简介:</label>
        <input type="text" id="synopsis" name="synopsis" value="<%=t.getSynopsis() %>"/>
    </div>
    <div class="form-group">
        <label for="borrow_count">借阅量:</label>
        <input type="text" id="borrow_count" name="borrow_count" value="<%=t.getBorrow_count() %>"/>
    </div>
    <div class="form-group">
        <label for="borrow_sum">库存量:</label>
        <input type="text" id="borrow_sum" name="borrow_sum" value="<%=t.getBorrow_sum() %>"/>
    </div>
    <input type="submit" value="修 改"/>
</form>
<%
    }
%>
</body>
</html>
