<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>用户登陆222</title>
        <script>


            function checkAll() {
                //这里的代码就是js的表单验证，大家自己完成。
                return true;
            }

        </script>
	</head>
	<body>

    看看我有没有值${keySbq} <br>

    看看我有没有值${user.sbqName} <br>


    <c:if test="${not empty user}" var="sbqB">
        <%
            response.sendRedirect("/UserProject005/userQuery.do");
        %>

    </c:if>

    <c:if test="${!sbqB}">
        <h1> 用户登陆2222444</h1>

        <form action="${pageContext.request.contextPath}/login006.do" method="post" onsubmit="return checkAll();">
            用户名：<input type="text"  name="userName" /> <br />
            密码： <input type="password" name="pwd"  /> <br />
            <input type="submit" value="提交" />
        </form>
    </c:if>




	</body>
</html>
