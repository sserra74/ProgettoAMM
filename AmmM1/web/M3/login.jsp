<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- devo togliere login.html -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Sergio Serra">
        <meta name="keywords" content="Nerdbook Login NerdbookLogin LoginNerdbook">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>

<body>
        <c:set var="title" value="Login" scope="request"/>
        <jsp:include page="header.jsp"/>
        
        <div id="divBody">
            <div id="formLogin">
                
                <c:if test="${invalidData == true}">
                    <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
                </c:if>
                
                <form action="Login" method="post">
                    <div id="contenuto">
                    <label for="Username">Username:</label>
                    <input type="text" name="Username" id="Username">
                    <label for="Password">Password:</label>
                    <input type="password" name="Password" id="Password">
                    <button type="submit">Entra</button>
                    </div>
                </form>
            </div>
        </div>  
    </body>
</html>
