<%-- 
    Document   : ArithmeticCalculatorForm
    Created on : Sep 22, 2021, 2:55:04 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First digit:</label>
            <input type="text" name="first_digit" value=""><br>
            <label>Second digit:</label>
            <input type="text" name="second_digit" value=""><br>
            <input type="submit" name="add"      value="+">
            <input type="submit" name="subtract" value="-">
            <input type="submit" name="multiply" value="*">
            <input type="submit" name="divide"   value="%">

        </form>
            <p>Result: ${message}</p>
            <a href="http://localhost:8083/Lab3/Age">Age Calculator</a>
    </body>
</html>
