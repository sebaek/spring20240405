<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- el의 내장 객체 param : request parameter 를
    key, value 쌍으로 저장한 Map--%>
<%-- ${param["name"]} --%>
<div>name : ${param.name}</div>
<div>age : ${param.age}</div>
<div>city : ${param.city}</div>
<div>address : ${param.address}</div>
<div>model : ${param.model}</div>

<hr>
<%-- 요청 주소에 적절한 query string 작성--%>
<div>${param.title}</div>
<div>${param.content}</div>
<div>${param.car}</div>
</body>
</html>
