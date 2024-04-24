<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>고객 조회 및 수정</h3>
<form>
    번호
    <input type="number" name="id">
    <button>조회</button>
</form>
<hr>
<c:if test="${empty customer}">
    조회된 결과가 없습니다.
</c:if>
<c:if test="${not empty customer}">
    <form action="/main32/sub7/update" method="post">

        <div>번호
            <input type="number" value="${customer.id}" readonly name="id">
        </div>
        <div>
            이름
            <input type="text" value="${customer.name}" name="name">
        </div>
        <div>
            계약명
            <input type="text" value="${customer.contactName}" name="contactName">
        </div>
        <div>
            주소
            <input type="text" value="${customer.address}" name="address">
        </div>
        <div>
            도시
            <input type="text" value="${customer.city}" name="city">
        </div>
        <div>
            우편번호
            <input type="text" value="${customer.postalCode}" name="postalCode">
        </div>
        <div>
            국가
            <input type="text" value="${customer.country}" name="country">
        </div>
        <div>
            <input type="submit" value="수정">
        </div>
    </form>

</c:if>
</body>
</html>
