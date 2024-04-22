<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>고객 정보 수정</h3>
<form action="">
    번호
    <input type="text" name="id">
    <button>조회</button>
</form>
<hr>
<div>
    번호
    <input type="text" value="${customer.id}">
</div>
<div>
    이름
    <input type="text" value="${customer.name}">
</div>
<div>
    계약명
    <input type="text" value="${customer.contactName}">
</div>
<div>
    주소
    <input type="text" value="${customer.address}">
</div>
<div>
    도시
    <input type="text" value="${customer.city}">
</div>
<div>
    우편번호
    <input type="text" value="${customer.postalCode}">
</div>
<div>
    국가
    <input type="text" value="${customer.country}">
</div>
</body>
</html>
