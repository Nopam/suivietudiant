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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException { 
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/ficheEtudiant.jsp" ).forward( request, response );

			
			 String nom = request.getParameter("name");
			 String prenom = request.getParameter("surname");
			 String dateNaissance = "3";
			 String adresse = request.getParameter("adresse");
			 int numeroRue = Integer.parseInt(request.getParameter("numeroRue"));
			 String libelleAdresse = request.getParameter("libelleAdresse");
			 String complementAdresse = request.getParameter("complementAdresse");
			 String ville = request.getParameter("ville");
			 String codePostal = request.getParameter("codePostal");
			 String mail = request.getParameter("mail");
			 String tel = request.getParameter("tel");
			 
			 String statut = request.getParameter("statut");
			 String semestreDemarrage = request.getParameter("semestreDemarrage");
			 
			 Candidat e1 = new Candidat();
			 e1.setNom(nom);
			 e1.setPrenom(prenom);
			 e1.setDateNaissance(dateNaissance);
			 e1.setNumAdresse(numeroRue);
			 e1.setRueAdresse(libelleAdresse);
			 e1.setCompAdresse(complementAdresse);
			 e1.setCpAdresse(codePostal);
			 e1.setMail(mail);
			 e1.setTel(tel);
			 e1.setStatut(statut);
			 // e1.setSemestreDemarrage(semestreDemarrage);
			 
			 
			 
			 System.out.println(e1);;
			 
			 
			}
}