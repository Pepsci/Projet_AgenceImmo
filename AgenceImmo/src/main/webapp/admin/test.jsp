<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" type="text/css" href="${context}./assets/css/form.css">

<%@ include file="../components/header.jsp" %>

    
    
<form action="${context}/formtest" method="post" class="ajoutBien" enctype="multipart/form-data">
		<label>Choix du type de Bien</label>
	        <select name="typebien" id="" value="typebien">
	        	<option value="">Choisir le type de bien</option>
	            <option value="maison">Maison</option>
	            <option value="appartement">Appartement</option>
       		 </select>
        <label>Choisir le status</label>
	        <select name="status" id="" value="status">
	        	<option value="">Choisir le status</option>
	            <option value="vente">vente</option>
	            <option value="location">location</option>
       		 </select>
        <label for="">Adresse</label>
        	<input type="text" placeholder="Entrez une adresse" name="adresse" value="">
        <label for="prix">Prix</label>
        	<input type="text" placeholder="Entrer un montant" name="prix" value="">
        <label for="surface">Surface</label>
        	<input type="text" placeholder="Entrer la surface" name="surface" value="">
        <label for="nbrpiece">Nombre de pièce</label>
        	<input type="text" name="nbrpiece" id="" value="">
        <label for="imgcouv">Photo de couverture</label>
        	<input type="file" name="imgcouv" id="imgcouv" accept="image/png, image/jpeg">
        <input type="submit">
    </form>
    
