<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>자동차들</h3>
<table>
    <thead>
    <tr>
        <th>모델명</th>
        <th>회사</th>
        <th>국적</th>
        <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td>${car.name}</td>
            <td>${car.company}</td>
            <td>${car.country}</td>
            <td>${car.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
