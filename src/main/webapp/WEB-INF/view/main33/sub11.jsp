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
<h3>새 데이터 입력</h3>
<form action="" method="post">
    <%--    div*6>input[name][value]--%>
    <div>
        문자열
        <input type="text" name="stringCol" value="기본 문자열">
    </div>
    <div>
        정수
        <input type="number" name="intCol" value="100">
    </div>
    <div>
        실수
        <input type="number" name="decCol" value="3.14" step="0.01">
    </div>
    <div>
        날짜
        <input type="date" name="dateCol" value="2024-03-03">
    </div>
    <div>
        날짜시간
        <input type="datetime-local" name="dateTimeCol" value="2024-03-03T12:12:12">
    </div>
    <div>
        <input type="submit" value="저장">
    </div>

</form>
<hr>
<h3>my_table9 자료들</h3>
<table>
    <thead>
    <tr>
        <th>문자열</th>
        <th>정수</th>
        <th>실수</th>
        <th>날짜</th>
        <th>날짜시간</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${datas}" var="data">
        <tr>
            <td>${data.stringCol}</td>
            <td>${data.intCol}</td>
            <td>${data.decCol}</td>
            <td>${data.dateCol}</td>
            <td>${data.dateTimeCol}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
