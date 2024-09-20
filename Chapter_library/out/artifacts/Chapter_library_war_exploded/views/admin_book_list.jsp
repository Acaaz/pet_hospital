<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*,com.pojo.*" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Book Information</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/admin_book_list.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-5">
    <% if (request.getAttribute("bookExists") != null && (boolean) request.getAttribute("bookExists")) { %>
    <script>
        alert("该书籍已存在！");
    </script>
    <% } %>
    <h2 class="text-center mb-4">所有书籍信息显示如下：</h2>

    <!-- 搜索表单 -->
    <form action="${pageContext.request.contextPath}/searchBook1" method="get" class="mb-4">
        <div class="input-group">
            <input type="text" name="query" class="form-control" placeholder="搜索书名、作者、类型">
            <div class="input-group-append">
                <button type="submit" class="btn btn-primary">搜索</button>
            </div>
        </div>
    </form>

    <div class="table-container">
        <table class="table table-bordered table-hover">
            <thead class="table-dark">
            <tr>
                <th>图书id</th>
                <th>图书编号</th>
                <th>书名</th>
                <th>作者</th>
                <th>类型</th>
                <th>出版社</th>
                <th>价格</th>
                <th>简介</th>
                <th>借阅量</th>
                <th>库存量</th>
                <th colspan="2">操作</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Book> adminB = (List<Book>) request.getAttribute("bs");
                for (Book t : adminB) {
                    String synopsis = t.getSynopsis();
                    String shortSynopsis = synopsis.length() > 15 ? synopsis.substring(0, 15) + "..." : synopsis;
            %>
            <tr>
                <td><%= t.getBook_id() %>
                </td>
                <td><%= t.getBook_no() %>
                </td>
                <td><%= t.getBook_name() %>
                </td>
                <td><%= t.getAuthor() %>
                </td>
                <td><%= t.getType() %>
                </td>
                <td><%= t.getPublisher() %>
                </td>
                <td><%= t.getPrice() %>
                </td>
                <td title="<%= synopsis %>"><%= shortSynopsis %>
                </td>
                <td><%= t.getBorrow_count() %>
                </td>
                <td><%= t.getBorrow_sum() %>
                </td>
                <td><a href="findByBookId?book_id=<%= t.getBook_id() %>" class="btn btn-warning btn-sm">修改</a></td>
                <td><a href="deleteBook?book_id=<%= t.getBook_id() %>" class="btn btn-danger btn-sm">删除</a></td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </div>
    <hr>
    <div class="action-links">
        <h3><a href="${pageContext.request.contextPath}/views/admin_book_add.jsp" class="btn btn-primary">添加书籍</a>
        </h3>
        <h3><a href="${pageContext.request.contextPath}/views/admin_index.jsp" class="btn btn-secondary">返回管理</a>
        </h3>
    </div>
</div>
</body>
</html>
