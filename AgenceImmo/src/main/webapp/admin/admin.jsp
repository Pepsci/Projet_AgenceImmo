<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${context}/assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="${context}/assets/css/table.css">
    <title>Document</title>
</head>
<body>
    <header><a href="${context}/index">agenceimmo</a></header>
    <nav>
        <ul>
            <li class="navlinks"><a href="${context}/admin">Gestion</a></li>
            <li class="navlinks"><a href="${context}/formtest">Ajouter</a></li>
        </ul>
    </nav>
    
    <table class="list">
            <tr>
                <th>id</th>
                <th>Type de bien</th>
                <th>Satus</th>
                <th>Adresse</th>
                <th>Prix</th>
                <th>Surface</th>
                <th>Nombre de piece</th>
                <th>Image</th>
                <th>Ajouté le</th>
                <th>Modifier</th>
                <th>Supprimer</th>
            </tr>
        <c:forEach var="test" items="${list}">
            <tr>
                <td>${test.id_test}</td>
                <td>${test.typebien}</td>
                <td>${test.status}</td>
                <td>${test.adresse}</td>
                <td>${test.prix}</td>
                <td>${test.surface}</td>
                <td>${test.nbrpiece}</td>
                <td><img class="cover" src="${context}/${test.imgcouv}"></td>
                <td>${test.created_at}</td>
                <td><!-- <input type="submit" value="update"> --></td>
                <td><a href="delete?id_test=${test.id_test}">delete</a></td>
            </tr>
    </c:forEach>
    </table>

</body>
</html>