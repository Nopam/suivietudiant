package com.suivicandidature.servlets;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suivicandidature.bdd.CandidatBDD;
import com.suivicandidature.beans.Candidat;

public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Méthode permettant de récupérer les données de la JSP Accueil en méthode doGet
	 * Cette méthode permet également de faire appel à la méthode de CandidatBDD permettant de requêter la BDD
	 */
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

//		String nom = request.getParameter("nom");
//    	request.setAttribute("nom", nom);
//    	String age = request.getParameter("age");
//    	request.setAttribute("age", age);
//    	String ville = request.getParameter("ville");
//    	request.setAttribute("ville", ville);
    	
		// Parametre envoyé à CandidatBDD afin de requêter = "%" + contenu de l'input renvoyé via l'URL en doGet + "%"
    	String formFiltreNom = ("%"+request.getParameter("inputSearchAccueil")+"%");
    	
    	//Parametre pour trier (non fonctionnel à ce jour)
    	String formTri = request.getParameter("selectTriAccueil");
    	String orderBy = (formTri.length() < 1) ? "" : (" ORDER BY " + formTri);
    	
		CandidatBDD tableCandidat = new CandidatBDD();
		request.setAttribute("candidats", tableCandidat.recupererCandidat("accueil", formFiltreNom, orderBy));
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/accueil.jsp" ).forward( request, response );
	}

	
	/**
	 * Méthode permettant de récupérer les données de la JSP en méthode doPost
	 */
public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
// Code permettant d'insérer des candidats dans la BDD
	
//	Candidat candidat = new Candidat();
//	candidat.setNom(request.getParameter("nom"));
//	candidat.setPrenom(request.getParameter("prenom"));
//	candidat.setDateNaissance(request.getParameter("dateNaissance"));
//	candidat.setVilleAdresse(request.getParameter("villeAdresse"));
//	
//	ListeEtudiantAccueil tableCandidat = new ListeEtudiantAccueil();
//	tableCandidat.ajouterCandidat(candidat);
//	request.setAttribute("candidats", tableCandidat.recupererCandidat());
	
	String choixCandidat = request.getParameter("choixCandidat");
	request.setAttribute("choixPersonne", choixCandidat);
	
	
	
	this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/accueil.jsp" ).forward( request, response );
	
}
}
