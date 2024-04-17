<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>고객이 있는 나라들</h3>
<ul>
    <c:forEach items="${countryList}" var="country">
        <li>${country}</li>
    </c:forEach>
</ul>
</body>
</html>
