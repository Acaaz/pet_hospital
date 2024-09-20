<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*,com.pojo.*" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>显示</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/user_book_list.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<div class="container mt-5">
    <h2 class="text-center mb-4">所有书籍信息显示如下：</h2>

    <!-- 搜索表单 -->
    <form action="${pageContext.request.contextPath}/searchBook2" method="get" class="mb-4">
        <div class="input-group">
            <input type="text" name="query" class="form-control" placeholder="搜索书名、作者、类型">
            <button type="submit" class="btn btn-primary">搜索</button>
        </div>
    </form>

    <div class="table-responsive">
        <table class="table table-bordered table-hover">
            <thead class="table-dark">
            <tr class="text-center">
                <th>书名</th>
                <th>作者</th>
                <th>图书类型</th>
                <th>出版社</th>
                <th>查看详情</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <%
                User user = (User) session.getAttribute("detail");
                List<Book> book = (List<Book>) request.getAttribute("ubk");
                for (Book t : book) {
            %>
            <tr class="text-center">
                <td><%= t.getBook_name() %>
                </td>
                <td><%= t.getAuthor() %>
                </td>
                <td><%= t.getType() %>
                </td>
                <td><%= t.getPublisher() %>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/findBookDetail?book_name=<%= t.getBook_name() %>"
                       class="btn btn-info btn-sm">查看详情</a>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/borrowBook?user_id=<%= user.getUser_id() %>&book_id=<%= t.getBook_id() %>"
                       class="btn btn-success btn-sm">借书</a>
                </td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </div>

    <div class="d-flex justify-content-between mt-4">
        <a href="${pageContext.request.contextPath}/views/user_book_index.jsp" class="btn btn-secondary">返回</a>
        <a href="${pageContext.request.contextPath}/borrowedBooks" class="btn btn-secondary">我的借书</a>
    </div>
</div>
</html>