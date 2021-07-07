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
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>

    <script>
/*
        $(function () {
            alert("必需先测试了，如果这个没有弹，请不要操作后面的任何代码");
            alert("如果还是不行，重新创建一个新的工程再试");
        });*/
    </script>

    <script>
        
       /* function  checkUserName() {
            var userName = document.getElementById("userName");
            alert(userName.value);
            //请大家一定先这样测试一次，如果没有进来，后面的也没用
            //如果不测试，本来是这里的问题，你还去找其它错误
        }*/

     /*  //值改变事件
       function  checkUserName() {
           var userName = document.getElementById("userName").value;
           $.ajax({
               type: "POST",
               url: "${pageContext.request.contextPath}/findUserByName",// 调用后台的控制层代码
               data: "userName="+userName,//需要传的参数
               success: function(sbq){//这个是调用完后台代码，返回了这个sbq变量中的值然后执行的函数，
                  // alert( "Data Saved: " + sbq );
                   document.getElementById("sbqFlag").value=sbq;

                   if(sbq=='1'){
                       document.getElementById("userNameErr").innerHTML="用户已经存在了";
                   }else {
                       document.getElementById("userNameErr").innerHTML="可以注册";
                   }
               }
           });
       }*/


        //值改变事件
       function  checkUserName() {
           alert("sss");
           var userName = document.getElementById("userName").value;
           $.ajax({
               type: "POST",
               url: "${pageContext.request.contextPath}/findUserByName",// 调用后台的控制层代码
               //data: { key:值   ,  key2:值2},//需要传的参数
               data: {
                   //userName:userName ,
                   "userName":userName ,
                   id:123
               },
               success: function(sbq){//这个是调用完后台代码，返回了这个sbq变量中的值然后执行的函数，
                  // alert( "Data Saved: " + sbq );
                   document.getElementById("sbqFlag").value=sbq;

                   if(sbq=='1'){
                       document.getElementById("userNameErr").innerHTML="用户已经存在了";
                   }else {
                       document.getElementById("userNameErr").innerHTML="可以注册";
                   }
               }
           });
       }

       //当我点注册的时候，先进来这个方法，我们之前在讲js表单验证的时候有重点讲解
       function  checkAll() {
            var sbqFlag = document.getElementById("sbqFlag").value;
            if(sbqFlag=='1'){
                alert("不能提交代码")
                return false;
            }

           alert("可以提交代码")
            return false;
       }
    </script>
</head>
<body>

<h1>添加用户</h1>
    <form action="${pageContext.request.contextPath}/addUser.do" method="post" onsubmit="return checkAll();">
        得到的结果不能显示 ：<input type="hidden" id="sbqFlag" value="1"><br>

        用户名：<input type="text" id="userName" name="userName" onchange="checkUserName()">
        <span id="userNameErr"></span>
        <br>
        密码:<input type="password" name="pwd"><br>
        地址:<input type="text" name="address"><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
