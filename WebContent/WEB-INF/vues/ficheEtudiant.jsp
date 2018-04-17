<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Fiche Etudiant</title>
        <link rel="stylesheet" href="ressources/css/ficheEtudiant.css" />
        <script type="text/javascript" src="ressources/js/ficheEtudiant.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </head>

    <body onload="validate()">
    
		<div id="menu">
	    	<ul>
	  			<li><a href="accueil?inputSearchAccueil=&selectTriAccueil=">Accueil</a></li>
	  			<li><a href="nouveaucandidat">Nouveau candidat</a></li>
				<li class="onRight"><a class="active" href="monprofil">Mon profil</a></li>
			</ul>
		</div>
       	<div id="central">
       	<span id="serverResponse" style="display: ${reponse }"><img src="ressources/img/validated.png" height="100px" width="100px"></span>
			<div id="piecesJointes"> <!-- Partie pièce jointes/photos pour Lahlou -->
			
			
			<c:forEach var="candidat" items="${ candidats[1] }">
				<img src="ressources/Photos/${ candidat.photoEtudiant }" alt="Photo non disponible">
				<div class="download_pj">
				<a href="ressources/CV/${ candidat.cvEtudiant }"><input type="button" value=" CV " class="button"/></a>
				<a href="ressources/LM/${ candidat.lettreMotivationEtudiant }"><input type="button" class="button" value=" Lettre " /></a>
				</div>
			</c:forEach>	
			
			</div>
			<div id="ficheEtudiant">
			
			
			
			
			<c:forEach var="candidat" items="${ candidats[0] }">
			<form action="ficheEtudiant" method="POST">
			<input type="hidden" name="id" value="${candidat.idEtudiant}">
				<div class="textLine">
				<label for="studentName">Nom: </label>
				<span id="studentName" class="showInfos">
				<c:out value="${ candidat.nom }" />
				</span> 
				<input type="text" value="${ candidat.nom }" name="name" class="inputInfos"><br />
				</div>
				
				<div class="textLine">
				<label for="studentSurname">Prénom: </label>
				<span id="studentSurname" class="showInfos">
				<c:out value="${ candidat.prenom }" />
				</span>
				<input type="text" value="${ candidat.prenom }" name="surname" class="inputInfos"><br />
				</div>
				
				<div class="textLine">
				<label for="studentAge">Date de naissance: </label>
				<span id="studentAge" class="showInfos">
				<c:out value="${ candidat.dateNaissance }" />
				</span>
				<input type="text" value="${ candidat.dateNaissance }" name="date" class="inputInfos"><br />
				</div>
				
				<div class="textLine">
				<label for="studentMail">Mail: </label>
				<span id="studentMail" class="showInfos">
				<c:out value="${ candidat.mail }" />
				</span>
				<input type="text" value="${ candidat.mail }" name="mail" class="inputInfos"><br />
				</div>
				
				<div class="textLine">
				<label for="studentTel">Tel: </label>
				<span id="studentTel" class="showInfos">
				<c:out value="${ candidat.tel }" />
				</span>
				<input type="number" value="${ candidat.tel }" name="tel" class="inputInfos" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" maxlength="10"><br />
				</div>
				
				<hr />
				
				<div class="textLine">
				<label for="numRue">Numéro de rue: </label>
				<span id="numRue" class="showInfos">
				<c:out value="${ candidat.numAdresse }" />
				</span>
				<input type="number" value="${ candidat.numAdresse }" name="num_rue" class="inputInfos"><br />
				</div>
				
				<div class="textLine">
				<label for="rue">Libellé rue: </label>
				<span id="rue" class="showInfos">
				<c:out value="${ candidat.rueAdresse }" />
				</span>
				<input type="text" value="${ candidat.rueAdresse }" name="rue" class="inputInfos"><br />
				</div>
				
				<div class="textLine">
				<label for="cp">Code postal: </label>
				<span id="cp" class="showInfos">
				<c:out value="${ candidat.cpAdresse }" />
				</span>
				<input type="number" value="${ candidat.cpAdresse }" name="cp" class="inputInfos" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" maxlength="5"><br />
				</div>
				
				<div class="textLine">
				<label for="ville">Ville: </label>
				<span id="ville" class="showInfos">
				<c:out value="${ candidat.villeAdresse }" />
				</span>
				<input type="text" value="${ candidat.villeAdresse }" name="ville" class="inputInfos"><br />
				</div>
				
				<hr />
				
				<div class="textLine">
				<label for="dateRDVEntretien">Date de Rendez-vous: </label>
				<span id="dateRDVEntretien" class="showInfos">
				<c:out value="${ candidat.dateRDVEntretien } à ${candidat.heureRDVEntretien }" />
				</span>
				<input type="text" value="${ candidat.dateRDVEntretien }" name="dateRDVEntretien" class="inputInfos"><br />
				</div>
				
				<div class="textLine inputInfos">
				<label for="heureRDVEntretien">Heure de Rendez-vous: </label>
				<input type="text" value="${ candidat.heureRDVEntretien }" name="heureRDVEntretien" class="inputInfos"><br />
				</div>
				
				<div class="textLine">	
				<label for="studentStatut">Statut: </label>
				<span id="statut" class="showInfos">
				<c:out value="${ candidat.statut }" />
				</span>
					<select id="studentStatut" name="studentStatut" class="inputInfos">
					  <option value="A consulter">A consulter</option> 
					  <option value="Refusé" >Refusé</option>
					  <option value="Accepté" >Accepté</option>
					  <option value="En cours">En cours</option>
					</select><br />
				</div>

				<div class="textLine">
				<label for="demarrage">Premier semestre: </label>
				<span id="demarrage" class="showInfos">
				<c:out value="${ candidat.demarrageFormation }" />
				</span>
				<input type="text" value="${ candidat.demarrageFormation }" name="demarrage" class="inputInfos"><br />
				</div>
				
				
					<input  type="submit" value="Valider" class="inputInfos button" onclick="validate()">
					<input class="showInfos button" value="Modifier" onclick="modifInProgress()">
					
				</form>
				
				</c:forEach>
				</div>
				
				
			</div>			
    </body>
</html>
