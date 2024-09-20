<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.pojo.Borrow" %>
<%@ page import="com.pojo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Borrowed Books</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/user_borrow.css">
</head>
<body>
<div class="container">
    <h1>借阅记录</h1>
    <p>以下是您的借阅记录：</p>

    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>

    <c:if test="${not empty borrowedBooks}">
        <table>
            <tr>
                <th>User ID</th>
                <th>图书编号</th>
                <th>书名</th>
                <th>借阅时间</th>
                <th>操作</th>
            </tr>
            <%
                User u = (User) session.getAttribute("detail");
                List<Borrow> borrowedBooks = (List<Borrow>) request.getAttribute("borrowedBooks");
                for (Borrow t : borrowedBooks) {
                    if (u.getUser_id() == t.getUser_id()) {
            %>
            <tr>
                <td><%= t.getUser_id() %>
                </td>
                <td><%= t.getBook_id() %>
                </td>
                <td><%= t.getBook_name() %>
                </td>
                <td><%= t.getBorrow_date() %>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/returnBook?user_id=<%= t.getUser_id() %>&book_id=<%= t.getBook_id() %>">还书</a>
                </td>
            </tr>
            <%
                    }
                }
            %>
        </table>
    </c:if>
    <a href="${pageContext.request.contextPath}/findBook">书架</a>
    <p class="message">借阅记录显示完毕。</p>
    <p>如果您还有其他问题，请联系我们的客服。</p>
</div>
</body>
</html>
