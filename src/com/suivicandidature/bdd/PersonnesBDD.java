package com.suivicandidature.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.suivicandidature.beans.Personne;

public class PersonnesBDD {

	private Connection connexion;
	
	public List<Personne> recupererPersonne() {
		List<Personne> personnes = new ArrayList<Personne>();
		Statement statement = null;
		ResultSet resultat = null;
		
		loadDatabase();
		
		try {
			statement = connexion.createStatement();
			
			//Execution de la requête
			resultat = statement.executeQuery("SELECT nom, prenom, dateNaissance, ville FROM personnes;");
			
			//Récupération des données
			while (resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				String dateNaissance = resultat.getString("dateNaissance");
				String ville = resultat.getString("ville");
				
				Personne personne = new Personne();
				personne.setNom(nom);
				personne.setPrenom(prenom);
				personne.setDateNaissance(dateNaissance);
				personne.setVilleHabitation(ville);
				
				personnes.add(personne);
			}
		} catch (SQLException e) {
		} finally {
				//Fermeture de la connexion
				try {
					if (resultat != null)
						resultat.close();
					if (statement != null)
						statement.close();
					if (connexion != null)
						connexion.close();
					} catch (SQLException ignore) {
						
					}
			}
			return personnes;
	}
	
	private void loadDatabase() {
		//Chargement du driver
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		}
		
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/suivicandidature", "root", "");
		} catch (SQLException e) {
				e.printStackTrace();
			}
	}

public void ajouterPersonne(Personne personne ) {
	loadDatabase();
	try {
		PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO personnes(nom, prenom, dateNaissance, ville) VALUES(?, ?, ?, ?);");
		preparedStatement.setString(1, personne.getNom());
		preparedStatement.setString(2, personne.getPrenom());
		preparedStatement.setString(3, personne.getDateNaissance());
		preparedStatement.setString(4, personne.getVilleHabitation());

		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
	
