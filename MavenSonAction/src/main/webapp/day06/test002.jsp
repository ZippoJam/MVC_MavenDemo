<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/17
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--通过jstl表式来塞值--%>
    <c:set var="sbqKey" value="我存的值222"></c:set>
    通过el表达式或取值：${sbqKey}
    <br>

    需求：小王   如果18岁以上就不需要听妈的话(不包括)  ，如果小于18（包括18）需要好好学习天天向上<br>
    <%--int age = 18;
    if(age>18）{
    }--%>
    <c:set var="age" value="18"></c:set>
    小王 的年龄为： ${age} 岁  <br>
    <c:if test="${age>18}">
        不需要听妈的话,爱干嘛干嘛
    </c:if>
    <c:if test="${age<=18}">
        好好学习天天向上
    </c:if>



</body>
</html>
