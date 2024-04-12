<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="attr1" value="page value1" scope="page"/>
<c:set var="attr1" value="request value1" scope="request"/>
<c:import url="navbar5.jsp"/>

<div>
    <div>
        <%--        page value1 --%>
        ${attr1}, ${pageScope.attr1}, ${pageScope["attr1"]}
    </div>
    <div>
        <%--        request value1--%>
        ${requestScope.attr1}, ${requestScope["attr1"]}
    </div>
</div>
</body>
</html>
