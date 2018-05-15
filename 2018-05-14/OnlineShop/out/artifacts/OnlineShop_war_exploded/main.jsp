<%@ page import="server.model.Item" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: maayanpolitzer
  Date: 14/05/2018
  Time: 9:43
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
    if (session.getAttribute("username") == null) {
        response.sendRedirect("index.jsp");
    }
%>

<%--<form action="Auth" method="post"> same method as login--%>
<form action="Auth" method="get">
    <input type="submit" value="Logout"/>
</form>

<h2>Welcome <%=session.getAttribute("username")%>
</h2>

<ul>
    <% double amount = 0; %>
    <%

        for (Item item : (List<Item>) request.getAttribute("items")) {
            amount += item.getPrice();
    %>
    <li><%=item.getId()%>: <%=item.getName()%> - <%=item.getPrice()%>
    </li>
    <% } %>
</ul>


<form action="Checkout" method="get">
    <input type="hidden" name="amount" value="<%=amount%>"/>
    <input type="submit" value="checkout"/>
</form>

<br/>

<%
    String action = request.getParameter("action");
    if (action != null) {
        if (action.equals("user_created")) {
%>
<p style="color: #555;">Thanks!!! user created</p>
<%
} else if (action.equals("user_error")) {
%>
<p style="color: #f00;">An error occured</p>
<%
        }
    }
%>

<form action="Users" method="post">
    Username: <input type="text" name="username"/>
    <br/>
    Password: <input type="password" name="password"/>
    <br/>
    <input type="submit" value="Create new user"/>
</form>

</body>
</html>
