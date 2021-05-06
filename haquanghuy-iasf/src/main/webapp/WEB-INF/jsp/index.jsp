<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Index</h1>

<div class="w3-container">

    <a href="/create">Create</a>
    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Code</th>
            <th>Gender</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Birthday</th>
            <th>Country</th>
        </tr>
        <c:forEach var="p" items="${students}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.code}</td>
                <td>${p.gender}</td>
                <td>${p.email}</td>
                <td>${p.phone}</td>
                <td>${p.birthday}</td>
                <td>${p.country}</td>
                <td>
                    <a href="/detail/${p.id}">Detail</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

<%--${message}--%>

<%--<form action="login" method="post">--%>
<%--    <input type="text" name="username">--%>
<%--    <input type="password" name="password">--%>
<%--    <input type="submit" value="LOGIN">--%>
<%--</form>--%>

</body>
</html>
