<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }

        table {
            width: 100%;
        }
    </style>
</head>
<body>
<h3>상품 조회</h3>
<form>
    <input value="${prevSearch}" type="text" name="search" placeholder="조회할 상품명 입력">
    <%--    form 내의 button 요소는 submit 버튼 역할함 --%>
    <button>조회</button>
</form>
<hr>
<form>
    카테고리 선택
    <div>
        <select name="category" multiple>
            <c:forEach items="${categoryList}" var="category">
                <c:set value="false" var="selected"></c:set>
                <c:forEach items="${prevCategorySelect}" var="prevSelect">
                    <c:if test="${category.id == prevSelect}">
                        <c:set var="selected" value="true"></c:set>
                    </c:if>
                </c:forEach>

                <option ${selected ? "selected" : ""} value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        <button>조회</button>
    </div>
</form>
<hr>

<c:if test="${empty products}" var="emptyProducts">
    <p>조회된 상품이 없습니다.</p>
</c:if>

<c:if test="${not emptyProducts}">

    <table>
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>supplier id</th>
            <th>category id</th>
            <th>unit</th>
            <th>price</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.supplierId}</td>
                <td>${product.categoryId}</td>
                <td>${product.unit}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>

</body>
</html>
