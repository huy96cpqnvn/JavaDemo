<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/8/2021
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
<head>
    <title><dec:title /></title>
    <%@include file="head.jsp"%>
    <dec:head />
</head>
<body>
<%@include file="navigation.jsp"%>

<%@include file="header.jsp"%>
<dec:body/>
<%@include file="footer.jsp"%>
<%@include file="../js/js.jsp"%>
</body>
</html>
