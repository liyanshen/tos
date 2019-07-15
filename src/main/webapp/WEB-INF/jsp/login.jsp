<%--
  Created by IntelliJ IDEA.
  User: mili
  Date: 2019/7/13
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <title>this.is login page</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>
<input type="text" id="sysUserName" required="required" autofocus placeholder="请输入登录名">
<input type="password" id="sysUserPassword" required="required" placeholder="请输入密码">
<span id="msg" style="color: red;font-size: 14px"></span>
<button id="ok">确认</button>

<script>
    $("#ok").click(function(){
        $("#msg").text("");
        if($("#sysUserName").val().trim() != "" && $("#sysUserPassword").val().trim() != "") {

            $.ajax({
                url:"${pageContext.request.contextPath}/sysUser/login",
                data:{
                    "sysUserName" : $("#sysUserName").val(),
                    "sysUserPassword": $("#sysUserPassword").val()
                },
                success: function(data){
                    console.info(data);
                    if (data == '0'){
                        location.href = "admin.jsp";
                    } else if (data == '1') {
                        location.href = "main.jsp";
                    }else{
                        $("#msg").text(data);
                    }
                },
                error : function () {

                }
            });
        }else {
            $("#sysUserName").val("");
            $("#sysUserPassword").val("");
            $("#sysUserName").focus();
        }
    });
</script>
</body>
</html>
