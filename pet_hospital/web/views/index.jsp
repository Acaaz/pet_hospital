<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css">
</head>
<body>
<div class="login-form">
    <form method="post" action="${pageContext.request.contextPath}/goLogin">
        <div class="login-input">
            <h2>登录</h2>
            <label>
                <input type="text" name="username" value="" placeholder="请输入账号"/>
            </label><br/>
            <label>
                <input type="password" name="password" value="" placeholder="请输入密码"/>
            </label><br/>
            <input type="submit" name="btn1" value="登录"/><br>
            <a href="${pageContext.request.contextPath}/views/register.jsp" style="text-decoration: none;">注册用户</a>
        </div>
    </form>
</div>
</body>
</html>