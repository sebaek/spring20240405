<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>name : ${requestScope.name}</div>
<div>city : ${sessionScope.city}</div>
<div>city : ${city}</div>
<hr>
<div>${model}</div>
<div>${requestScope.model}</div>
<div>${sessionScope.model}</div>
</body>
</html>
