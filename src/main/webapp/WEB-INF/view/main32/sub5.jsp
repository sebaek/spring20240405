<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="padding: 10px;">${message}</div>

<h3>직원 입력</h3>
<form method="post">
    <div>
        last Name
        <input type="text" name="lastName">
    </div>
    <div>
        first Name
        <input type="text" name="firstName">
    </div>
    <div>
        birth date
        <input type="date" name="birthDate">
    </div>
    <div>
        photo
        <input type="text" name="photo">
    </div>
    <div>
        notes
        <textarea name="notes" id="" cols="30" rows="10"></textarea>
    </div>
    <div>
        <input type="submit" value="등록">
    </div>
</form>

</body>
</html>
