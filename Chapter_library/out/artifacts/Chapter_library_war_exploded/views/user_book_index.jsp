<%--
  Created by IntelliJ IDEA.
  User: 28959
  Date: 2024/6/6
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/user_book_index.css">
</head>
<body>
<div class="container">
    <h1>欢迎访问我们的网站</h1>
    <div class="links">
        <a href="${pageContext.request.contextPath}/findBook">
            <span class="icon">📚</span>
            显示书籍信息
        </a>
        <a href="${pageContext.request.contextPath}/userDetail">
            <span class="icon">👤</span>
            查看个人信息
        </a>
        <a href="${pageContext.request.contextPath}/goLogin">
            <span class="icon">🔙</span>
            返回登录
        </a>
    </div>
    <p>欢迎来到我们的网站，请选择您感兴趣的功能。</p>
</div>
</body>
</html>
