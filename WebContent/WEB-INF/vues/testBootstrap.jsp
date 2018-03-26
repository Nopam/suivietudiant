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
	  			<li><a href="accueil">Accueil</a></li>
	  			<li><a href="candidatures">Candidature</a></li>
				<li><a href="ficheEtudiant">Fiche etudiant</a></li>
				<li class="onRight"><a href="monprofil">Mon profil</a></li>
				<li><a href="testbootstrap">Test Bootstrap</a></li>
			</ul>
		</div>
		<p>Bienvenue sur la JSP "TestBootstrap" ! :)</p>
		
		    <form method="post" action="testbootstrap">
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
            <label for="ville">Ville d'habitation : </label>
            <input type="text" name="ville" id="ville" />
        </p>
        
        <input type="submit" />
    </form>
    
<%--     <ul>
        <c:forEach var="personne" items="${ personnes }">
            <li>
            	Prenom : <c:out value="${ personne.prenom }" /><br/> 
            	Nom : <c:out value="${ personne.nom }" /><br/> 
            	Date de naissance : <c:out value="${ personne.dateNaissance }" /><br/> 
            	Ville d'habitation : <c:out value="${ personne.villeHabitation }" /><br/>
            </li>
        </c:forEach>
    </ul>   --%>  
    
    <form method="post" action="testbootstrap">
    
	    <label for="choixPersonne">Cherchez une personne :</label>
		<input list="Personnes" type="text" id="choixPersonne" name="choixPersonne">
		<datalist id="Personnes">
			<c:forEach var="personne" items="${ personnes }">
				<option value="<c:out value="${ personne.prenom }"/>">
			</c:forEach>
		</datalist>
		<input type="submit" />
    </form>
    
    <p>${ choixPersonne }</p>

    </body>
</html>