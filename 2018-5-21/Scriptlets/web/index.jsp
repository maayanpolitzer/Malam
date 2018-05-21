<%--
  Created by IntelliJ IDEA.
  User: maayanpolitzer
  Date: 21/05/2018
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%@include file="header.jsp"%>
  <hr/>
  <% int i = 6;

  %>
  <%!
    public String sayHi(){
      return "hi";
    }
  %>

  <%
    if(4 > 3){
      out.print("<h1>lksdf</h1>");
   } %>

  <% i++;%>
  <%--<%=i / 0%>--%>

  <h1> Hello from <%=i%> <%=sayHi()%></h1>
  <hr/>
  <%@include file="footer.html"%>
  </body>
</html>


