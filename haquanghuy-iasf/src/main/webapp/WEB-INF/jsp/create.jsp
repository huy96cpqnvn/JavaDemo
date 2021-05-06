<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Create</h1>

<div class="w3-container">
    <form action="/create" method="post">
        <label>Name</label>
        <input type="text" name="name" required /><br/>
        <label>Code</label>
        <input type="text" name="code" required/><br/>
        <label>Gender</label>
        <input type="text" name="gender" required/><br/>
        <label>Email</label>
        <input type="text" name="email" required/><br/>
        <label>Phone</label>
        <input type="text" name="phone" required/><br/>
        <label>Birthday</label>
        <input type="text" name="birthday" required/><br/>
        <label>Country</label>
        <input type="text" name="country" required/><br/>
        <input type="submit" value="Create">
    </form>
</div>

</body>
</html>
