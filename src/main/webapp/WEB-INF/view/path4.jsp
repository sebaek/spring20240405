<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>path4 jsp</h3>

<div>누구나 보는 컨텐츠</div>
<sec:authorize access="isAuthenticated()">
    <div>로그인 해야 보이는 컨텐츠</div>
</sec:authorize>
<sec:authorize access="not isAuthenticated()">
    <div>로그인 안해야 보이는 컨텐츠</div>
</sec:authorize>
<sec:authorize access="hasAuthority('admin')">
    <div>어드민만 보이는 컨텐츠</div>
</sec:authorize>

</body>
</html>
