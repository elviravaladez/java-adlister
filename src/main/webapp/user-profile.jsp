<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
<h3>Welcome, <%=request.getParameter("username")%></h3>
<h3>Your user id is: <%=request.getParameter("user-id")%></h3>
<p><%=request.getMethod()%></p> <%--Tells us the type of method our request was: GET, etc.--%>
</body>
</html>