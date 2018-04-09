package com.suivicandidature.classes;

public class Administrateur{

	int id;
	String nom, prenom, adresseMail;
	
/**
 * Constructeur classe Administrateur destine a la gestion des droits dans l'application
 * @param id Identifiant de l'administrateur
 * @param nom Nom de l'administrateur
 * @param prenom Prenom de l'administrateur
 * @param adresseMail Adresse mail de l'administrateur
 */
	public Administrateur(int id, String nom, String prenom, String adresseMail) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
	}
}
