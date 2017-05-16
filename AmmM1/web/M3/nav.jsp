<%--
       Document    : nav
       Created on  : 9-mag-2017, 12.19.59
       Author      : serra
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav>
    <ol>
        <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="bacheca.html">Bacheca Personale</a></li>
        <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="profilo.html">Profilo</a></li>
        <li <c:if test="${page=='descrizione'}">class="active"</c:if>><a href="descrizione.html">Descrizione</a></li>
        <li><a href="login.html">Login</a></li>
        
    </ol>
</nav>     