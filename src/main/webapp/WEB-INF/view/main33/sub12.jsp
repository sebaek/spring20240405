<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr, th, td {
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h3>데이터 입력</h3>
<form action="" method="post">
    <div>
        <input type="text" name="title" value="책 제목!@!@">
    </div>
    <div>
        <input type="text" name="name" value="책 저자###">
    </div>
    <div>
        <input type="number" name="age" value="55">
    </div>
    <div>
        <input type="number" name="price" value="345.678" step="0.001">
    </div>
    <div>
        <input type="date" name="published" value="2000-01-01">
    </div>
    <div>
        <input type="text" name="inserted" value="1999-12-31T12:30:23">
    </div>
    <div>
        <input type="submit" value="전송">
    </div>
</form>
<hr>

<h3>my_table10 레코드들</h3>
<table>
    <thead>
    <tr>
        <th>title</th>
        <th>name</th>
        <th>age</th>
        <th>price</th>
        <th>published</th>
        <th>inserted</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.title}</td>
            <td>${item.name}</td>
            <td>${item.age}</td>
            <td>${item.price}</td>
            <td>${item.published}</td>
            <td>${item.inserted}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
