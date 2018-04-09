package com.suivicandidature.servlets;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suivicandidature.bdd.CandidatBDD;
import com.suivicandidature.beans.Candidat;

public class NouveauCandidat extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Méthode permettant de récupérer les données de la JSP Candidatures en méthode doGet
	 * Cette méthode permet également de faire appel à la méthode de CandidatBDD permettant de requêter la BDD
	 */
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/nouveauCandidat.jsp" ).forward( request, response );
	}
	
	/**
	 * Méthode permettant de récupérer les données de la JSP Candidatures en méthode doPost
	 * Cette méthode permet également de faire appel à la méthode de CandidatBDD permettant de requêter la BDD
	 */
	public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Code permettant d'insérer des candidats dans la BDD
			
			Candidat candidat = new Candidat();
			candidat.setNom(request.getParameter("nom"));
			candidat.setPrenom(request.getParameter("prenom"));
			candidat.setDateNaissance(request.getParameter("dateNaissance"));
			candidat.setVilleAdresse(request.getParameter("mail"));
			candidat.setVilleAdresse(request.getParameter("tel"));
			candidat.setVilleAdresse(request.getParameter("numAdresse"));
			candidat.setVilleAdresse(request.getParameter("rueAdresse"));
			candidat.setVilleAdresse(request.getParameter("compAdresse"));
			candidat.setVilleAdresse(request.getParameter("cpAdresse"));
			candidat.setVilleAdresse(request.getParameter("villeAdresse"));
			
			CandidatBDD tableCandidat = new CandidatBDD();
			tableCandidat.ajouterCandidat(candidat);
			
			
//			request.setAttribute("candidats", tableCandidat.recupererCandidat("Candidatures", "", ""));
//			
//			String choixCandidat = request.getParameter("choixCandidat");
//			request.setAttribute("choixPersonne", choixCandidat);
			
			
			
			this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/nouveauCandidat.jsp" ).forward( request, response );
			
		}
}