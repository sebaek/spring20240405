<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
form>div*5>input[type][name]
--%>
<form action="/main20/sub10">
    <div>
        도시
        <input type="text" name="city">
    </div>
    <div>
        주소
        <input type="text" name="address">
    </div>
    <div>
        제목
        <input type="text" name="title">
    </div>
    <div>
        내용
        <input type="text" name="content">
    </div>
    <div>
        <input type="submit">
    </div>
</form>

</body>
</html>
