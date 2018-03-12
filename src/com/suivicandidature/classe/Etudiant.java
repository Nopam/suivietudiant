package com.suivicandidature.classe;

import java.io.File;

public class Etudiant extends Candidat {

	private int anneeAdmission;
	public static int nombre_etudiant = 0;
	
	public Etudiant(String nom, String prenom, int age, String adresseMail, File cvCandidat, int anneeAdmission) {
		super(nom,prenom,age,adresseMail,cvCandidat);
		this.anneeAdmission = anneeAdmission;
		System.out.println("Un nouvel étudiant vient d'être admis");
		Etudiant.nombre_etudiant++;
	}
	
	public int getAnneeAdmission() { return this.anneeAdmission;}
	// Etant donné qu'il n'y a pas de suppression de candidat, l'annee d'admission sera tjrs la même donc pas de setter.
}
