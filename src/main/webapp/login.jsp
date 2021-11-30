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


    <h3>登录页面</h3>

<form  action="UserLogin" method="post">

      <p>
          <%--EL表达式--%>
          用户名:<input type="text" name="uname" id="uname" /><%=request.getAttribute("msg")%>
<%--              ${requestScope.msg}--%>
      </p>

      <p>
         密码:<input type="password" name="pwd" id="pwd" />

      </p>
      <p>
         <input type="submit" value="登录" />
      </p>

</form>
    没有账号,<a href="save.jsp">立即注册</a>



</body>
</html>
