<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style>
    .active {
        background-color: lightblue;
    }

    a {
        border: 1px solid black;
    }
</style>
<div style="display: flex; justify-content: space-between">
    <div>
        <a class="${param.current eq 'sub3' ? 'active' : ''}" href="/main17/sub3">sub3</a>
        <a class="${param.current eq 'sub4' ? 'active' : ''}" href="/main17/sub4">sub4</a>
        <a class="${param.current eq 'sub5' ? 'active' : ''}" href="/main17/sub5">sub5</a>
    </div>
    <div>
        <c:if test="${not empty sessionScope.userName}" var="loggedIn">
            ${sessionScope.userName} 님

            <a href="/main17/sub9">logout</a>
        </c:if>
        <c:if test="${not loggedIn}">
            guest 님
        </c:if>
    </div>
</div>
