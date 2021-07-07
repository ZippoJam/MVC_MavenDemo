<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/19
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--session失效时间 默认30 分钟
       第一种修改失效时间  在tomcat 配置中  web.xml文件中有这么一个配置文件  一般不会修改
          <session-config>
        <session-timeout>30</session-timeout>
    </session-config>


        第二种修改失效时间 在工程 web.xml文件中修改，只对当前功程有效


        第三种在servlet文件中修改


    --%>
    <%

            HttpSession session1 =request.getSession(true);
            session1.setMaxInactiveInterval(10);//这个是为秒
        session1.setAttribute("ccccc","10秒结束 ");
    %>

</body>
</html>
