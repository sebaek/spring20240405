<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>/main8/sub1.jsp 입니다.</h1>
<%-- jsp 주석 --%>
<%-- ${attribute명}을 작성하면
    해당 attribute명에 매핑된 attribute value가 출력됨 --%>
<h1>${name1}</h1>
<h1>컨트롤러에서 전달해준 값은 ${name1}입니다.</h1>
<h1>컨트롤러에서 전달해준 또 다른 값은 ${name2} 입니다.</h1>
</body>
</html>
