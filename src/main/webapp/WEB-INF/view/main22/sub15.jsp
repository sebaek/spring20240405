<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    <div style="padding: 20px; background-color: lightblue">${message}</div>
</c:if>
<%--h1>lorem3^p>lorem--%>
<h1>Lorem ipsum dolor.</h1>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid, aperiam eveniet ex maxime nam provident ullam! Cum
    debitis deleniti dicta dolore earum, eius inventore nesciunt nulla perspiciatis reiciendis repellendus ut.
</p>
</body>
</html>
