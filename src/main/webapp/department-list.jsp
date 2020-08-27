<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
    <head>
        <title>Departments</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    </head>

    <body>
    <%@ include file="menu.jsp"%>
    <table border="1 px">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="department" items="${requestScope.departments}">
            <tr>
                <td><c:out value="${department.id}"/></td>
                <td><c:out value="${department.name}"/></td>
                <td id="<c:out value='${department.id}'/>"><button type="button" onclick="handleDelete(this)">DELETE</button></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="department-add.jsp">Add Department</a>
    <script type="text/javascript">
        function handleDelete(element) {
            var id = element.parentElement.id;
            console.log(id);
            $.ajax({
                url: "/api/departments?id=" + id,
                type: "DELETE",
                success: function () {
                    location.reload();
                }
            })
        }
    </script>
    </body>
</html>
