<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Accueil</title>
        <link rel="stylesheet" href="ressources/css/candidatures.css" />
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
        
            <input type="text" required name="nom" id="nom" placeholder="Nom"/>
        
            <input type="text" required name="prenom" id="prenom" placeholder="Prénom"/>

            <input type="text" required name="dateNaissance" id="dateNaissance" placeholder="Date de naissance"/>

            <input type="text" required name="mail" id="mail" placeholder="Adresse mail"/>
            
            <input type="text" required name="tel" id="tel" placeholder="Numéro de téléphone"/>
            
            <input type="text" required name="numAdresse" id="numAdresse" placeholder="Numéro Adresse"/>
            
            <input type="text" required name="rueAdresse" id="rueAdresse" placeholder="Rue"/>
            
            <input type="text" required name="compAdresse" id="compAdresse" placeholder="Complément d'adresse"/>
            
            <input type="text" required name="cpAdresse" id="cpAdresse" placeholder="Code postal"/>
            
            <input type="text" required name="villeAdresse" id="villeAdresse" placeholder="Ville"/>
        <input type="submit" />
        
    </form>
    
    </body>
</html>