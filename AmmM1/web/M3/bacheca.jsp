<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <head>
        <title>Nerdbook - Bacheca</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Sergio Serra">
        <meta name="keywords" content="NerdbookBacheca Bacheca BachecaNerdbook">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <!--header contenente in titolo della pagina-->
        <c:set var="title" value="Bacheca Personale" scope="request"/>
        <jsp:include page="header.jsp"/>
        
        <!--Barra di navigazione tra le pagine del sito-->
        <c:set var="page" value="bacheca" scope="request"/>
        <jsp:include page="nav.jsp"/>
        
        <div id="divBody">
            
            <jsp:include page="sidebar.jsp"/>
        <div id="Bacheca">
                <div class="profilo">
                    
                    <div class="image">
                        <img title="Profilo1" src="img/marco-bertozzi.png" alt="${user.img})">
                    </div>
                    <div class="name">
                        <strong>Nome:</strong>
                        ${user.nome}
                        <!--<h4>Marco Adami</h4>-->
                    </div>
                    <div class="content">
                        <p>Oggi c'è Avengers in TV!</p>
                    </div>
                </div> 

                <div class="profilo">
                    
                    <div class="image">
                        <img title="Profilo2" src="img/AlessandraMastronardi.jpg" alt="Foto Profilo">
                    </div>
                    <div class="name">
                        <h4>Alessandra Mastronardi</h4>
                    </div>
                    <div class="content">
                        <p>Premiere del mio prossimo film</p>
                        <img title="Film" src="img/ger.jpg" alt="Film Romeo e Giulietta">
                    </div>
                </div>

                <div class="profilo">
                    
                    <div class="image">
                        <img title="Profilo3" src="img/carloconti.jpg" alt="Foto Profilo">
                    </div>
                    <div class="name">
                        <h4>Carlo Conti</h4>
                    </div>
                    <div class="content">
                        <p>Seguiteci sul sito di Sanremo!</p>
                        <a href="http://www.rai.it/programmi/sanremo/" target="blank">www.sanremo.it</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
