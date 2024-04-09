<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--값 1--%>
<p>${data}</p>
<p>${requestScope.data}</p>
<p>${requestScope["data"]}</p>

<p>${requestScope["데이타"]}</p>
<p>${requestScope["3"]}</p>
</body>
</html>
