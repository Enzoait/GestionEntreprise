package com.rtit.esilv.poo.bin2.basics;



public class Salariers {
	
	private String prenom;
	private String annee_de_Naissance;
	private String salaire;

	
	public Salariers(String prenom,  String annee_de_Naissance, String salaire) {
		this.prenom = prenom;
		this.annee_de_Naissance = annee_de_Naissance;
		this.salaire = salaire;
	}
	public Salariers() {
		this("", "", "");
	}
	
	public void affiche() {
		
		System.out.println(toString());
	}	
	
	public String toString() {
		return "Nom : " + prenom + " Année de naissance: " + annee_de_Naissance + " - Salaire Mensuel : " + salaire + "CHF" + "\n";
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAnnee_de_Naissance() {
		return annee_de_Naissance;
	}

	public void setAnnee_de_Naissance(String annee_de_Naissance) {
		this.annee_de_Naissance = annee_de_Naissance;
	}

	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}
}
