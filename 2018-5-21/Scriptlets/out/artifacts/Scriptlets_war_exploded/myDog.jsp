<%--<%@ page import="server.Dog" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: maayanpolitzer
  Date: 21/05/2018
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    <%Dog dog = (Dog)request.getAttribute("dog");%>
    <h1>
        <%=dog.getName()%>
    </h1>
    --%>
<jsp:useBean id="dog" type="server.Dog" scope="request"/>

name=    <jsp:getProperty name="dog" property="age"/>

</body>
</html>
