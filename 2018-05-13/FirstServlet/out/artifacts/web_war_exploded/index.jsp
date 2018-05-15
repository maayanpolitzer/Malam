<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>wow</title>
  </head>
  <body>
  <!--
    <% Calendar now = Calendar.getInstance(); %>
    <p> &copy; <%=now.get(Calendar.YEAR) %> Maayan Politzer</p>
  -->
    <% for(int i = 0; i < 10; i++){ %>
      <h1>Hi <%=i%></h1>
    <% } %>
  </body>
</html>