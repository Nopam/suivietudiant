package com.suivicandidature.servlets;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suivicandidature.bdd.CandidatBDD;
import com.suivicandidature.classes.*;

public class FicheEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		CandidatBDD listeCandidat = new CandidatBDD();
		request.setAttribute("candidats", listeCandidat.recupererCandidat("ficheEtudiant", 1));
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException { 
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );

			
			 String nom = request.getParameter("name");
			 String prenom = request.getParameter("surname");
			 String dateNaissance = "3";
			 String mail = request.getParameter("mail");
			 String tel = request.getParameter("tel");
			 String statut = request.getParameter("statut");
			 
			 Candidat e1 = new Candidat();
			 e1.setNom(nom);
			 e1.setPrenom(prenom);
			 e1.setDateNaissance(dateNaissance);
			 e1.setMail(mail);
			 e1.setTel(tel);
			 e1.setStatut(statut);
			 
			 
			 
			 System.out.println(e1);;
			 
			 
			}
}