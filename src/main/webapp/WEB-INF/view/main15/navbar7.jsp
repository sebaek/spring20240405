<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style>
    a {
        border: 10px solid black;
    }

    .active {
        border-bottom-color: blue;
    }
</style>
<div>
    <a href="/main15/sub12" class="${param.current eq 'sub12' ? 'active' : ''}">sub12</a>
    <a href="/main15/sub13" class="${param.current eq 'sub13' ? 'active' : ''}">sub13</a>
</div>
