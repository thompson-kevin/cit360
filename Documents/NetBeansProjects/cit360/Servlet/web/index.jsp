<%-- 
    Document   : index
    Created on : May 24, 2018, 9:40:42 PM
    Author     : Kevin's Account
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet Tests</title>
    </head>
    <body>
        <h1>Servlets</h1>
        <form action="/Servlet/hello" method="post">
            <input type="text" name="name" placeholder="Input Name">
            <input type="submit" name="getHello" value="Say Hello"/>
        </form>
        <form action="/Servlet/goodbye" method="post">
            <input type="text" name="name" placeholder="Input Name">
            <input type="submit" name="getGoodbye" value="Say Goodbye" />
        </form>
    </body>
</html>
