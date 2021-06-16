<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/1/2021
  Time: 6:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Quantity</th>
      <th>Price</th>
    </tr>
    <c:forEach var="item" items="${requestScope.products}">
      <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.quantity}</td>
        <td>${item.price}</td>
      </tr>
    </c:forEach>

    ${requestScope.message}
  </table>
  </body>
</html>
