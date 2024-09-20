<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*,com.pojo.*" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户信息管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/admin_user_list.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">所有用户信息显示如下：</h2>
    <div class="table-container">
        <table class="table table-bordered table-hover">
            <thead class="table-dark">
            <tr>
                <th>用户ID</th>
                <th>用户名</th>
                <th>密码</th>
                <th>邮件</th>
                <th>账号属性</th>
                <th colspan="2">操作</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<User> adminB = (List<User>) request.getAttribute("users");
                for (User t : adminB) {
            %>
            <tr>
                <td><%=t.getUser_id() %>
                </td>
                <td><%=t.getUsername() %>
                </td>
                <td><%=t.getPassword() %>
                </td>
                <td><%=t.getEmail() %>
                </td>
                <td><%=t.getRole() %>
                </td>
                <td><a href="${pageContext.request.contextPath}/findByUserId?user_id=<%=t.getUser_id()%>"
                       class="btn btn-warning btn-sm">修改</a></td>
                <td><a href="${pageContext.request.contextPath}/deleteUser?username=<%=t.getUsername() %>"
                       class="btn btn-danger btn-sm">删除</a></td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </div>
    <div class="btn-container">
        <a href="${pageContext.request.contextPath}/views/admin_user_add.jsp" class="btn btn-primary">添加用户</a>
        <a href="${pageContext.request.contextPath}/views/admin_index.jsp" class="btn btn-secondary">返回管理</a>
    </div>
</div>
</body>
</html>
