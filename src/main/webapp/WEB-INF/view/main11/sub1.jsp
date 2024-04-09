<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Expression Language</p>
<p>간단한 연산 사용 가능</p>
<p>산술연산, 논리연산, 비교연산</p>

<h3>산술연산, +, -, *, /, %</h3>
<%-- 8 --%>
<p>${5 + 3}</p>
<%-- 4 --%>
<p>${7 - 3}</p>
<%-- 24 --%>
<p>${8 * 3}</p>
<%-- 3 --%>
<p>${6 / 2}</p>
<%-- 3.5 --%>
<p>${7 / 2}</p>
<%--3.5--%>
<p>${7 div 2}</p>
<%--1--%>
<p>${7 % 2}</p>
<%--3--%>
<p>${15 mod 4}</p>
<%-- 문자열 사용 가능--%>
<%-- 7 --%>
<p>${"3" + "4"}</p>
<%--<p>${"three" + "four"}</p>--%>

<p>${num1} + ${num2} = ${num1 + num2}</p>
</body>
</html>



