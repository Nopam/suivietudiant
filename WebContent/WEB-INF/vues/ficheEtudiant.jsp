<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Fiche Etudiant</title>
        <link rel="stylesheet" href="ressources/css/ficheEtudiant.css" />
        <script type="text/javascript" src="ficheEtudiantController.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </head>

    <body onload="validate()">
		<div id="menu">
	    	<ul>
	  			<li><a href="accueil?inputSearchAccueil=&selectTriAccueil=">Accueil</a></li>
	  			<li><a href="candidatures">Candidature</a></li>
				<li class="onRight"><a class="active" href="monprofil">Mon profil</a></li>
				<li><a href="testbootstrap">Test Bootstrap</a></li>
			</ul>
		</div>
       	<div id="central">
			<div id="piecesJointes"> <!-- Partie pièce jointes/photos pour Lahlou -->
	
			</div>
			<div id="ficheEtudiant">
			
			
			
			
			<c:forEach var="candidat" items="${ candidats }">
			<form action="accueil?inputSearchAccueil=&selectTriAccueil=" method="POST">
			
				<label for="studentName">Nom: </label>
				<span id="studentName" class="showInfos">
				
				<c:out value="${ candidat.nom }" /></span> 
				<input type="text" placeholder="nom" name="name" class="inputInfos"><br />
				
				<label for="studentSurname">Prénom: </label>
				<span id="studentSurname" class="showInfos">
				<c:out value="${ candidat.prenom }" />
				</span>
				<input type="text" placeholder="prénom" name="surname" class="inputInfos"><br />
				
				<label for="studentAge">Date de naissance: </label>
				<span id="studentAge" class="showInfos">
				<c:out value="${ candidat.dateNaissance }" />
				</span>
				<input type="text" placeholder="01/01/1900" name="date" class="inputInfos"><br />
				
				<label for="studentMail">Mail: </label>
				<span id="studentMail" class="showInfos">
				<c:out value="${ candidat.mail }" />
				</span>
				<input type="text" placeholder="mailEtudiant@gmail.com" name="mail" class="inputInfos"><br />
				
				<label for="studentTel">Tel: </label>
				<span id="studentTel" class="showInfos">
				<c:out value="${ candidat.tel }" />
				</span>
				<input type="number" placeholder="0612345678" name="tel" class="inputInfos" maxlength="10"><br />
					
				<label for="numRue">Numéro de rue: </label>
				<span id="numRue" class="showInfos">
				<c:out value="${ candidat.numAdresse }" />
				</span>
				<input type="number" placeholder="10" name="num_rue" class="inputInfos"><br />
				
				<label for="rue">Libellé rue: </label>
				<span id="rue" class="showInfos">
				<c:out value="${ candidat.rueAdresse }" />
				</span>
				<input type="text" placeholder="de la chasse" name="rue" class="inputInfos"><br />
				
				<label for="cp">Code postal: </label>
				<span id="cp" class="showInfos">
				<c:out value="${ candidat.cpAdresse }" />
				</span>
				<input type="number" placeholder="10" name="cp" class="inputInfos" maxlength="5"><br />
				
				<label for="ville">Ville: </label>
				<span id="ville" class="showInfos">
				<c:out value="${ candidat.villeAdresse }" />
				</span>
				<input type="text" placeholder="de la chasse" name="ville" class="inputInfos"><br />

					
				<label for="studentStatut">Statut: </label>
					<select id="studentStatut">
					  <option value="toCheck">A consulter</option> 
					  <option value="refused" selected>Refusé</option>
					  <option value="accepted" selected>Accepté</option>
					  <option value="inProgress">En cours</option>
					</select><br />
					
					<input  type="submit" value="Valider" class="inputInfos button" onclick="validate()">
					<input class="showInfos button" value="Modifier" onclick="modifInProgress()">
					
				</form>
				</c:forEach>
				</div>
			</div>			
    </body>
</html>

t