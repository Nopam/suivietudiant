package com.suivicandidature.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.suivicandidature.beans.Candidat;

public class ListeEtudiantAccueil {

	private Connection connexion;
	
	public List<Candidat> recupererCandidat() {
		List<Candidat> candidats = new ArrayList<Candidat>();
		Statement statement = null;
		ResultSet resultat = null;
		
		loadDatabase();
		
		try {
			statement = connexion.createStatement();
			
			//Execution de la requête
			resultat = statement.executeQuery("SELECT nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant FROM etudiants;");
			
			//Récupération des données
			while (resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				String dateNaissance = resultat.getString("dateNaissance");
				String villeAdresse = resultat.getString("villeAdresse");
				
				Candidat candidat = new Candidat();
				candidat.setNom(nom);
				candidat.setPrenom(prenom);
				candidat.setDateNaissance(dateNaissance);
				candidat.setVilleAdresse(villeAdresse);
				
				candidats.add(candidat);
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
			return candidats;
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

public void ajouterCandidat(Candidat candidat ) {
	loadDatabase();
	try {
		PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO etudiants(nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant) VALUES(?, ?, ?, ?);");
		preparedStatement.setString(1, candidat.getNom());
		preparedStatement.setString(2, candidat.getPrenom());
		preparedStatement.setString(3, candidat.getDateNaissance());
		preparedStatement.setString(4, candidat.getVilleAdresse());

		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
	
