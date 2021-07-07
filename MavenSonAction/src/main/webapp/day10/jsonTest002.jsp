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

        var userJSons1={
            "users":[
                {"name":"张三","age":23,'sex':"男"},
                {"name":"李四","age":18,'sex':"男"},
                {"name":"好人1","age":18,'sex':"女"}
            ]

        };

     /* var userJSons=[
            {"name":"张三","age":23,'sex':"男"},
            {"name":"李四","age":18,'sex':"男"},
            {"name":"好人1","age":18,'sex':"女"}
        ];*/
        var name1=userJSons1.users[1].name;
       // alert(name1)




        //json 转为字符串
        var  userJson={"name":"张三","age":23,'sex':"男"};
        var userStr = JSON.stringify(userJson);
        alert(typeof userStr);


        //很多情况下，从后台传递过来的时候就是字符串 必需转为json
        var jsonUser = JSON.parse(userStr);//这是把字符串的json数据转为json格式
        alert(typeof jsonUser);

        
    </script>
</head>
<body>
ddddd
</body>
</html>
