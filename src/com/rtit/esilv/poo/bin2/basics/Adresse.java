package com.rtit.esilv.poo.bin2.basics;

public class Adresse {
	
	private String numero;
	private String nomRue;
	private String code_postal;
	private String ville;
	private String region;
	
	
	public Adresse(String numero, String nomRue, String code_postal, String ville, String region) {
		this.numero = numero;
		this.nomRue = nomRue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.region = region;
	}
	
	public Adresse() {
		this("","","","","");
	}
	
	
	public void affiche() {
		
		System.out.println(toString());
	}	
	
	public String toString() {
		return numero + " " + nomRue + ", " + code_postal + " "+ ville + " à " + region ;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	
	public String getCodePostal() {
		return code_postal;
	}

	public void setCodePostal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getregion() {
		return region;
	}

	public void setregion(String region) {
		this.region = region;
	}
}