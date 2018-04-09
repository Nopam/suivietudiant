package com.suivicandidature.beans;

import java.util.Date;

public class Candidat {
	
	private int idEtudiant,	idProfReferent, numAdresse;
	private String nom, prenom, dateNaissance, mail, tel, rueAdresse, compAdresse,
	cpAdresse, villeAdresse, statut, demarrageFormation, dateRDVEntretien, heureRDVEntretien;
	private Date dateCreation, dateMaj;
	
	/**
	 * Constructeur par défaut
	 */
	public Candidat(){
		
	};
	
	/**
	 * Constructeur de l'objet candidat
	 * @param idEtudiant = identifiant du candidat
	 * @param idProfReferent = identifiant du professeur referent (inutilise à ce jour)
	 * @param nom = nom de famille du candidat
	 * @param prenom = prenom du candidat
	 * @param dateNaissance = date de naissance du candidat
	 * @param mail = adresse mail du candidat
	 * @param tel = numero de telephone du candidat
	 * @param numAdresse = numero d'habitation du candidat
	 * @param rueAdresse = rue d'habitation du candidat
	 * @param compAdresse = complement d'adresse d'habitation du candidat
	 * @param cpAdresse = code postal d'habitation du candidat
	 * @param villeAdresse = ville d'habitation du candidat
	 * @param statut = statut du candidat ("Accepte", "Refuse", "En attente")
	 * @param dateRDVEntretien = date de rendez-vous du prochain entretien avec le candidat
	 * @param heureRDVEntretien = heure de rendez-vous du prochain entretien avec le candidat
	 * @param demarrageFormation = semestre de demarrage du candidat après acceptation (format Semestre/Annee -> SXX/XXXX)
	 * @param dateCreation = Date de creation de la fiche du candidat
	 * @param dateMaj = Date de dernière mise à jour de la fiche candidat
	 */
	public Candidat(int idEtudiant, int idProfReferent, String nom, String prenom, String dateNaissance, String mail,
			String tel, int numAdresse, String rueAdresse, String compAdresse, String cpAdresse, String villeAdresse, String statut,
			String dateRDVEntretien, String heureRDVEntretien, String demarrageFormation, Date dateCreation, Date dateMaj) {
		super();
		this.idEtudiant = idEtudiant;
		this.idProfReferent = idProfReferent;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.mail = mail;
		this.tel = tel;
		this.numAdresse = numAdresse;
		this.rueAdresse = rueAdresse;
		this.compAdresse = compAdresse;
		this.cpAdresse = cpAdresse;
		this.villeAdresse = villeAdresse;
		this.statut = statut;
		this.dateRDVEntretien = dateRDVEntretien;
		this.heureRDVEntretien = heureRDVEntretien;
		this.demarrageFormation = demarrageFormation;
		this.dateCreation = dateCreation;
		this.dateMaj = dateMaj;
	}
	
	
	/**
	 * 
	 * @return Identifiant de l'etudiant
	 */
	public int getIdEtudiant() {
		return idEtudiant;
	}

	
	/**
	 * 
	 * @param Identifiant de l'etudiant
	 */
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	
	/**
	 * 
	 * @return Identifiant du prof referent
	 */
	public int getIdProfReferent() {
		return idProfReferent;
	}

	
	/**
	 * 
	 * @param Identifiant du prof referent
	 */
	public void setIdProfReferent(int idProfReferent) {
		this.idProfReferent = idProfReferent;
	}

	
	/**
	 * 
	 * @return Nom du candidat
	 */
	public String getNom() {
		return nom;
	}

	
	/**
	 * 
	 * @param Nom du candidat
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	/**
	 * 
	 * @return Prenom du candidat
	 */
	public String getPrenom() {
		return prenom;
	}

	
	/**
	 * 
	 * @param Prenom du candidat
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	/**
	 * 
	 * @return date de naissance du candidat
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}

	
	/**
	 * 
	 * @param Date de naissance du candidat
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	/**
	 * 
	 * @return Adresse mail du candidat
	 */
	public String getMail() {
		return mail;
	}

	
	/**
	 * 
	 * @param Adresse mail du candidat
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	
	/**
	 * 
	 * @return Numero de telephone du candidat
	 */
	public String getTel() {
		return tel;
	}

	
	/**
	 * 
	 * @param Numero de telephone du candidat
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	/**
	 * 
	 * @return numero d'adresse du candidat
	 */
	public int getNumAdresse() {
		return numAdresse;
	}

	
	/**
	 * 
	 * @param Numero d'adresse du candidat
	 */
	public void setNumAdresse(int numAdresse) {
		this.numAdresse = numAdresse;
	}

	
	/**
	 * 
	 * @return Rue du candidat
	 */
	public String getRueAdresse() {
		return rueAdresse;
	}

	
	/**
	 * 
	 * @param Rue du candidat
	 */
	public void setRueAdresse(String rueAdresse) {
		this.rueAdresse = rueAdresse;
	}

	
	/**
	 * 
	 * @return complement d'adresse du candidat
	 */
	public String getCompAdresse() {
		return compAdresse;
	}

	
	/**
	 * 
	 * @param Complement d'adresse du candidat
	 */
	public void setCompAdresse(String compAdresse) {
		this.compAdresse = compAdresse;
	}

	
	/**
	 * 
	 * @return Code postal du candidat
	 */
	public String getCpAdresse() {
		return cpAdresse;
	}

	
	/**
	 * 
	 * @param Code postal du candidat
	 */
	public void setCpAdresse(String cpAdresse) {
		this.cpAdresse = cpAdresse;
	}

	
	/**
	 * 
	 * @return Ville d'habitation du candidat
	 */
	public String getVilleAdresse() {
		return villeAdresse;
	}

	
	/**
	 * 
	 * @param Ville d'habitation du candidat
	 */
	public void setVilleAdresse(String villeAdresse) {
		this.villeAdresse = villeAdresse;
	}

	
	/**
	 * 
	 * @return Statut du candidat ("Accepte", "Refuse", "En attente")
	 */
	public String getStatut() {
		return statut;
	}

	
	/**
	 * 
	 * @param Statut du candidat ("Accepte", "Refuse", "En attente")
	 */
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	
	/**
	 * Methode permettant de definir le semestre et l'annee de demarrage de la formation
	 * @return demarrageFormation (Format Semestre/Annee (SXX/XXXX)
	 */
	public String getDemarrageFormation() {
		return demarrageFormation;
	}

	
	/**
	 * Definition du demarrage de la formation 
	 * @param demarrageFormation (Format Semestre/Annee (SXX/XXXX)
	 */
	public void setDemarrageFormation(String demarrageFormation) {
		this.demarrageFormation = demarrageFormation;
	}

	
	/**
	 * 
	 * @return heure de rendez-vous du prochain entretien;
	 */
	public String getHeureRDVEntretien() {
		return heureRDVEntretien;
	}

	
	/**
	 * 
	 * @param Heure de rendez-vous du prochain entretien
	 */
	public void setHeureRDVEntretien(String heureRDVEntretien) {
		this.heureRDVEntretien = heureRDVEntretien;
	}

	
	/**
	 * 
	 * @return date de rendez-vous du prochain entretien
	 */
	public String getDateRDVEntretien() {
		return dateRDVEntretien;
	}
	
	
	/**
	 * 
	 * @param Date de rendez-vous du prochain entretien
	 */
	public void setDateRDVEntretien(String dateRDVEntretien) {
		this.dateRDVEntretien = dateRDVEntretien;
	}
	
	
	/**
	 * Methode permettant de recuperer la date de creation de la fiche etudiant
	 * @return date de creation de la fiche etudiant
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	
	/**
	 * 
	 * @param Date de creation de la fiche etudiant
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	
	/**
	 * 
	 * @return Date de mise à jour de la fiche etudiant
	 */
	public Date getDateMaj() {
		return dateMaj;
	}

	
	/**
	 * Methode permettant de definir la date de dernière mise à jour du candidat
	 * @param dateMaj (nouvelle date de dernière mise à jour de la fiche etudiant)
	 */
	public void setDateMaj(Date dateMaj) {
		this.dateMaj = dateMaj;
	}
}
