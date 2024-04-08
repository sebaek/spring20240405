<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- attributeName["key"] --%>
<h1>${myMap["name"]}</h1>
<h1>${myMap["age"]}</h1>
<h1>${myMap["address"]}</h1>
<hr>
<%-- attributeName.key --%>
<h1>${myMap.name}</h1>
<h1>${myMap.age}</h1>
<h1>${myMap.address}</h1>
</body>
</html>
