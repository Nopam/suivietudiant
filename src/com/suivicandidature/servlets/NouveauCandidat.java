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
	 * M�thode permettant de r�cup�rer les donn�es de la JSP Candidatures en m�thode doGet
	 * Cette m�thode permet �galement de faire appel � la m�thode de CandidatBDD permettant de requ�ter la BDD
	 */
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/nouveauCandidat.jsp" ).forward( request, response );
	}
	
	/**
	 * M�thode permettant de r�cup�rer les donn�es de la JSP Candidatures en m�thode doPost
	 * Cette m�thode permet �galement de faire appel � la m�thode de CandidatBDD permettant de requ�ter la BDD
	 */
	public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Code permettant d'ins�rer des candidats dans la BDD
			
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