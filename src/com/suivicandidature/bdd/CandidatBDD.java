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

public class CandidatBDD {

	private Connection connexion;

    // urlData1 est facultatif, si vous n'avez aucune info a récupérer mettre la valeur à 0
    public List<Candidat> recupererCandidat(String page, String urlData1, String urlData2) {
        List<Candidat> candidats = new ArrayList<Candidat>();
        Statement statement = null;
        String query;
        ResultSet resultat = null;

        loadDatabase();

        try {
        	//Switch permettant d'envoyer des requêtes différentes en fonction des pages web
            switch (page) {
            
            //Requête de récupération des données étudiant depuis l'accueil
            case "accueil" :
            	PreparedStatement preparedStatementAccueil = connexion.prepareStatement("SELECT idEtudiant, nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant, statutEtudiant, dateRDVEntretienEtudiant, heureRDVEntretienEtudiant, demarrageFormationEtudiant FROM etudiants WHERE concat(nomEtudiant, ' ', prenomEtudiant) like ? OR concat(prenomEtudiant, ' ', nomEtudiant) like ? order by ? limit 10	;");
            	preparedStatementAccueil.setString(1, urlData1);
            	preparedStatementAccueil.setString(2, urlData1);
            	preparedStatementAccueil.setString(3, urlData2);
            	resultat = preparedStatementAccueil.executeQuery();
                break;
                
            //Requête de récupération des données étudiant depuis la fiche étudiant  
            case "ficheEtudiant" : 
                PreparedStatement preparedStatement = connexion.prepareStatement("SELECT idEtudiant, nomEtudiant, prenomEtudiant, mailEtudiant, telEtudiant, dateNaissanceEtudiant, numAdresseEtudiant, rueAdresseEtudiant, villeAdresseEtudiant, cpAdresseEtudiant, statutEtudiant, dateRDVEntretienEtudiant, heureRDVEntretienEtudiant, demarrageFormationEtudiant FROM etudiants WHERE idEtudiant = ?;");
                preparedStatement.setString(1, urlData1);
                resultat = preparedStatement.executeQuery();
                break;
                
            //Requête de récupération des données étudiant depuis la fiche étudiant  
            case "Candidatures" : 
                PreparedStatement preparedStatementCandidatures = connexion.prepareStatement("SELECT idEtudiant, nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant, statutEtudiant, dateRDVEntretienEtudiant, heureRDVEntretienEtudiant, demarrageFormationEtudiant FROM etudiants;");
                preparedStatementCandidatures.setString(1, urlData1);
                resultat = preparedStatementCandidatures.executeQuery();
                break;
            }


            //Récupération des données
            while (resultat.next()) {
                int idEtudiant = resultat.getInt("idEtudiant");
                String nom = resultat.getString("nomEtudiant");
                String prenom = resultat.getString("prenomEtudiant");
                System.out.println("id : " + prenom);
                String dateNaissance = resultat.getString("dateNaissanceEtudiant");                
                String villeAdresse = resultat.getString("villeAdresseEtudiant");
                String statut = resultat.getString("statutEtudiant");
                String dateRDVEntretien = resultat.getString("dateRDVEntretienEtudiant");
                String heureRDVEntretien = resultat.getString("heureRDVEntretienEtudiant");
                String demarrageFormation = resultat.getString("demarrageFormationEtudiant");
                
                Candidat candidat = new Candidat();
                candidat.setNom(nom);
                candidat.setPrenom(prenom);
                candidat.setDateNaissance(dateNaissance);
                candidat.setVilleAdresse(villeAdresse);
                candidat.setStatut(statut);
                candidat.setIdEtudiant(idEtudiant);
                candidat.setDateRDVEntretien(dateRDVEntretien);
                candidat.setHeureRDVEntretien(heureRDVEntretien);
                candidat.setDemarrageFormation(demarrageFormation);
                
                if (page.equals("ficheEtudiant")) {
                	 String mail = resultat.getString("mailEtudiant");
                     String tel = resultat.getString("telEtudiant");
                     int numAdresse = resultat.getInt("numAdresseEtudiant");
                     String rueAdresse = resultat.getString("rueAdresseEtudiant");
                     String cpAdresse = resultat.getString("cpAdresseEtudiant");
                     
                     candidat.setMail(mail);
                     candidat.setTel(tel);
                     candidat.setNumAdresse(numAdresse);
                     candidat.setRueAdresse(rueAdresse);
                     candidat.setCpAdresse(cpAdresse);
                    System.out.println("cp: " + cpAdresse);
                }
                
				
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
	
public void ajouterCandidat(Candidat candidat ) {
	loadDatabase();
	try {
		PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO etudiants(nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, mailEtudiant, telEtudiant, numAdresseEtudiant, rueAdresseEtudiant, compAdresseEtudiant, cpAdresseEtudiant, villeAdresseEtudiant) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
		preparedStatement.setString(1, candidat.getNom());
		preparedStatement.setString(2, candidat.getPrenom());
		preparedStatement.setString(3, candidat.getDateNaissance());
		preparedStatement.setString(4, candidat.getMail());
		preparedStatement.setString(5, candidat.getTel());
		preparedStatement.setInt(6, candidat.getNumAdresse());
		preparedStatement.setString(7, candidat.getRueAdresse());
		preparedStatement.setString(8, candidat.getCompAdresse());
		preparedStatement.setString(9, candidat.getCpAdresse());
		preparedStatement.setString(10, candidat.getVilleAdresse());

		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
	
