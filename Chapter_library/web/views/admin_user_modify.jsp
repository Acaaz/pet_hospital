<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.*,com.pojo.*" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/admin_user_modify.css">
</head>
<body>
<div class="container">
    <h3>修改用户信息</h3>
    <%
        User t = (User) request.getAttribute("user");
        if (t != null) {
    %>
    <form id="updateForm" method="post" onsubmit="return validateEmail()">
        <input type="hidden" name="user_id" value="<%=t.getUser_id() %>">
        <label for="username">用户名:</label>
        <input type="text" id="username" name="username" value="<%=t.getUsername() %>"><br>
        <label for="password">密码:</label>
        <input type="password" id="password" name="password" value="<%=t.getPassword() %>"><br>
        <label for="email">邮件:</label>
        <input type="text" id="email" name="email" value="<%=t.getEmail() %>"><br>
        <label for="role">账号属性:</label>
        <input type="text" id="role" name="role" value="<%=t.getRole() %>"><br>
        <input type="submit" value="修 改">
    </form>
    <%
        }
    %>
</div>
</body>
<script>
    function validateEmail() {
        var emailInput = document.getElementById("email");
        var email = emailInput.value.trim();
        var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!emailRegex.test(email)) {
            alert("请输入有效的邮箱地址！");
            emailInput.focus(); // 将焦点放在邮箱输入框上
            return false; // 阻止表单提交
        }

        // 修改表单的action属性为正确的Controller方法路径
        document.getElementById("updateForm").action = "${pageContext.request.contextPath}/updateUser";

        // 邮箱格式正确，表单提交
        return true;
    }
</script>
</html>