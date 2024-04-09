<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>empty 연산자</h3>
<p>길이가 0인 컬렉션, 문자열, 존재하지 않는 attribute, null 일 때 true</p>
<p>${empty attr1}</p>
<p>${empty attr2}</p>
<p>${empty attr3}</p>
<p>${empty attr4}</p>
<p>${empty ""}</p>
<p>${empty attr0}</p>
<p>${empty attr5}</p>
<p>${empty 0}</p>
<hr>
<p>${not empty attr1}</p>
<p>${not empty attr2}</p>
<p>${not empty attr3}</p>
<p>${not empty attr4}</p>

</body>
</html>
