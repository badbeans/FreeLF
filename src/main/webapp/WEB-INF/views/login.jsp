<%--
  Created by IntelliJ IDEA.
  User: RENQI
  Date: 2016/11/13
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">


</head>
<body>
<div>
    UserName:<input type="text" name="username" /> <br/>
    PassWord:<input type="password" name="userpwd" /><br/>
    <input type="submit" id="loginBtn" value="Login" />
</div>

<script type="text/javascript" src="/resources/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
        $("#loginBtn").click(function() {
            alert(0)
            console.log("login");
            var username = $("input[name=username]").val();
//            var password = hex_md5($("input[name=userpwd]").val());
            var password = $("input[name=userpwd]").val();
            var user = {
                "username" : username,
                "userpwd" : password
            };
            $.ajax({
                type : "post",
                dataType : "json",
                data : user,
                contentType : "application/x-www-form-urlencoded;charset=UTF-8",
                url : "/user/login.htmls",
                // 同步async: false,（默认是true）;
                // 如上：false为同步，这个方法中的Ajax请求将整个浏览器锁死，
                // 只有test.jsp执行结束后，才可以执行其它操作。
                async : false,
                success : function(data) {
                    if (false == data.loginResult) {
                        alert("用户名或者密码错误，请重新登录！");
                    } else if (true == data.loginResult) {
                        alert("登录成功！");
                        return false;
                    }
                },
                error : function() {
                    alert("服务器发生故障，请尝试重新登录！");
                    return false;
                }
            });
        });

</script>
</body>
</html>
