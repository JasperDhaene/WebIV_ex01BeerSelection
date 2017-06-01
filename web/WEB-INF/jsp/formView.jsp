<%-- 
    Document   : formView
    Created on : 01-Jun-2017, 10:33:53
    Author     : jasper
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection!</title>
    </head>
    <body>
        <p>Choose color:</p>
        <form action="/beer" method="post">
            <select>
                <c:forEach items="${colours}" var="item">
                    <option name="${item}">${item}</option>
                </c:forEach>
            </select>
            <input type="submit" />
        </form>
    </body>
</html>
