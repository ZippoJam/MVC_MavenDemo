<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/26
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script>

        //定义json格式数据
        //var  userJson = {键：值};  一个值
       // var  userJson = {键：值,键2：值2};  一个值
        var  userJson={"name":"张三","age":23,'sex':"男"};
        //如何获取
        var name = userJson.name;
        var sex = userJson["sex"];

        //alert(name);
       // alert(sex);

        //{"name":"张三","age":23,'sex':"男"}    {"name":"李四","age":18,'sex':"男"}
        //{"name":"好人1","age":18,'sex':"女"}
        //嵌套格式   [{},{},{}]
        //var userJSons=[{"name":"张三","age":23,'sex':"男"},{"name":"李四","age":18,'sex':"男"}{"name":"好人1","age":18,'sex':"女"}];
        var userJSons=[
            {"name":"张三","age":23,'sex':"男"},
            {"name":"李四","age":18,'sex':"男"},
            {"name":"好人1","age":18,'sex':"女"}
        ];
       /* var user1=userJSons[2];
        alert(user1.name);*/

        //循环遍历
        for( var key in userJSons){
            alert(userJSons[key].name);
        }




    </script>
</head>
<body>
ddddd
</body>
</html>
