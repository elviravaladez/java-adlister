<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="View Color" />
    </jsp:include>
    <style>
        body {
            background: ${color};
        }
    </style>
</head>
<body>
</body>
</html>