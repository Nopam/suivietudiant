package com.suivicandidature.classes;

public class Professeur extends Personne {
	
	private Module matiereSupervisee;
	
	public Professeur(String nom, String prenom, String adresseMail, Module matiere) {
		super(nom,prenom,adresseMail);
		this.matiereSupervisee = matiere;
	}
	
	public Module getMatiereSupervisee() { return this.matiereSupervisee; }
	public void setMatiereSupervisee(Module matiere) {this.matiereSupervisee = matiere;}
	
	public String toString() {
		return super.toString();
	}
	
}
