<%@ page import="com.javacto.service.UserService" %>
<%--isELIgnored="false" 必需加这个，支持EL表达式，后面讲--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <title>Title</title>
</head>
<body>



<form action="${pageContext.request.contextPath}/">
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

    <table>
       <%-- <tr>
            <td>
                <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=1">首页</a>
                <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.curPageNo-1}">上一页</a>
                <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.curPageNo+1}">下一页</a>
                <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.totalPageCount}">末页totalPageCount</a>
            </td>
        </tr>--%>

         总共&nbsp;${sbqPage.totalPageCount}&nbsp; 页  当前第&nbsp;${sbqPage.curPageNo}&nbsp;页  总共&nbsp;${sbqPage.totalCount}&nbsp;条数据

        <tr>
            <td>
                <c:if test="${sbqPage.curPageNo>1}" var="flag">
                    <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=1">首页</a>
                    <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.curPageNo-1}">上一页</a>
                </c:if>

                <c:if test="${!flag}">
                    <a href="#">首页</a>
                    <a href="#">上一页</a>
                </c:if>

                <%--只有当前页小于 总页数--%>
                <c:if test="${sbqPage.curPageNo<sbqPage.totalPageCount}" var="ccccc">
                    <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.curPageNo+1}">下一页</a>
                    <a href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo=${sbqPage.totalPageCount}">末页totalPageCount</a>

                </c:if>

                <c:if test="${!ccccc}">
                    <a href="#">下一页</a>
                    <a href="#">末页</a>
                </c:if>

                <input type="number"  value="${sbqPage.curPageNo}" onclick="cccc(this.value);" size="5px">
                    <script>

                        function  cccc(sbq) {
                                alert(sbq)
                                window.location.href="${pageContext.request.contextPath}/userPageQuery.do?curPageNo="+sbq;
                        }
                    </script>
        </tr>
    </table>
</form>

</body>
</html>
