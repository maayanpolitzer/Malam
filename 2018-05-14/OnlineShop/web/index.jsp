<%--
  Created by IntelliJ IDEA.
  User: maayanpolitzer
  Date: 14/05/2018
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1> Welcome</h1>

    <%
      String action = request.getParameter("action");
      if(action != null && action.equals("error")){%>
        <p style="color:red">Wrong user credentails.</p>
      <%}
      if(action != null && action.equals("logout")){ %>
        <p style="color:green">You've just logged out.</p>
      <%}
    %>


    <form method="post" action="Auth">
      Username: <input type="text" name="username"/>
      <br/>
      Password: <input type="password" name="password"/>
      <br/>
      <%--<input type="hidden" name="action" value="login"/>--%>
      <input type="submit" value="Login"/>
    </form>

  </body>
</html>
