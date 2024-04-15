<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <%--    value : 기본값--%>
    <input type="text" value="jordan">
</div>
<div>
    <%--    readonly : 변경불가--%>
    <input type="text" value="messi" readonly>
</div>
<div>
    <%--    size : 표시되는 인풋의 길이--%>
    <input type="text" size="5">
</div>
<div>
    <%--    maxlength : 입력값 길이 제한--%>
    <input type="text" maxlength="5">
</div>
<div>
    <%--    min : 최소값, max : 최대값--%>
    <input type="number" min="10" max="20">
</div>
<div>
    <%--    multiple : 여러개 선택 가능--%>
    <input type="file" multiple>
</div>
<div>
    <%--    placeholder : 입력값 힌트 주기--%>
    <input type="text" placeholder="입력값 힌트 주기">
</div>
</body>
</html>
