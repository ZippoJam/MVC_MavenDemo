<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/19
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<%-- 如果公司使用 jsp 这种是必用的 --%>
<jsp:include page="test002.jsp"></jsp:include>

<%
    int num=10;
%>
ssss

<%=num%>

<jsp:include page="test002.jsp"></jsp:include>
</body>
</html>
