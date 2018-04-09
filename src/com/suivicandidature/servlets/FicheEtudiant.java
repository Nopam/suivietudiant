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
		// J'ai ajouté un 3eme param vide 
		request.setAttribute("candidats", listeCandidat.recupererCandidat("ficheEtudiant", request.getParameter("id"), ""));
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );

	}
	
	/**
	 * Méthode permettant de récupérer les données de la JSP ficheetudiant en méthode doGet
	 * Cette méthode permet également de faire appel à la méthode de CandidatBDD permettant de requêter la BDD
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException { 
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );

			//Récupération des données de la jsp
			 String nom = request.getParameter("name");
			 String prenom = request.getParameter("surname");
			 String dateNaissance = "3";
			 String mail = request.getParameter("mail");
			 String tel = request.getParameter("tel");
			 String statut = request.getParameter("statut");
			 
			 //Redéfinition de l'objet étudiant
			 e1.setNom(nom);
			 e1.setPrenom(prenom);
			 e1.setDateNaissance(dateNaissance);
			 e1.setMail(mail);
			 e1.setTel(tel);
			 e1.setStatut(statut);
			 
			 
			 //test
			 System.out.println(e1);;
			 
			 
			}
}