<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 27/08/2020
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
    <style>
        ul {
           list-style-type: none;
            background-color: #333333;
            padding: 0;
            margin: 0;
            overflow: hidden;
        }

        li {
            float: left;
        }

        li a {
            text-decoration: none;
            display: block;
            color: white;
            text-align: center;
            padding: 16px;
        }

        li a:hover {
           background-color: greenyellow;
        }
    </style>
</head>
<body>
    <ul>
        <li><a href="/api/departments">Departments</a></li>
        <li><a href="/api/employees">Employees</a></li>
    </ul>
</body>
</html>
