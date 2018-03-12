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
	  			<li><a class="active" href="accueil">Accueil</a></li>
	  			<li><a href="candidatures">Candidatures</a></li>
				<li><a href="modules">Modules</a></li>
				<li class="onRight"><a href="monprofil">Mon profil</a></li>
				<li><a href="testbootstrap">Test Bootstrap</a></li>
			</ul>
		</div>
        <p>Bienvenue sur la JSP "Accueil" ! :)</p>
        
        <p>Bonjour ${ empty nom ? '' : nom } qui a ${ age } ans et qui habite à ${ ville }</p>
        
        
        
    </body>
</html>