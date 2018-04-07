package com.suivicandidature.classes;

import java.util.Date;

public class Candidat {
	
	private int idEtudiant,	idProfReferent, numAdresse;
	private String nom, prenom, dateNaissance, mail, tel, rueAdresse, compAdresse,
	cpAdresse, villeAdresse, statut, demarrageFormation, dateRDVEntretien, heureRDVEntretien;
	private Date dateCreation, dateMaj;
	
	//Constructeur par défaut
	public Candidat(){
		
	};
	
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
	

	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public int getIdProfReferent() {
		return idProfReferent;
	}

	public void setIdProfReferent(int idProfReferent) {
		this.idProfReferent = idProfReferent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getNumAdresse() {
		return numAdresse;
	}

	public void setNumAdresse(int numAdresse) {
		this.numAdresse = numAdresse;
	}

	public String getRueAdresse() {
		return rueAdresse;
	}

	public void setRueAdresse(String rueAdresse) {
		this.rueAdresse = rueAdresse;
	}

	public String getCompAdresse() {
		return compAdresse;
	}

	public void setCompAdresse(String compAdresse) {
		this.compAdresse = compAdresse;
	}

	public String getCpAdresse() {
		return cpAdresse;
	}

	public void setCpAdresse(String cpAdresse) {
		this.cpAdresse = cpAdresse;
	}

	public String getVilleAdresse() {
		return villeAdresse;
	}

	public void setVilleAdresse(String villeAdresse) {
		this.villeAdresse = villeAdresse;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getDateRDVEntretien() {
		return dateRDVEntretien;
	}

	public void setDateRDVEntretien(String dateRDVEntretien) {
		this.dateRDVEntretien = dateRDVEntretien;
	}
	
	public String getDemarrageFormation() {
		return demarrageFormation;
	}

	public void setDemarrageFormation(String demarrageFormation) {
		this.demarrageFormation = demarrageFormation;
	}

	public String getHeureRDVEntretien() {
		return heureRDVEntretien;
	}

	public void setHeureRDVEntretien(String heureRDVEntretien) {
		this.heureRDVEntretien = heureRDVEntretien;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(Date dateMaj) {
		this.dateMaj = dateMaj;
	}



}
