<%@ page import="com.pojo.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 28959
  Date: 2024/6/7
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/user_detail.css">
</head>
<body>
<div class="container">
    <h2>用户信息显示如下：</h2>
    <table>
        <tr>
            <th>用户名</th>
            <th>密码</th>
            <th>邮件</th>
            <th colspan="2">操作</th>
        </tr>
        <%
            User u = (User) request.getAttribute("detail");
            if (u != null) {
        %>
        <tr>
            <td><%=u.getUsername() %>
            </td>
            <td><%=u.getPassword() %>
            </td>
            <td><%=u.getEmail() %>
            </td>
            <td colspan="2">
                <a class="edit-link" href="${pageContext.request.contextPath}/detailModify?user_id=<%=u.getUser_id()%>">修改</a>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <p>这里显示您的个人信息。如果需要修改或删除，请点击相应的操作。</p>
    <div class="button-container">
        <a href="${pageContext.request.contextPath}/views/user_book_index.jsp">返回书架</a>
    </div>
</div>
</body>
</html>
