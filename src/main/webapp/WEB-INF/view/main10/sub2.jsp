<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${myAttr[0].son}</p>
<p>${myAttr[0].lee}</p>
<p>${myAttr[0].kim}</p>

<%-- seoul--%>
<p>${myAttr[1].korea}</p>
<%-- tokyo--%>
<p>${myAttr[1].japan}</p>
<%-- 워싱턴--%>
<p>${myAttr[1]["미국"]}</p>
</body>
</html>
