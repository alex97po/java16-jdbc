<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Employees</title>
    </head>
    <body>
        <%@ include file="menu.jsp"%>
        <table border="1 px">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Department</th>
            </tr>
            <c:forEach var="employee" items="${requestScope.employees}">
                <tr>
                    <td><c:out value="${employee.id}"/></td>
                    <td><c:out value="${employee.name}"/></td>
                    <td><c:out value="${employee.salary}"/></td>
                    <td><c:out value="${employee.department.name}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
