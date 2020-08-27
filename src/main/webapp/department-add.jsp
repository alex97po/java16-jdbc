<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add department</title>
    </head>
    <body>
        <form action="/api/departments" method="post">
            Name: <input type="text" name="name">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
