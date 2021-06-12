<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" type="text/css" href="${context}./assets/css/form.css">
<%@ include file="../components/header.jsp" %>

<%-- <form action="${context}/formajoutbien" method="post" class="ajoutBien">
        <label for="">Type de bien</label>
        <select name="typeDeBien" id="" value="">
        	<option value="">Choisir le type de bien</option>
            <option value="maison">Maison</option>
            <option value="appartement">Appartement</option>
        </select>
        <label for="statut">Statut</label>
        <select name="statut" id="" value="">
        	<option value="">Choisir le status</option>
            <option value="vente">Vente</option>
            <option value="location">Location</option>
        </select>
        <label for="">Adresse</label>
        <input type="text" placeholder="Entrez une adresse" name="adresse" value="">
        <label for="prix">Prix</label>
        <input type="number" placeholder="Entrer un montant" name="prix" value="">
        <label for="surface">Surface</label>
        <input type="text" placeholder="Entrer la surface" name="surface" value="">
        <label for="nbrpiece">Nombre de pièce</label>
        <input type="text" name="nbrpiece" id="" value="">
        <label for="couvBien">Photo Couverture</label>
        <input type="file" name="imgCouv" id="" accept="image/png, image/jpeg"> 
        <input type="submit">
    </form> --%>
    
    
<form action="${context}/formajoutbien" method="post" class="ajoutBien">
        <label for="">Type de bien</label>
        <input type="text" for="typeDeBien" name="typeDeBien">
        <label for="statut">Statut</label>
        <input type="text" for="statut" name="statut">
        <label for="">Adresse</label>
        <input type="text" placeholder="Entrez une adresse" name="adresse" value="">
        <label for="prix">Prix</label>
        <input type="text" placeholder="Entrer un montant" name="prix" value="">
        <label for="surface">Surface</label>
        <input type="text" placeholder="Entrer la surface" name="surface" value="">
        <label for="nbrpiece">Nombre de pièce</label>
        <input type="text" name="nbrpiece" id="" value="">
<!--         <label for="couvBien">Photo Couverture</label>
        <input type="file" name="imgCouv" id="" accept="image/png, image/jpeg"> -->
        <input type="submit">
    </form>
    
