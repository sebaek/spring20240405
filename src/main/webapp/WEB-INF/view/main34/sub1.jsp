<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td, th {
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h3>직원 매출액 조회</h3>
<form>
    <div>
        년도
        <select name="year">
            <option value="1996">1996</option>
            <option value="1997">1997</option>
        </select>
    </div>
    <div>
        월
        <select name="month" id="">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
        </select>
    </div>
    <div>
        <input type="submit" value="조회">
    </div>
</form>

<hr>
<div>
    <table>

        <thead>
        <tr>
            <th>#</th>
            <th>last name</th>
            <th>first name</th>
            <th>매출액</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${incomeList}" var="item" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${item.lastName}</td>
                <td>${item.firstName}</td>
                <td>${item.income}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
