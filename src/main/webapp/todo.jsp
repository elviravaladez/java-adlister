<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("isAdmin", true); %> <%-- Imagine this was inside a servlet. Whati if this person was NOT an admin. How can we show the admin navbar--%>
<%--ANSWER: Inlude a conditional to check to see if the user is an admin. If they are display the navbar. If they are not DON'T--%>
<html>
<head>
    <title>To Do</title>
</head>
<body>
<h1>Here is your list</h1>
<ul>
    <li>
        <%--Add List Here--%>
        <%=request.getParameter("item")%>
    </li>
    <p><%=request.getMethod()%></p>
</ul>
</body>
</html>