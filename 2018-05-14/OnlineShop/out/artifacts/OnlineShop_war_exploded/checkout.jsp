<%--
  Created by IntelliJ IDEA.
  User: maayanpolitzer
  Date: 14/05/2018
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    response.setHeader("Cache-Control", "no-cache, must-revalidate, no-store");
    if(session.getAttribute("username") == null){
        response.sendRedirect("index.jsp");
    }
%>
<form action="Auth" method="get">
    <input type="submit" value="Logout"/>
</form>

<%--<h1> Please pay: <%=request.getAttribute("amount")%></h1>--%>
<h1> Please pay(2): <%=request.getParameter("amount")%></h1>

</body>
</html>
