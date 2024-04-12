<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:import url="/WEB-INF/fragment/navbar5.jsp">
    <c:param name="current" value="cart"/>
</c:import>
<h3>장바구니</h3>
<c:if test="${empty cart}" var="emptyCart">
    장바구니가 비었습니다.
</c:if>
<c:if test="${not emptyCart}">
    <table>
        <thead>
        <tr>
            <th>상품명</th>
            <th>갯수</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${cart}" var="item">
            <tr>
                <td>${item.key}</td>
                <td>${item.value}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>


</body>
</html>
