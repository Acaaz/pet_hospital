<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户注册</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/register.css">
</head>
<body>
<div class="container">
    <h2>用户注册</h2>
    <form action="${pageContext.request.contextPath}/goRegister" method="post">
        <label for="username">用户名:</label>
        <input type="text" name="username" id="username">
        <label for="password">密码:</label>
        <input type="password" name="password" id="password">
        <label for="email">邮箱:</label>
        <input type="email" name="email" id="email">
        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>