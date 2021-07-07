<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/19
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
            /*这些没有new对象就可以使用的，称之为jsp内置对象  9大内置对象*/
            out.print("1111");/*输出*/
            /*request  代表请求对象*/

        /*PrintWriter out= resp.getWriter();
        out.println("把结果响映给浏览器");*/
            /*response 代表是响应对象 */
      /*  application  全局servlet上下文对象*/
       /* page  代表 当前jsp*/
       /* pageContext jsp上下文*/
       /* session 代表一次会话*/

    %>


通过page存值<% pageContext.setAttribute("pageKey","page值1"); %> <br>
通过request存值<% request.setAttribute("requestKey","request值2"); %><br>
通过session存值<% session.setAttribute("sessionKey","session值3"); %><br>
通过application存值<% application.setAttribute("applicationKey","application值4"); %><br>

获取page存值<%=pageContext.getAttribute("pageKey")%><br>
获取request存值<%=request.getAttribute("requestKey")%><br>
获取session存值<%=session.getAttribute("sessionKey")%><br>
获取application存值<%=application.getAttribute("applicationKey")%>

<form action="test007.jsp" method="post" >

    <input name="ccccc" value="dddd">

    <input type="submit" value="提交">

</form>



</body>
</html>
