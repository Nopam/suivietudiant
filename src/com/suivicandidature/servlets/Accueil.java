package com.suivicandidature.servlets;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suivicandidature.bdd.ListeEtudiantAccueil;
import com.suivicandidature.beans.Candidat;

public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

		ListeEtudiantAccueil tableCandidat = new ListeEtudiantAccueil();
		request.setAttribute("personnes", tableCandidat.recupererCandidat());
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/accueil.jsp" ).forward( request, response );
	}


public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Candidat candidat = new Candidat();
	candidat.setNom(request.getParameter("nom"));
	candidat.setPrenom(request.getParameter("prenom"));
	candidat.setDateNaissance(request.getParameter("dateNaissance"));
	candidat.setVilleAdresse(request.getParameter("ville"));
	
	ListeEtudiantAccueil tableCandidat = new ListeEtudiantAccueil();
	tableCandidat.ajouterCandidat(candidat);
	request.setAttribute("candidats", tableCandidat.recupererCandidat());
	
	String choixCandidat = request.getParameter("choixCandidat");
	request.setAttribute("choixPersonne", choixCandidat);
	
	this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/accueil.jsp" ).forward( request, response );
	
}
}
