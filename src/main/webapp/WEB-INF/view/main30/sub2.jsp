<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    <div style="padding: 20px; background-color: palegreen">${message}</div>
</c:if>
<h3>직원 조회 / 수정</h3>
<form action="">
    번호
    <input type="text" name="id">
    <button>조회</button>
</form>
<hr>
<h3>${employee.id}번 직원</h3>
<form action="/main30/sub2/update" method="post">
    <input type="hidden" name="id" value="${employee.id}">
    <div>
        last name
        <input type="text" name="lastName" value="${employee.lastName}">
    </div>
    <div>
        first name
        <input type="text" name="firstName" value="${employee.firstName}">
    </div>
    <div>
        birth
        <input type="date" name="birthDate" value="${employee.birthDate}">
    </div>
    <div>
        photo
        <input type="text" name="photo" value="${employee.photo}">
    </div>
    <div>
        notes
        <textarea name="notes" id="" cols="30" rows="10">${employee.notes}</textarea>
    </div>
    <div>
        <input type="submit" value="수정">
    </div>
</form>
</body>
</html>
