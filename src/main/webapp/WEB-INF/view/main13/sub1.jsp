<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- set : attribute 추가--%>
<c:set var="attr1" value="손흥민"></c:set>
<%-- todo : attr2 속성 추가하기--%>

<p>${attr1}</p>

<%--이강인--%>
<p>${attr2}</p>
</body>
</html>
