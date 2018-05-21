<%@ page import="com.malam.models.Question" %>
<%@ page import="java.util.List" %>
<%@ page import="com.malam.models.Answer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %><%--
  Created by IntelliJ IDEA.
  User: maayanpolitzer
  Date: 21/05/2018
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .option {
        / / display: inline-block;
        / / width: 40 %;
            margin: 10px;
            border: 1px solid #000;
        }
    </style>
</head>
<body>
<%=session.getAttribute("username")%>
<br/>
<%--<%Question question = (Question) request.getAttribute("question");%>--%>
<%--<%=question.getName()%>--%>

<% List<Answer> answers = (List<Answer>) request.getAttribute("answers");%>
<%=answers.size()%>


${requestScope.question.name} <%-- EL - expression language. --%>
<br/>
${requestScope.question.rightAnswerId}
<%--${requestScope.answers.size()}--%>
<%--<br/>--%>
<%--${requestScope.answers.get(0).name}--%>
<%--
<%
if(answers != null){
    %>
    <%
    for(Answer answer : answers){
        %>
        <form action="test" method="get">
            <input type="hidden" name="question_id"
                   value="${requestScope.question.id}"/>
            <input type="hidden" name="answer_id" value="<%=answer.getId()%>"/>
            <input  type="submit"  value="<%=answer.getName()%>" />
            <%--<div class="option">--%>
<%--<p><%=answer.getName()%></p>--%>
<%--</div>--%>
<%--</form>--%>
<%--<%--%>
<%--}--%>
<%--%>--%>

<%--<%--%>
<%--}--%>
<%--%>--%>


<c:if test="${requestScope.answers} != null">
    <c:forEach items="${requestScope.answers}" var="answer" varStatus="loop">
        <form action="next" method="get">
            <input type="hidden" name="question_id"
                   value="${requestScope.question.id}"/>
            <input type="hidden" name="answer_id" value="${answer.id}"/>
            <input type="submit" value="${answer.name}"/>
        </form>
    </c:forEach>
</c:if>

</body>
</html>
