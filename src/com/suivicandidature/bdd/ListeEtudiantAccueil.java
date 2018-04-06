package com.suivicandidature.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.suivicandidature.classes.Candidat;

public class ListeEtudiantAccueil_SAV {

	private Connection connexion;
	
	public List<Candidat> recupererCandidat() {
		List<Candidat> candidats = new ArrayList<Candidat>();
		Statement statement = null;
		ResultSet resultat = null;
		
		loadDatabase();
		
		try {
			statement = connexion.createStatement();
			
			//Execution de la requête
			resultat = statement.executeQuery("SELECT idEtudiant, nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant, statutEtudiant, dateRDVEntretienEtudiant FROM etudiants;");
			
			//Récupération des données
			while (resultat.next()) {
				int idEtudiant = resultat.getInt("idEtudiant");
				String nom = resultat.getString("nomEtudiant");
				String prenom = resultat.getString("prenomEtudiant");
				String dateNaissance = resultat.getString("dateNaissanceEtudiant");
				String villeAdresse = resultat.getString("villeAdresseEtudiant");
				String statut = resultat.getString("statutEtudiant");
				//Date dateRDVEntretien = resultat.getDate("dateRDVEntretienEtudiant");
				
				Candidat candidat = new Candidat();
				candidat.setNom(nom);
				candidat.setPrenom(prenom);
				candidat.setDateNaissance(dateNaissance);
				candidat.setVilleAdresse(villeAdresse);
				candidat.setStatut(statut);
				candidat.setIdEtudiant(idEtudiant);
				//candidat.setDateRDVEntretien(dateRDVEntretien);
				
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

// Code permettant d'insérer des candidats dans la BDD	
	
//public void ajouterCandidat(Candidat candidat ) {
//	loadDatabase();
//	try {
//		PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO etudiants(nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant) VALUES(?, ?, ?, ?);");
//		preparedStatement.setString(1, candidat.getNom());
//		preparedStatement.setString(2, candidat.getPrenom());
//		preparedStatement.setString(3, candidat.getDateNaissance());
//		preparedStatement.setString(4, candidat.getVilleAdresse());
//
//		preparedStatement.executeUpdate();
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//}
	
}
	
