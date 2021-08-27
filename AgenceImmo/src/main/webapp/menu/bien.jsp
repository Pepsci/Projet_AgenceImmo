<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="${context}./assets/css/style.css">

<%@ include file="../components/header.jsp" %>

	
<div class="card">
	<img class="cover" src="${context}/${test.imgcouv}">
	<div class="description">
		<span>Nombre de piece : ${test.nbrpiece}</span>
		<span>Prix : ${test.prix} &euro;</span>
		<span>Surface : ${test.surface} m&sup2;</span>
		<span>status : ${test.status}</span>
		<span>adresse : ${test.adresse}</span>
	</div>
</div>
