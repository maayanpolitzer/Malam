<%--
  Created by IntelliJ IDEA.
  User: maayanpolitzer
  Date: 21/05/2018
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game over</title>
</head>
<body>
    <%--&lt;%&ndash;<%=session.getAttribute("score")%>&ndash;%&gt; will show "null" if there is no value.--%>
    ${sessionScope.score / 2}   <%--// will NOT show "null"--%>
    <%
        session.removeAttribute("score");
        session.invalidate();
    %>
</body>
</html>
