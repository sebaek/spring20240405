<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <c:if test="${not empty message}">
        <div style="padding: 20px; background-color: skyblue">
                ${message}
        </div>
    </c:if>
</div>
<h3>고객 정보 입력</h3>
<form action="" method="post">
    <div>
        이름
        <input type="text" name="name">

    </div>
    <div>
        계약명
        <input type="text" name="contactName">

    </div>
    <div>
        주소
        <input type="text" name="address">

    </div>
    <div>
        도시
        <input type="text" name="city">

    </div>
    <div>
        우편번호
        <input type="text" name="postalCode">

    </div>
    <div>
        국가
        <input type="text" name="country">

    </div>
    <div>
        <input type="submit" value="등록">
    </div>
</form>
</body>
</html>
