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
	  			<li><a href="accueil">Accueil</a></li>
	  			<li><a href="candidatures">Candidatures</a></li>
				<li><a href="ficheEtudiant">Fiche etudiant</a></li>
				<li class="onRight"><a class="active" href="monprofil">Mon profil</a></li>
				<li><a href="testbootstrap">Test Bootstrap</a></li>
			</ul>
		</div>
       	<div id="central">
			<div id="piecesJointes"> <!-- Partie pièce jointes/photos pour Lahlou -->
	
			</div>
			<div id="ficheEtudiant">
			<form action="ficheEtudiant" method="POST">
				<label for="studentName">Nom: </label>
				<span id="studentName" class="showInfos"></span> 
				<input type="text" placeholder="nom" name="name" class="inputInfos"><br />
				
				<label for="studentSurname">Prénom: </label>
				<span id="studentSurname" class="showInfos"></span>
				<input type="text" placeholder="prénom" name="surname" class="inputInfos"><br />
				
				<label for="studentAge">Date de naissance: </label>
				<span id="studentAge" class="showInfos"></span>
				<input type="text" placeholder="01/01/1900" name="date" class="inputInfos"><br />
				
				<label for="studentMail">Mail: </label>
				<span id="studentMail" class="showInfos"></span>
				<input type="text" placeholder="mailEtudiant@gmail.com" name="mail" class="inputInfos"><br />
				
				<label for="studentTel">Tel: </label>
				<span id="studentTel" class="showInfos"></span>
				<input type="number" placeholder="Tel" name="tel" class="inputInfos"><br />
					
					
				<label for="studentStatut">Statut: </label>
					<select id="studentStatut">
					  <option value="rdvPlanified">Rendez-vous planifié</option> 
					  <option value="refused">Refusé</option>
					  <option value="accepted">Accepté</option>
					  <option value="inProgress" selected>Non traité</option>
					</select><br />
					
					<input  type="submit" value="Valider" class="inputInfos button" onclick="validate()">
					<input class="showInfos button" value="Modifier" onclick="modifInProgress()">
				</form>
				</div>
			</div>			
    </body>
</html>