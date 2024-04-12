<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- navbar2.jsp 출력 , 절대경로 사용--%>
<c:import url="/WEB-INF/fragment/navbar2.jsp"/>
<%-- navbar2.jsp 출력 , 상대경로 사용--%>
<c:import url="../../../fragment/navbar2.jsp"/>
<div>
    sub2 content
</div>

<%-- footer2.jsp 출력, 절대경로 사용--%>
<c:import url="/WEB-INF/fragment/footer2.jsp"/>
<%-- footer2.jsp 출력, 상대경로 사용--%>
<c:import url="../../../fragment/footer2.jsp"/>
</body>
</html>
