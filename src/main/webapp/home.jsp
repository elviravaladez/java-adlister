<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int pageNumber = 1; %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<h1>Hello Jupiter!</h1>
<%-- this is a JSP comment, you will *not* see this in the html --%>
<!-- this is an HTML comment, you *will* see this in the html -->
<p>The page number is: <%= pageNumber %></p>

<h3>View Spongebob's Profile</h3>
<form action="user-profile.jsp" method="get">
    <input type="hidden" id="username" name="username" value="Spongebob">
    <input type="hidden" id="user-id" name="user-id" value="12345">
    <button type="submit">Go There</button>
</form>

<h3>Add a To Do</h3>
<form action="todo.jsp" method="get">
    <input type="text" id="item" name="item">
    <button type="submit">Add to List</button>
</form>

<%@include file="partials/footer.jsp"%>
</body>
</html>