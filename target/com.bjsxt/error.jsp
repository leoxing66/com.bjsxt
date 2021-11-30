<%--
  Created by IntelliJ IDEA.
  User: my
  Date: 2020/3/20
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>$Title$</title>
    <base href="<%=request.getContextPath()+"/"%>">
</head>
<body>
  
  <img src="imgs/0.jpg">

  <%--如果当前页面想要使用 exception对象 需要在页面中增加  isErrorPage='true'--%>
  <%=exception.getMessage()%>


</body>
</html>
