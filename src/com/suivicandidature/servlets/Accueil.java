package com.suivicandidature.servlets;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

		String nom = request.getParameter("nom");
    	request.setAttribute("nom", nom);
    	String age = request.getParameter("age");
    	request.setAttribute("age", age);
    	String ville = request.getParameter("ville");
    	request.setAttribute("ville", ville);
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/accueil.jsp" ).forward( request, response );
	}
}