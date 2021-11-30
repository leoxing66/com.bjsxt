<%--
  Created by IntelliJ IDEA.
  User: my
  Date: 2020/3/20
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <base href="<%=request.getContextPath()+"/"%>">
</head>
<body>

      <%
         pageContext.setAttribute("msg","bjsxt");
      %>

      <%--动态包含 相当于方法调用 还是两个页面--%>
      <%--<jsp:include page="page2.jsp"></jsp:include>--%>

      <%--静态包含可以: 相当于代码的复制黏贴--%>
      <%@include file="page2.jsp"%>




</body>
</html>
