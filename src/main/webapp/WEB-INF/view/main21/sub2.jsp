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

<hr>

<%--form*2>input:s--%>
<form action="/main21/sub4">
    <input type="submit" value="get sub4">
</form>
<form action="/main21/sub4" method="post">
    <input type="submit" value="post sub4">
</form>

<hr>

<%-- todo : 아래 두 form 전송 버튼 클릭시 실행되는 메소드 작성
      @GetMapping, @PostMapping 활용--%>
<%--form*2>input:s--%>
<form action="/main21/sub5">
    <input type="submit" value="get 방식으로 sub5">
</form>
<form action="/main21/sub5" method="post">
    <input type="submit" value="post 방식으로 sub5">
</form>

</body>
</html>
