package com.suivicandidature.beans;

public class Ressources {
private int idEtudiant;
private String photoEtudiant, cvEtudiant, lettreMotivationEtudiant;

public Ressources(int idEtudiant, String photoEtudiant, String cvEtudiant, String lettreMotivationEtudiant) {
	super();
	this.idEtudiant = idEtudiant;
	this.photoEtudiant = photoEtudiant;
	this.cvEtudiant = cvEtudiant;
	this.lettreMotivationEtudiant = lettreMotivationEtudiant;
}

public Ressources() {
	super();
}


public int getIdEtudiant() {
	return idEtudiant;
}

public void setIdEtudiant(int idEtudiant) {
	this.idEtudiant = idEtudiant;
}

public String getPhotoEtudiant() {
	return photoEtudiant;
}

public void setPhotoEtudiant(String photoEtudiant) {
	this.photoEtudiant = photoEtudiant;
}

public String getCvEtudiant() {
	return cvEtudiant;
}

public void setCvEtudiant(String cvEtudiant) {
	this.cvEtudiant = cvEtudiant;
}

public String getLettreMotivationEtudiant() {
	return lettreMotivationEtudiant;
}

public void setLettreMotivationEtudiant(String lettreMotivationEtudiant) {
	this.lettreMotivationEtudiant = lettreMotivationEtudiant;
}



}
