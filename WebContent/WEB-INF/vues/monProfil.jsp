<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Accueil</title>
        <link rel="stylesheet" href="ressources/css/monProfil.css" />
    </head>

    <body>
		<div id="menu">
	    	<ul>
	  			<li><a href="accueil?inputSearchAccueil=&selectTriAccueil=">Accueil</a></li>
	  			<li><a href="nouveaucandidat">Nouveau candidat</a></li>
				<li class="onRight"><a href="monprofil">Mon profil</a></li>
			</ul>
		</div>
        <p>Bienvenue sur la JSP "MonProfil" ! :)</p>
        
        <div id="accessToProfil">
        
        	<div id="connexionProfil">
        		<form method="post" action="#">
					<div class="inputLog">
						<input type="text" name="connexionEmail" id="connexionEmail" placeholder="mail" />
					</div>
					<div class="inputLog">
						<input type="password" name="" id="connexionPassword" placeholder="password" />
					</div>									
						<ul class="actions">
							<li><input type="submit" class="style1" value="Connexion" /></li>
							<li><input type="reset" class="style2" value="Réinit" /></li>
						</ul>
				</form>
			</div> <!-- End div connexionProfil -->
        </div>
        
    </body>
</html>