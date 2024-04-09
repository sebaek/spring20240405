<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>choose, when, otherwise</h3>
<c:choose>
    <c:when test="true">
        <p>첫번째 when</p>
    </c:when>
    <c:when test="true">
        <p>두번째 when</p>
    </c:when>
    <c:otherwise>
        <p>otherwise 부분</p>
    </c:otherwise>
</c:choose>
</body>
</html>
