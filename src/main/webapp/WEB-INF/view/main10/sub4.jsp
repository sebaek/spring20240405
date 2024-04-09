<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${list1[1].korea}</p>
<p>${list1[number1].korea}</p>
<%--해운대--%>
<p>${list1[2]["부산"]}</p>
<p>${list1[two]["부산"]}</p>

<p>${list1[3]["서울"]}</p>
<p>${list1[three]["서울"]}</p>
<p>${list1["3"]["서울"]}</p>

<p>${list1[0][data1]}</p>
<p>${list1[1][data2]}</p>
</body>
</html>
