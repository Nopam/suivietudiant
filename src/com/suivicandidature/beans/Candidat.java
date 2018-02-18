package com.suivicandidature.beans;

public class Candidat extends Personne{
	
	String dateInscription;
	
	public Candidat(String nom, String prenom, String dateNaissance, String villeHabitation, String dateInscription) {
		super(nom, prenom, dateNaissance, villeHabitation);
		this.dateInscription = dateInscription;
	}

}
