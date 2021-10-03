<%-- 
    Document   : AgeCalculatorForm
    Created on : Sep 22, 2021, 8:14:23 AM
    Author     : 814215
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="Age">
            <label>Enter your age:</label>
            <input type="text" name="ageValue" value=""><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
            <a href="http://localhost:8083/Lab3/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
