package com.suivicandidature.servlets;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.suivicandidature.classes.*;

public class FicheEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );

	}
	
	protected void doPost(HttpServletRequest request,  HttpServletResponse response) 
			 throws ServletException, IOException { 
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );

			
			 String nom = request.getParameter("name");
			 String prenom = request.getParameter("surname");
			 int dateNaiss = 3;
			 String mail = request.getParameter("mail");
			 String tel = request.getParameter("tel");
			 String statut = request.getParameter("statut");
			 
			 Candidat_SAV e1 = new Candidat_SAV(nom,prenom,dateNaiss,mail,null);
			 System.out.println(e1);;
			 
			 
			}
}