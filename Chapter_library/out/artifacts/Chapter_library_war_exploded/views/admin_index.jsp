<%--
  Created by IntelliJ IDEA.
  User: 28959
  Date: 2024/6/6
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/admin_index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <div class="card p-4 mx-auto">
        <h1 class="mb-4 text-center">欢迎来到我们的页面</h1>
        <p class="mb-4 text-center">请选择以下操作以继续：</p>
        <div class="button-container">
            <h3><a href="${pageContext.request.contextPath}/findAllBook" class="btn btn-primary btn-lg btn-custom">显示书籍信息</a>
            </h3>
            <h3><a href="${pageContext.request.contextPath}/findAllUser" class="btn btn-secondary btn-lg btn-custom">显示用户信息</a>
            </h3>
            <h3><a href="${pageContext.request.contextPath}/goLogin"
                   class="btn btn-danger btn-lg btn-custom">退出登录</a></h3>
        </div>
    </div>
</div>
</body>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</html>
