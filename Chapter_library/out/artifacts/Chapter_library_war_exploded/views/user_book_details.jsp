<%@ page import="com.pojo.Book" %>
<%@ page import="com.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 28959
  Date: 2024/6/6
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详情</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/user_book_detail.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
<%
    Book t = (Book) request.getAttribute("ubk");
    if (t != null) {
%>
<div class="custom-container">
    <div class="row mb-3">
        <div class="col text-center">
            <h3>查看图书信息</h3>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="form-group">
                <label class="form-label">书名:</label>
                <input type="text" class="form-control" value="<%=t.getBook_name() %>" readonly>
            </div>
            <div class="form-group">
                <label class="form-label">作者:</label>
                <input type="text" class="form-control" value="<%=t.getAuthor() %>" readonly>
            </div>
            <div class="form-group">
                <label class="form-label">图书类型:</label>
                <input type="text" class="form-control" value="<%=t.getType() %>" readonly>
            </div>
            <div class="form-group">
                <label class="form-label">出版社:</label>
                <input type="text" class="form-control" value="<%=t.getPublisher() %>" readonly>
            </div>
            <div class="form-group">
                <label class="form-label">价格:</label>
                <input type="text" class="form-control" value="<%=t.getPrice() %>" readonly>
            </div>
            <div class="form-group">
                <label class="form-label">图书简介:</label>
                <textarea class="form-control" rows="5" readonly><%=t.getSynopsis() %></textarea>
            </div>
        </div>
    </div>
</div>
<div class="row mt-4">
    <div class="col text-center">
        <a href="${pageContext.request.contextPath}/findBook" class="btn btn-primary">返回借书</a>
    </div>
</div>
<%
    }
%>
</body>
</html>