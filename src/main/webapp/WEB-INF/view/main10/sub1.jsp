<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- css --%>
<p>${myList.key1[1]}</p>
<%-- react --%>
<p>${myList.key2[0]}</p>
<%-- vue --%>
<p>${myList.key2[1]}</p>
<%-- spring --%>
<p>${myList["key 삼"][0]}</p>
<%-- node --%>
<p>${myList["key 삼"][1]}</p>
</body>
</html>
