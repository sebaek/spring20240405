<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style>
    .menu-item {
        border: 1px solid black;
    }

    .active {
        background-color: yellow;
    }
</style>
<div>
    <%--a*2>span.menu-item--%>
    <a class="${param.cur eq 'sub10' ? 'active' : ''}" href="/main15/sub10">
        <span class="menu-item">sub10</span>
    </a>
    <a class="${param.cur eq 'sub11' ? 'active' : ''}" href="/main15/sub11">
        <span class="menu-item">sub11</span>
    </a>
</div>
