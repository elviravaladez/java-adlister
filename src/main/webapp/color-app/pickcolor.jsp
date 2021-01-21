<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Pick Color" />
    </jsp:include>
</head>
<body>
<h1>Any color!</h1>

<form action="/viewcolor" method="POST">
    <label for="color">You Picked: </label>
    <input type="text" name="color" id="color">

    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
