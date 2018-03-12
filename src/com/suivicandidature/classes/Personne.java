package com.suivicandidature.classes;

public abstract class Personne {
	private String nom;
	private String prenom;
	private String adresseMail;
	
	public Personne(String nom, String prenom, String adresseMail){
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
	}
	
	public void setNom(String nom){ this.nom = nom;}
	public void setPrenom(String prenom){ this.prenom = prenom;}
	public void setAdresseMail(String adresseMail){ this.adresseMail = adresseMail;}
	
	public String getNom() {return this.nom;}
	public String getPrenom() { return this.prenom; }
	public String getAdresseMail() { return this.adresseMail; }
	
	public String toString() {
		return "Nom: "+this.nom+" ,Prenom: "+this.prenom+" ,Mail: "+this.adresseMail;
	}

}
