<!DOCTYPE html>
<%@ page isErrorPage="true" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
 try again later
<%=exception.toString()%>
<% response.sendRedirect("arit.jsp");
</body>
</html>