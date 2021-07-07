<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/17
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

需求：小王
0-22   好好学习
22-30 可以结婚生娃
30-50  一边工作，一边浪
50-70 安乐死
70:   房产过期，睡大马路

<br>
<c:set var="age" value="80"></c:set>

<c:choose>

    <c:when test="${age<22 && age>0}">好好学习</c:when>
    <c:when test="${age<30 && age>=22}">可以结婚生娃</c:when>
    <c:when test="${age<50 && age>=30}">一边工作，一边浪</c:when>
    <c:when test="${age<70 && age>=50}">安乐死</c:when>
    <c:otherwise>房产过期，睡大马路</c:otherwise>

</c:choose>



</body>
</html>
