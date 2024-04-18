<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }

        table {
            width: 100%;
        }
    </style>
</head>
<body>
<h3>직원 검색</h3>
<form>
    이름
    <input value="${prevSearch}" type="text" placeholder="조회할 이름을 입력하세요." name="name">
    <button>조회</button>
</form>

<hr>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>firstName</th>
        <th>lastName</th>
        <th>birth</th>
        <th>photo</th>
        <th>notes</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
            <td>${employee.birthDate}</td>
            <td>${employee.photo}</td>
            <td>${employee.notes}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
