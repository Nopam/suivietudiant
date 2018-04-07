<%@ page pageEncoding="UTF-8" %>

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
	  			<li><a href="accueil?inputSearchAccueil=&selectTriAccueil=">Accueil</a></li>
	  			<li><a href="candidatures">Candidature</a></li>
				<li class="onRight"><a href="monprofil">Mon profil</a></li>
				<li><a href="testbootstrap">Test Bootstrap</a></li>
			</ul>
		</div>
		
		
        <p>Bienvenue sur la JSP "Candidature" ! :)</p>
        
        <form method="post" action="candidatures">
        
        <p> <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" /> </p>
        
        <p> <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" /> </p>
        
        <p> <label for="dateNaissance">Date de naissance : </label>
            <input type="text" name="dateNaissance" id="dateNaissance" /> </p>

        <p> <label for="mail">Adresse mail : </label>
            <input type="text" name="mail" id="mail" /> </p>
            
        <p> <label for="mail">Numéro de téléphone : </label>
            <input type="text" name="tel" id="tel" /> </p>
            
        <p> Adresse : </p>
        <p> <label for="mail">Numéro  : </label>
            <input type="text" name="numAdresse" id="numAdresse" /> </p>
            
        <p> <label for="mail">Rue : </label>
            <input type="text" name="rueAdresse" id="rueAdresse" /> </p>
            
        <p> <label for="mail">Complément : </label>
            <input type="text" name="compAdresse" id="compAdresse" /> </p>
            
       	<p> <label for="mail">Code postal : </label>
            <input type="text" name="cpAdresse" id="cpAdresse" /> </p>
            
       	<p> <label for="mail">Ville : </label>
            <input type="text" name="villeAdresse" id="villeAdresse" /> </p>
        <input type="submit" />
        
    </form>
    
    </body>
</html>