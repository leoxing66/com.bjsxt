<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: my
  Date: 2020/3/14
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>

</head>
<body>


    <h3 align="center">注册页面</h3>

 <center>
<form  action="UserSave" method="post">

      <p>

          用户名:<input type="text" name="uname" id="uname" />${requestScope.msg}

      </p>

      <p>
         密码:<input type="password" name="pwd" id="pwd" />

      </p>
      <p>
         <input type="submit" value="立即注册" />
      </p>

</form>
 </center>


</body>
</html>
