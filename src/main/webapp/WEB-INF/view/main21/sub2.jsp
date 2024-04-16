<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--form*2>input:s--%>
<form action="/main21/sub1" method="get">
    <input type="submit">
</form>
<form action="/main21/sub1" method="post">
    <input type="submit">
</form>

<hr>
<%--form*2>input:s--%>
<form action="/main21/sub3" method="get">
    <input type="submit" value="sub3 get">
</form>
<form action="/main21/sub3" method="post">
    <input type="submit" value="sub3 post">
</form>


</body>
</html>
