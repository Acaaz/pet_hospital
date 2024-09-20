<%@ page import="com.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 28959
  Date: 2024/6/7
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/user_detail_modify.css">
</head>
<body>
<div class="container">
    <h3>修改用户信息</h3>
    <%
        User u = (User) request.getAttribute("detail");
        if (u != null) {
    %>
    <form id="updateForm" action="${pageContext.request.contextPath}/updateDetail" method="post"
          onsubmit="return validateEmail()">
        用户名: <input type="text" name="username" value="<%=u.getUsername() %>"/><br/>
        密&nbsp;码: <input type="password" name="password" value="<%=u.getPassword() %>"/><br/>
        邮件: <input type="text" id="email" name="email" value="<%=u.getEmail() %>"/><br/>
        <input type="submit" value="修 改"/>
    </form>
    <%
        }
    %>
    <p class="note">请确保您输入的信息是正确的。</p>
</div>
</body>
<script>
    function validateEmail() {
        var email = document.getElementById('email').value;
        var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!emailPattern.test(email)) {
            alert('邮箱错误');
            return false; // Prevent form submission
        }

        return true; // Allow form submission
    }
</script>
</html>
