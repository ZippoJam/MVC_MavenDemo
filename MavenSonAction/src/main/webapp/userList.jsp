<%@ page import="com.javacto.service.UserService" %>
<%--isELIgnored="false" 必需加这个，支持EL表达式，后面讲--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <title>Title</title>
</head>
<body>


<c:if test="${not empty user}"  var="cccc">

</c:if>

<c:if test="${!cccc}"  var="cccc">
    <%
        response.sendRedirect("/UserProject005/login.jsp");
    %>
</c:if>


看看我有没有值：${keySbq}<br>

<%--不会这样写，不会这写，只是讲思路--%>

<form>
    <table width="80%" border="1" cellpadding="0" cellspacing="0">
        <tr>
            <td>id</td>
            <td>用户名</td>
            <td>性别</td>
            <td>地址</td>
            <td>日期</td>
            <td>操作</td>
        </tr>

        <%--begin="2"  下标从0开始 --%>
        <c:forEach var="li" items="${list}">
            <tr>
                <td>${li.sbqId}</td>
                <td>${li.sbqName}</td>
                <td>${li.tsbqSex}</td>
                <td>${li.tsbqAddress}</td>
                <td>${li.sbqDate}</td>
                <td>

                    <a href="addUser.jsp">添加</a>
                        <%--
                        deleteUser.do
                        如果传一个值 deleteUser.do?sbqNum=1
                        如果传两个值  deleteUser.do?sbqNum=1&sbqStr=张三
                        如果传三个值 deleteUser.do?sbqNum=1&sbqStr=张三&sbqStr2=李四

                        --%>
                        <a href="${pageContext.request.contextPath}/deleteUser.do?id=${li.sbqId}">删除</a>


                    <a href="${pageContext.request.contextPath}/findByUserId.do?id=${li.sbqId}">修改，必需先通过id查询出数据</a>

                </td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
