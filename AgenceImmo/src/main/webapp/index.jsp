<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" type="text/css" href="${context}./assets/css/style.css">

<%@ include file="./components/header.jsp" %>

<div class="container">
        <div class="achat">
            <div class="menuAchat">
                <div class="titre-scroll">
                    Nos dernier bien en location
                </div>
            </div>
            <div class="outer-wrapper">
                <div class="wrapper">
                    <div class="containerInterne">
                    	<c:forEach var="test" items="${listlocation}">
                    	<c:url var="afficher" value="/bien">
						<c:param name="id_test" value="${test.id_test}" />
						</c:url>
	                        <div class="carre">
	                        <a href="${afficher}">
	                            <img class="cover" src="${context}/${test.imgcouv}">
	                            <div class="textimage">Prix :<c:out value="${test.prix}" />&euro; /mois</div>
	                        </a>
	                        </div>
	                   </c:forEach>
                    </div>
                </div>
            </div>
        </div>
        <div class="location">
            <div class="menuLocation">
                <div class="titre-scroll">
                    Nos dernier bien en vente
                </div>
            </div>
            <div class="outer-wrapper">
                <div class="wrapper">
                    <div class="containerInterne">
                       <c:forEach var="test" items="${listvente}">
                       	<c:url var="afficher" value="/bien">
						<c:param name="id_test" value="${test.id_test}" />
						</c:url>
	                        <div class="carre">
	                            <a href="${afficher}">
	                            <img class="cover" src="${context}/${test.imgcouv}">
	                            <div class="textimage">Prix :<c:out value="${test.prix}" />&euro;</div>
	                        </a>
	                        </div>
	                   </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>