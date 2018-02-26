package com.suivicandidature.servlets;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suivicandidature.bdd.PersonnesBDD;
import com.suivicandidature.beans.Personne;

public class TestBootstrap extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
			PersonnesBDD tablePersonne = new PersonnesBDD();
			request.setAttribute("personnes", tablePersonne.recupererPersonne());
			this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/testBootstrap.jsp" ).forward( request, response );
		}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Personne personne = new Personne();
		personne.setNom(request.getParameter("nom"));
		personne.setPrenom(request.getParameter("prenom"));
		personne.setDateNaissance(request.getParameter("dateNaissance"));
		personne.setVilleHabitation(request.getParameter("ville"));
		
		PersonnesBDD tablePersonne = new PersonnesBDD();
		tablePersonne.ajouterPersonne(personne);
		request.setAttribute("personnes", tablePersonne.recupererPersonne());
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vues/testBootstrap.jsp" ).forward( request, response );
		
	}
	}