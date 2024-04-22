<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    <div style="padding: 20px; background-color: pink">${message}</div>
</c:if>
<h3>직원 번호 조회</h3>
<form action="">
    번호
    <input type="text" name="id">
    <button>조회</button>
</form>
<hr>
<c:if test="${empty employee}">
    조회된 내용이 없습니다.
</c:if>
<c:if test="${not empty employee}">

    <div>
        <input type="text" readonly="" value="${employee.id}">
    </div>
    <div>
        <input type="text" readonly="" value="${employee.lastName}">
    </div>
    <div>
        <input type="text" readonly="" value="${employee.firstName}">
    </div>
    <div>
        <input type="date" readonly="" value="${employee.birthDate}">
    </div>
    <div>
        <input type="text" readonly="" value="${employee.photo}">
    </div>
    <div>
        <textarea name="" readonly id="" cols="30" rows="10">${employee.notes}</textarea>
    </div>

    <form action="/main29/sub2/delete" method="post" onsubmit="return confirm('삭제하시겠습니까?')">
        <input hidden type="text" name="id" readonly value="${employee.id}">
        <button>삭제</button>
    </form>
</c:if>

</body>
</html>
