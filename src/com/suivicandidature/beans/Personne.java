package com.suivicandidature.beans;
import java.lang.*;

public class Personne {
	
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String villeHabitation;
	
	public Personne(String nom, String prenom, String dateNaissance, String villeHabitation) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setDateNaissance(dateNaissance);
		this.setVilleHabitation(villeHabitation);
	}

	public Personne() {
		
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

	public String getVilleHabitation() {
		return villeHabitation;
	}

	public void setVilleHabitation(String villeHabitation) {
		this.villeHabitation = villeHabitation;
	}
	
}
