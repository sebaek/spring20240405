<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        .table {
            border-collapse: collapse;
            border: 1px solid black;
            width: 100%;
        }

        .table th,
        .table td {
            border: 1px solid black;
            text-align: center;
            padding-top: 5px;
            padding-bottom: 5px;
        }

    </style>
</head>
<body>
<h3>자동차들</h3>
<table class="table">
    <thead>
    <tr>
        <th>NO.</th>
        <th>모델명</th>
        <th>회사</th>
        <th>국적</th>
        <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cars}" var="car" varStatus="status">
        <tr>
            <td>${status.count}</td>
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
