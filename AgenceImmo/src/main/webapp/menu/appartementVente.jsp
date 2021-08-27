<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="${context}./assets/css/style.css">

<%@ include file="../components/header.jsp" %>

		<div class="cards">
			<c:forEach var="test" items="${listappartementvente}">
			<c:url var="afficher" value="/bien">
			<c:param name="id_test" value="${test.id_test}" />
			</c:url>
			    <div class="card">
			        <img class="cover" src="${context}/${test.imgcouv}">
			        <div class="description">
			            <span>Nombre de piece : ${test.nbrpiece}</span>
			            <span>Prix : ${test.prix} &euro;</span>
			            <span>Surface : ${test.surface} m&sup2;</span>
			            <a class="card-link-details" href="${afficher}">Voir détails</a>
			        </div>
			    </div>
			</c:forEach>
		</div>

