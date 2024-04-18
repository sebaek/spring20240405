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
<h3>주문일로 주문 조회</h3>
<form>
    <div>시작 :
        <input type="date" name="start" value="${prevStart}">
    </div>
    <div>
        종료 :
        <input type="date" name="end" value="${prevEnd}">
    </div>
    <div>
        <button>조회</button>
    </div>
</form>
<hr>
<c:if test="${empty orderList}">
    <div>
        조회된 내용이 없습니다.
    </div>
</c:if>
<c:if test="${not empty orderList}">

    <table>
        <thead>
        <tr>
            <th>id</th>
            <th>customer</th>
            <th>employee</th>
            <th>date</th>
            <th>shipper</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${orderList}" var="order">
            <tr>
                <td>${order.id}</td>
                <td>${order.customerId}</td>
                <td>${order.employeeId}</td>
                <td>${order.date}</td>
                <td>${order.shipperId}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>

</body>
</html>
