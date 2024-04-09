<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>if</h3>
<c:if test="${age >= 20}">
    <p>투표 가능</p>
</c:if>

<c:if test="${age < 20}">
    <p>투표 불가능</p>
</c:if>

<%-- products 속성이 빈 리스트면 --%>
<%-- <p>상품이 없습니다.</p> --%>
<%-- products 속성이 빈 리스트가 아니면 2개의 요소를 출력 --%>
<%-- <ul><li>Apple</li><li>Banana</li><ul> --%>

<c:if test="${empty products}">
    <p>상품이 없습니다.</p>
</c:if>

<c:if test="${not empty products}">
    <%--    ul>li*2--%>
    <ul>
        <li>${products[0]}</li>
        <li>${products[1]}</li>
    </ul>
</c:if>

</body>
</html>
