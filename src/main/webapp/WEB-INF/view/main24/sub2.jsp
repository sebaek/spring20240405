<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>고객 목록</h3>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>name</th>
        <th>city</th>
        <th>country</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" varStatus="status" var="customer">
        <tr>
            <td>${status.count}</td>
            <td>${customer.customerName}</td>
            <td>${customer.city}</td>
            <td>${customer.country}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
