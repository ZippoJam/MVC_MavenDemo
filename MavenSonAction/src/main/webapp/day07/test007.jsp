<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/19
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


获取page存值<%=pageContext.getAttribute("pageKey")%><br>
获取request存值<%=request.getAttribute("requestKey")%><br>
获取session存值<%=session.getAttribute("sessionKey")%><br>
获取application存值<%=application.getAttribute("applicationKey")%><br>


获取form表单<%=request.getParameter("ccccc")%><br>

</body>
</html>
