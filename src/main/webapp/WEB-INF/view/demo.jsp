<%--
  Created by IntelliJ IDEA.
  User: HJY
  Date: 2017/12/17
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action = "/user/upload" enctype="multipart/form-data">  <!--multipart/form-data不可变-->
    <input type="text" name = "id"/>
    <input type="file" name = "file"/>
    <input type="submit" value="提交"/>

    <a href="/user/down"/> download</a>
</form>
</body>
</html>
