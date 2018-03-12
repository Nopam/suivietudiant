package com.suivicandidature.classe;

public class Test {

	public static void main(String[] args) {

		Etudiant toto = new Etudiant("UnNom","unPrenom",15,"toto@hotmail.fr",null,2016);
		Etudiant titi = new Etudiant("Name","unPrenom",15,"toto@hotmail.fr",null,2056);
		Etudiant tata = new Etudiant("UnNom","unPrenom",15,"toto@hotmail.fr",null,2012);
		System.out.println(toto.toString());
		System.out.println(Etudiant.nombre_etudiant);

	}

}
