<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2019/6/23
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h1>${user.nickname},欢迎您！</h1>
<img src="${user.headImgUrl}" />
<p>所在国家：${user.language}</p>
<p>你的性别：${user.gender}</p>
<p>用户标识：${user.openId}</p>
</body>
</html>
