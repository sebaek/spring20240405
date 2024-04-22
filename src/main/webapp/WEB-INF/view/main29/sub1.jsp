<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>고객 조회</h3>
<form>
    고객 번호
    <input type="number" name="id">
    <button>조회</button>
</form>
<hr>
<c:if test="${empty customer}">
    조회된 고객이 없습니다.
</c:if>
<c:if test="${not empty customer}">

    <div>
        번호
        <input type="number" readonly value="${customer.id}">
    </div>
    <div>
        이름
        <input type="text" readonly value="${customer.name}">
    </div>
    <div>
        계약명
        <input type="text" readonly value="${customer.contactName}">
    </div>
    <div>
        주소
        <input type="text" readonly value="${customer.address}">
    </div>
    <div>
        도시
        <input type="text" readonly value="${customer.city}">
    </div>
    <div>
        우편번호
        <input type="text" readonly value="${customer.postalCode}">
    </div>
    <div>
        국가
        <input type="text" readonly value="${customer.country}">
    </div>
</c:if>

</body>
</html>
