<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    <div>
        <input type="text" name="username">
    </div>
    <div>
        <input type="text" name="password">
    </div>
    <div>
        <button>로그인</button>
    </div>
</form>
</body>
</html>
