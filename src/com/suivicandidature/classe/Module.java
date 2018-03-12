package com.suivicandidature.classe;

public class Module {
	private String nomModule;

	public Module(String nom) {
		this.nomModule = nom;
	}
	
	public void setNomModule(String nomModule) { this.nomModule = nomModule;}
	public String getNomModule() {return this.nomModule; }
	
	public String toString() {
		return "Nom du module supervisée: "+this.nomModule;
	}
	
}
