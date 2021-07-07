<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/19
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

需求：传过来的值就是1  2  1代表男   2代表女<br>
<c:set var="sex" value="2"></c:set>

输出值为:${sex }<br>

<c:if test="${sex==1 }">checked</c:if>
<c:if test="${sex==2 }">checked</c:if>

<%--如果有问题的时候，请注意单双引号  双引不能包括双引号，  单引号不能包括单引号--%>
<br>
性别  ： <input type="radio" name="sex" value="1" <c:if test="${sex==1 }">checked</c:if> >  男
<input type="radio" name="sex" value="2" <c:if test="${sex==2 }">checked</c:if>>  女
</body>
</html>
