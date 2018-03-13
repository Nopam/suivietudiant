<%@ page pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Accueil</title>
        <link rel="stylesheet" href="ressources/css/style.css" />
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
             
           <form method="post" action="accueil">
        <p>
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        <p>
            <label for="dateNaissance">Date de naissance : </label>
            <input type="text" name="dateNaissance" id="dateNaissance" />
        </p>
        <p>
            <label for="villeAdresse">Ville d'habitation : </label>
            <input type="text" name="villeAdresse" id="villeAdresse" />
        </p>
        
        <input type="submit" />
    </form>
        
            <form method="post" action="accueil">
    
	    <label for="choixCandidat">Cherchez un candidat :</label>
		<input list="Candidats" type="text" id="choixCandidat" name="choixCandidat">
		<datalist id="Candidats">
			<c:forEach var="candidat" items="${ candidats }">
				<option value="<c:out value="${ candidat.prenom }"/>">
			</c:forEach>
		</datalist>
		<input type="submit" />
    </form>
    
    <p>${ choixCandidat }</p>
    
    </body>
</html>