package com.suivicandidature.classe;

import java.io.File;
import java.io.FileNotFoundException;
import com.suivicandidature.exception.AgeInvalideException;


public class Candidat extends Personne {
	private int age;
	private boolean diplomeLicenceValide;
	private File cvCandidat;
	private static final int age_min_candidat = 20;
	private static final int age_max_candidat = 40;
	
	//Voir si c'est essentiel lors de la creation du candidat de renseigner son age
	public Candidat(String nom, String prenom, int age, String adresseMail, File cvCandidat){
		super(nom,prenom,adresseMail);
		this.age = age;
		this.cvCandidat = cvCandidat;		
	}
	
	public int getAge(){return this.age;}
	public File getCvCandidat(){ return this.cvCandidat; }
	public boolean getDiplomeValide() {return this.diplomeLicenceValide; }
	
	
	// Revoir age min et age max
	public void setAge(int age) {
		if (age < age_min_candidat || age > age_max_candidat)
			new AgeInvalideException();
		else
			this.age = age;	
	}
	
	public void setCvCandidat(File cv) {
		if (cv == null)
			new FileNotFoundException("aucun cv receptionné");
		else
			cvCandidat = cv;
			
	}
	
	public void setDiplomeValide(boolean validite) { this.diplomeLicenceValide = validite; }


}
