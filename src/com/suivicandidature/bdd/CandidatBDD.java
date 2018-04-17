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
import com.suivicandidature.beans.Ressources;

import java.util.Date;

public class CandidatBDD {

	private Connection connexion;

	/**
	 * 
	 * @param page String utilise dans le Switch..Case
	 * @param urlData1 Premier parametre a destination des requetes SQL
	 * @param urlData2 Second parametre a destination des requetes SQL
	 * @return objet candidat
	 */
    // urlData1 est facultatif, si vous n'avez aucune info a r�cup�rer mettre la valeur � 0
	public Object[] recupererCandidat(String page, String urlData1, String urlData2) {
        List<Candidat> candidats = new ArrayList<Candidat>();
        List<Ressources> ressources = new ArrayList<Ressources>();
        Statement statement = null;
        String query;
        ResultSet resultat = null;

        loadDatabase();

        try {
        	//Switch permettant d'envoyer des requ�tes diff�rentes en fonction des pages web
            switch (page) {
            
            //Requ�te de r�cup�ration des donn�es �tudiant depuis l'accueil
            case "accueil" :
            	String requete = ("SELECT idEtudiant, nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant, statutEtudiant, dateRDVEntretienEtudiant, heureRDVEntretienEtudiant, demarrageFormationEtudiant FROM etudiants WHERE concat(nomEtudiant, ' ', prenomEtudiant) like ? OR concat(prenomEtudiant, ' ', nomEtudiant) like ? " + urlData2 + " limit 10;");
            	//PreparedStatement preparedStatementAccueil = connexion.prepareStatement("SELECT idEtudiant, nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant, statutEtudiant, dateRDVEntretienEtudiant, heureRDVEntretienEtudiant, demarrageFormationEtudiant FROM etudiants WHERE concat(nomEtudiant, ' ', prenomEtudiant) like ? OR concat(prenomEtudiant, ' ', nomEtudiant) like ? order by ? limit 10;");
            	PreparedStatement preparedStatementAccueil = connexion.prepareStatement(requete);
            	preparedStatementAccueil.setString(1, urlData1);
            	preparedStatementAccueil.setString(2, urlData1);
            	//preparedStatementAccueil.setString(3, urlData2);
            	resultat = preparedStatementAccueil.executeQuery();
            	System.out.println("urlData1 : " + urlData1);
            	System.out.println("UrlData2 : " + urlData2);
            	System.out.println(preparedStatementAccueil.toString());
            	//System.out.println(requete);
                break;
                
            //Requ�te de r�cup�ration des donn�es �tudiant depuis la fiche �tudiant  
            case "ficheEtudiant" : 
                PreparedStatement preparedStatement = connexion.prepareStatement("SELECT etudiants.idEtudiant, nomEtudiant, prenomEtudiant, mailEtudiant, telEtudiant, dateNaissanceEtudiant, numAdresseEtudiant, rueAdresseEtudiant, villeAdresseEtudiant, cpAdresseEtudiant, statutEtudiant, dateRDVEntretienEtudiant, heureRDVEntretienEtudiant, demarrageFormationEtudiant, cvEtudiant, lettreMotivationEtudiant,photoEtudiant FROM etudiants, ressources WHERE etudiants.idEtudiant = ? And etudiants.idEtudiant = ressources.idEtudiant;");
                preparedStatement.setString(1, urlData1);
                resultat = preparedStatement.executeQuery();
                break;
                
            //Requ�te de r�cup�ration des donn�es �tudiant depuis la fiche �tudiant  
            case "Candidatures" : 
                PreparedStatement preparedStatementCandidatures = connexion.prepareStatement("SELECT idEtudiant, nomEtudiant, prenomEtudiant, dateNaissanceEtudiant, villeAdresseEtudiant, statutEtudiant, dateRDVEntretienEtudiant, heureRDVEntretienEtudiant, demarrageFormationEtudiant FROM etudiants;");
                preparedStatementCandidatures.setString(1, urlData1);
                resultat = preparedStatementCandidatures.executeQuery();
                break;
            }


            //R�cup�ration des donn�es
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
                Ressources ressource= new Ressources();
                
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

                     
                     String photoEtudiant =resultat.getString("photoEtudiant");
                     String cvEtudiant=resultat.getString("cvEtudiant");
                     String lettreMotivationEtudiant=resultat.getString("lettreMotivationEtudiant");
                     
                     ressource.setIdEtudiant(idEtudiant);
                     ressource.setCvEtudiant(cvEtudiant);
                     ressource.setLettreMotivationEtudiant(lettreMotivationEtudiant);
                     ressource.setPhotoEtudiant(photoEtudiant);
                     
                     candidat.setMail(mail);
                     candidat.setTel(tel);
                     candidat.setNumAdresse(numAdresse);
                     candidat.setRueAdresse(rueAdresse);
                     candidat.setCpAdresse(cpAdresse);
                     
                     
                    System.out.println("cp: " + cpAdresse);
                }
                
				
                candidats.add(candidat);
                ressources.add(ressource);
			
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
        Object obj[] = {candidats,ressources};	
        return obj;
	}

    /**
     * Connexion a la base de donn�es MySQL
     */
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

	/**
	 * Insertion d'objet "Candidat" dans la base de donnees
	 * @param candidat Objet candidat
	 */
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
			System.out.println("CREATION CANDIDAT : Connexion � la base de donn�e impossible");
		}
	}
	
	public void modifierCandidat(Candidat candidat ) {
		loadDatabase();
		try {
			PreparedStatement preparedStatement = connexion.prepareStatement("UPDATE etudiants SET nomEtudiant = ?, prenomEtudiant = ?, dateNaissanceEtudiant = ?, mailEtudiant = ?, telEtudiant = ?, numAdresseEtudiant = ?, rueAdresseEtudiant = ?, cpAdresseEtudiant = ?, villeAdresseEtudiant = ?, dateRDVEntretienEtudiant = ?, heureRDVEntretienEtudiant = ?, statutEtudiant = ?, demarrageFormationEtudiant = ? WHERE idEtudiant = ? ;");
			preparedStatement.setString(1, candidat.getNom());
			preparedStatement.setString(2, candidat.getPrenom());
			preparedStatement.setString(3, candidat.getDateNaissance());
			preparedStatement.setString(4, candidat.getMail());
			preparedStatement.setString(5, candidat.getTel());
			preparedStatement.setInt(6, candidat.getNumAdresse());
			preparedStatement.setString(7, candidat.getRueAdresse());
			preparedStatement.setString(8, candidat.getCpAdresse());
			preparedStatement.setString(9, candidat.getVilleAdresse());
			preparedStatement.setString(10, candidat.getDateRDVEntretien());
			preparedStatement.setString(11, candidat.getHeureRDVEntretien());
			preparedStatement.setString(12, candidat.getStatut());
			preparedStatement.setString(13, candidat.getDemarrageFormation());
			preparedStatement.setInt(14, candidat.getIdEtudiant());
			System.out.println("Show  " + preparedStatement.toString());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("UPDATE : Connexion � la base de donn�e impossible");
		}
	}
}
	
