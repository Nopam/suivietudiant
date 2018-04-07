<%@ page pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Accueil</title>
        <link rel="stylesheet" href="ressources/css/style.css" />
        <script type="text/javascript" src="ressources/js/ajaxInputOnTable.js"></script>
        <script>
        	function validerForm(){
   				document.getElementById("formulaire").submit();
			}
		</script>
    </head>

    <body>
		<div id="menu">
	    	<ul>
	  			<li><a href="accueil">Accueil</a></li>
	  			<li><a href="candidatures">Candidature</a></li>
				<li><a href="ficheEtudiant">Fiche etudiant</a></li>
				<li class="onRight"><a href="monprofil">Mon profil</a></li>
				<li><a href="testbootstrap">Test Bootstrap</a></li>
			</ul>
		</div>
        <p>Bienvenue sur la JSP "Accueil" ! :)</p>
             
<form method="get" action="accueil" id = "formulaire">

    <label for="nom">Nom : </label>
    <input onKeyPress="if(event.keyCode == 13) validerForm();" type="text" id="inputSearchAccueil" name = "inputSearchAccueil" placeholder="Cherchez un étudiant" title="Cherchez un étudiant"/>
    
            <input type="submit" />
        </form>
        
<!-- <input type="text" id="inputPrenom" onkeyup="inputFilterPrenom()" placeholder="Prénom" title="Tapez un prénom">
<input type="text" id="inputNom" onkeyup="inputFilterNom()" placeholder="Nom" title="Tapez un nom">
<input type="text" id="inputSearch" onkeyup="inputFilterSearch()" placeholder="search" title="Cherchez un étudiant">
 -->

		<table id="tableEtudiants">
					<tr>
						<th>Prenom</th>
						<th>Nom</th>
						<th>Statut</th>
						<th>Date de Naissance</th>
						<th>Ville</th>
						<th>Date d'entretien</th>
						<th>Semestre de démarrage</th>
					</tr>
		        <c:forEach var="candidat" items="${ candidats }">
		            <tr onclick="document.location='ficheEtudiant?id=${ candidat.idEtudiant }'"> <!-- Lien vers la fiche étudiant -->
		            	<!--<td style=hidden><c:out value="${ candidat.prenom } ${ candidat.nom }"/></td>-->
		            	<td><c:out value="${ candidat.prenom }" /></td>
		            	<td><c:out value="${ candidat.nom }" /> </td>            	
		            	<td><c:out value="${ candidat.statut }"/> </td>
		            	<td><c:out value="${ candidat.dateNaissance }" /> </td>
		            	<td><c:out value="${ candidat.villeAdresse }" /> </td>
		            	<td><c:out value="${ candidat.heureRDVEntretien } - ${ candidat.dateRDVEntretien }" /> </td>
		            	<td><c:out value="${ candidat.demarrageFormation }" /> </td>
		            	
		            </tr>
		        </c:forEach>
		</table>
    
    </body>
</html>