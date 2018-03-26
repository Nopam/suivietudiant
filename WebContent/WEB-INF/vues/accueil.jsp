<%@ page pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Accueil</title>
        <link rel="stylesheet" href="ressources/css/style.css" />
        <script type="text/javascript" src="ressources/js/ajaxInputOnTable.js"></script>
    </head>

    <body>
		<div id="menu">
	    	<ul>
	  			<li><a class="active" href="accueil">Accueil</a></li>
	  			<li><a href="candidatures">Candidatures</a></li>
				<li><a href="modules">Modules</a></li>
				<li class="onRight"><a href="monprofil">Mon profil</a></li>
				<li><a href="testbootstrap">Test Bootstrap</a></li>
			</ul>
		</div>
        <p>Bienvenue sur la JSP "Accueil" ! :)</p>
             

<input type="text" id="inputPrenom" onkeyup="inputFilterPrenom()" placeholder="Prénom" title="Tapez un prénom">
<input type="text" id="inputNom" onkeyup="inputFilterNom()" placeholder="Nom" title="Tapez un nom">



<table id="tableEtudiants">
			<tr>
				<th>Prenom</th>
				<th>Nom</th>
				<th>Statut</th>
				<th>Date de Naissance</th>
				<th>Ville</th>
			</tr>
        <c:forEach var="candidat" items="${ candidats }">
            <tr onclick="document.location='testbootstrap?id=${ candidat.idEtudiant }'">
            	<td><c:out value="${ candidat.prenom }" /></td>
            	<td><c:out value="${ candidat.nom }" /> </td>            	
            	<td><c:out value="${ candidat.statut }"/> </td>
            	<td><c:out value="${ candidat.dateNaissance }" /> </td>
            	<td><c:out value="${ candidat.villeAdresse }" /> </td>
            </tr>
        </c:forEach>
</table>
    
    

    
    </body>
</html>