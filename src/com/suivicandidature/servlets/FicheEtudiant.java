package com.suivicandidature.servlets;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suivicandidature.bdd.CandidatBDD;
import com.suivicandidature.beans.Candidat;
import com.suivicandidature.classes.*;

public class FicheEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Candidat e1 = new Candidat();

	
	/**
	 * Méthode permettant de récupérer les données de la JSP ficheetudiant en méthode doGet
	 * Cette méthode permet également de faire appel à la méthode de CandidatBDD permettant de requêter la BDD
	 */
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		CandidatBDD listeCandidat = new CandidatBDD();
		request.setAttribute("candidats", listeCandidat.recupererCandidat("ficheEtudiant", request.getParameter("id"), ""));
		
		 // Cacher l'image puisqu'on vient en GET seulement depuis la page d'accueil
		 request.setAttribute("reponse", "none");
		 
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );
	
	}
	
	/**
	 * Méthode permettant de récupérer les données de la JSP ficheetudiant en méthode doGet
	 * Cette méthode permet également de faire appel à la méthode de CandidatBDD permettant de requêter la BDD
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException { 
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );

			//Récupération des données renseigner dans la page web
			 int id = Integer.parseInt(request.getParameter("id"));
			 String nom = request.getParameter("name");
			 String prenom = request.getParameter("surname");
			 String dateNaissance = request.getParameter("date");
			 String mail = request.getParameter("mail");
			 String tel = request.getParameter("tel");
			 String statut = request.getParameter("studentStatut");
			 int numAdresse = Integer.parseInt(request.getParameter("num_rue"));
			 String rueAdresse = request.getParameter("rue");
			 String cpAdresse = request.getParameter("cp");
			 String villeAdresse = request.getParameter("ville");
			 String dateRDVEntretien = request.getParameter("dateRDVEntretien");
			 String heureRDVEntretien = request.getParameter("heureRDVEntretien");
			 String demarrageFormation = request.getParameter("demarrage");
					
			 
			 e1.setIdEtudiant(id);
			 e1.setNom(nom);
			 e1.setPrenom(prenom);
			 e1.setDateNaissance(dateNaissance);
			 e1.setMail(mail);
			 e1.setTel(tel);
			 e1.setNumAdresse(numAdresse);
			 e1.setRueAdresse(rueAdresse);
			 e1.setCpAdresse(cpAdresse);
			 e1.setVilleAdresse(villeAdresse);
			 e1.setDateRDVEntretien(dateRDVEntretien);
			 e1.setHeureRDVEntretien(heureRDVEntretien);
			 e1.setStatut(statut);
			 e1.setDemarrageFormation(demarrageFormation);
			 
			 
			 
			CandidatBDD updateCandidat = new CandidatBDD();
			updateCandidat.modifierCandidat(e1);
				
			 //test
			 System.out.println( "Prenom " + e1.getPrenom());
			 request.setAttribute("reponse", "run-in");

			 
			 
			}
}