package com.suivicandidature.beans;

public class Ressources {
private int idEtudiant;
private String photoEtudiant, cvEtudiant, lettreMotivationEtudiant;

/**
 * 
 * @param idEtudiant Identifiant du candidat
 * @param photoEtudiant Libelle du fichier photo
 * @param cvEtudiant Libelle du fichier cv
 * @param lettreMotivationEtudiant Libelle du fichier lettre de motivation
 */
public Ressources(int idEtudiant, String photoEtudiant, String cvEtudiant, String lettreMotivationEtudiant) {
	super();
	this.idEtudiant = idEtudiant;
	this.photoEtudiant = photoEtudiant;
	this.cvEtudiant = cvEtudiant;
	this.lettreMotivationEtudiant = lettreMotivationEtudiant;
}

/**
 * Constructeur par defaut
 */
public Ressources() {
	super();
}

/**
 * getter id candidat
 * @return identifiant candidat
 */
public int getIdEtudiant() {
	return idEtudiant;
}

/**
 * Setter id Candidat
 * @param idEtudiant Identifiant du candidat
 */
public void setIdEtudiant(int idEtudiant) {
	this.idEtudiant = idEtudiant;
}


/**
 * 
 * @return libelle photo candidat
 */
public String getPhotoEtudiant() {
	return photoEtudiant;
}

/**
 * Setter libelle photo candidat
 * @param photoEtudiant libelle photo etudiant
 */
public void setPhotoEtudiant(String photoEtudiant) {
	this.photoEtudiant = photoEtudiant;
}

/**
 * getter libelle cv candidat
 * @return libelle cv candidat
 */
public String getCvEtudiant() {
	return cvEtudiant;
}

/**
 * setter libelle cv candidat
 * @param cvEtudiant libelle cv candidat
 */
public void setCvEtudiant(String cvEtudiant) {
	this.cvEtudiant = cvEtudiant;
}


/**
 * getter libelle lettre de motivation candidat
 * @return libelle lettre de motivation candidat
 */
public String getLettreMotivationEtudiant() {
	return lettreMotivationEtudiant;
}

/**
 * setter libelle lettre de motivation candidat
 * @param lettreMotivationEtudiant libelle lettre de motivation candidat
 */
public void setLettreMotivationEtudiant(String lettreMotivationEtudiant) {
	this.lettreMotivationEtudiant = lettreMotivationEtudiant;
}



}
