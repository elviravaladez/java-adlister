<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Advertistments" />
    </jsp:include>
</head>
<body>
<h1>Here are all the ads:</h1>

<c:forEach var = "ad" items="${ads}">
    <div class="ad">
        <h2>${ad.id}</h2>
        <h2>${ad.title}</h2>
        <h2>${ad.userId}</h2>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>