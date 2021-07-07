<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/22
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        
        function  checkUserName() {
            alert("ddd");
            var userName = document.getElementById("userName");
            alert(userName.value);
            //请大家一定先这样测试一次，如果没有进来，后面的也没用
            //如果不测试，本来是这里的问题，你还去找其它错误
        }
    </script>
</head>
<body>

<h1>添加用户</h1>
    <form action="${pageContext.request.contextPath}/addUser.do" method="post">

        用户名：<input type="text" id="userName" name="userName" onchange="checkUserName()"><br>
        密码:<input type="password" name="pwd"><br>
        地址:<input type="text" name="address"><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
