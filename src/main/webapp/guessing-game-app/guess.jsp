
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Guessing Page" />
    </jsp:include>
</head>
<body>
<div class="container">
    <h1>Guess A Number Between 1 and 3</h1>
    <form action="/guess" method="POST">
        <div class="form-group">
            <label for="userGuess">Guess</label>
            <input id="userGuess" name="userGuess" class="form-control" type="text">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
