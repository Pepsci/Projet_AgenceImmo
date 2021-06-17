<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${context}/assets/css/style.css">
<title>Insert title here</title>
</head>
<body>

<header><a href="${context}/index">agenceimmo</a></header>
    <nav>
        <ul>
            <li class="navlinks"><a href="#">Acheter</a></li>
            <li class="navlinks"><a href="#">Vendre</a></li>
            <li class="navlinks"><a href="${context}/formtest">Louer</a></li>
            <li class="navlinks"><a href="${context}/formajoutbien">Contatc</a></li>
        </ul>
    </nav>

