<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>직원 조회</h3>
<hr>
<c:forEach items="${employees}" var="employee">
    <div>
        <h4>${employee.id}번 직원</h4>
    </div>
    <div>
        <p>이름 : ${employee.firstName} ${employee.lastName}</p>
    </div>
    <div>
        <p>생일 :
            <input readonly type="date" value="${employee.birthDate}">
        </p>
    </div>
    <div>
        <p>
            사진 : ${employee.photo}
        </p>
    </div>
    <div>
        노트 :
        <textarea readonly rows="10" cols="30">${employee.notes}</textarea>
    </div>
    <hr>
</c:forEach>
</body>
</html>
