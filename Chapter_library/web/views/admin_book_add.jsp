<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加书籍信息</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/admin_book_add.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-5">
    <div class="form-container">
        <form action="${pageContext.request.contextPath}/addBook" method="post">
            <h3 class="text-center mb-4">添加书籍信息</h3>
            <c:if test="${not empty message}">
                <script type="text/javascript">
                    alert("${message}");
                </script>
            </c:if>
            <div class="mb-3 form-group">
                <label for="book_no">图书编号:</label>
                <input type="text" class="form-control" id="book_no" name="book_no" required/>
            </div>
            <div class="mb-3 form-group">
                <label for="book_name">书名:</label>
                <input type="text" class="form-control" id="book_name" name="book_name" required/>
            </div>
            <div class="mb-3 form-group">
                <label for="author">作者:</label>
                <input type="text" class="form-control" id="author" name="author" required/>
            </div>
            <div class="mb-3 form-group">
                <label for="type">图书类型:</label>
                <input type="text" class="form-control" id="type" name="type" required/>
            </div>
            <div class="mb-3 form-group">
                <label for="publisher">出版社:</label>
                <input type="text" class="form-control" id="publisher" name="publisher" required/>
            </div>
            <div class="mb-3 form-group">
                <label for="price">价格:</label>
                <input type="text" class="form-control" id="price" name="price" required/>
            </div>
            <div class="mb-3 form-group">
                <label for="synopsis">简介:</label>
                <input type="text" class="form-control" id="synopsis" name="synopsis" required/>
            </div>
            <div class="mb-3 form-group">
                <label for="borrow_count">借阅量:</label>
                <input type="text" class="form-control" id="borrow_count" name="borrow_count" required/>
            </div>
            <div class="mb-3 form-group">
                <label for="borrow_sum">库存量:</label>
                <input type="text" class="form-control" id="borrow_sum" name="borrow_sum" required/>
            </div>
            <div class="text-center">
                <input type="submit" class="btn btn-primary" value="添 加"/>
            </div>
        </form>
    </div>
</div>
</body>
</html>
