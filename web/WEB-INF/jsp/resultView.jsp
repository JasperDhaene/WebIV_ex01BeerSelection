<%-- 
    Document   : resultView
    Created on : 01-Jun-2017, 10:34:07
    Author     : jasper
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection</title>
    </head>
    <body>
        <h1>Woohoo Beer!</h1>
        <p>Got beer colour: ${colour}</p>
        <p>Try:</p>
        <ul>
        <c:forEach items="${beers}" var="item" varStatus="status">
            <li>${item}</li>
        </c:forEach>
        </ul>
    </body>
</html>
