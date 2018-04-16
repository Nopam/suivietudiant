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
	 * M�thode permettant de r�cup�rer les donn�es de la JSP Accueil en m�thode doGet
	 * Cette m�thode permet �galement de faire appel � la m�thode de CandidatBDD permettant de requ�ter la BDD
	 */
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

//		String nom = request.getParameter("nom");
//    	request.setAttribute("nom", nom);
//    	String age = request.getParameter("age");
//    	request.setAttribute("age", age);
//    	String ville = request.getParameter("ville");
//    	request.setAttribute("ville", ville);
    	
		// Parametre envoy� � CandidatBDD afin de requ�ter = "%" + contenu de l'input renvoy� via l'URL en doGet + "%"
    	String formFiltreNom = ("%"+request.getParameter("inputSearchAccueil")+"%");
    	
    	//Parametre pour trier (non fonctionnel � ce jour)
    	String formTri = request.getParameter("selectTriAccueil");
    	String orderBy = (formTri.length() < 1) ? "" : (" ORDER BY " + formTri);
    	
		CandidatBDD tableCandidat = new CandidatBDD();
		request.setAttribute("candidats", tableCandidat.recupererCandidat("accueil", formFiltreNom, orderBy));
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/accueil.jsp" ).forward( request, response );
	}

	
	/**
	 * M�thode permettant de r�cup�rer les donn�es de la JSP en m�thode doPost
	 */
public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
// Code permettant d'ins�rer des candidats dans la BDD
	
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
