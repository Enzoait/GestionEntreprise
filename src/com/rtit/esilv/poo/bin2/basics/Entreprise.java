package com.rtit.esilv.poo.bin2.basics;

public class Entreprise {
	private String nom_entreprise;
	private Adresse adresse;
	private Salariers[] salariers;
	private int jours_ouverts;
	private int heure_ouverture;
	private int heure_fermeture;
	private String telephone;
	private String site_web;
	
	public Entreprise(String nom_entreprise, Adresse adresse, Salariers[] salariers, int jours_ouverts, int heure_ouverture, int heure_fermeture, String telephone, String site_web) {
		this.nom_entreprise = nom_entreprise;
		this.adresse = adresse;
		this.salariers = salariers;
		this.jours_ouverts = jours_ouverts;
		this.heure_ouverture = heure_ouverture;
		this.heure_fermeture = heure_fermeture;
		this.telephone = telephone;
		this.site_web = site_web;
	}
	
	public Entreprise(String nom_entreprise, int nb_salariers) {
		this.nom_entreprise = nom_entreprise;
		this.adresse = null;
		this.salariers = new Salariers[nb_salariers];
		this.jours_ouverts = 0;
		this.heure_ouverture = 0;
		this.heure_fermeture = 0;
		this.telephone = "";
		this.site_web = "";
		
	}
	
	public Entreprise() {
		this("",null,null,0,0,0,"","");
	}
	
	private int verifSalariers() {
		int resultat = 1;
		for (int i = 0; i < salariers.length && resultat == 1; i++) {
			if (salariers[i] == null) {
				resultat = 0;
			}
		}
		return resultat;
	}
	
	public int masseSalariale() {
		int masse_salariale = 0;
		if (verifSalariers() == 1) {
			for (int i = 0; i < salariers.length; i++) {
				int salaire_int = Integer.parseInt(salariers[i].getSalaire());
				masse_salariale += salaire_int;
			}
		}
		System.out.println("Voici la masse salariale mensuelle des employés : " + masse_salariale + "\n");
		return masse_salariale;
	}
	//Calcule l'effectif total des salariés
	private int total() {
		int total = 0;
		if (verifSalariers() == 1) {
			for (int i = 0; i < salariers.length; i++) {
				total +=1;
			}
		}
		return total;
	}
	
	public boolean moyenne() {
		boolean etat_booleen = false;
		if (verifSalariers() == 1) {
			// Le cumul des notes / le cumul des coefficients
				int moyenne = masseSalariale() / total();
				etat_booleen = true;
				System.out.println("La moyenne des salaires des employés est de : " + moyenne + " HCF" + "\n");
		} else {
			System.out.println("Nous ne pouvons pas calculer la moyenne des salaires car un salarié n'a pas de salaire défini.");
		}
		return etat_booleen;
	}
	
	public void afficheInfo() {
		// déclaration de la chaine de caractère
		/**String chaine = "";
		chaine += nom_entreprise;
		if (this.adresse != null){
			chaine += " est situé au " + adresse + "\n";
		}
		if (this.salariers != null) {
			chaine += "La liste des salariés : " + "\n" ;
			for (int i = 0; i < salariers.length; i++) {
				chaine += salariers[i].toString();
			}
		}
		chaine += "Horaires d'ouverture : " + jours_ouverts + "j/7 de " + heure_ouverture + "H à " + heure_fermeture + "H" + "\n" + "Telephone : " + telephone + "\n" + "Site web : " + site_web ;
		return chaine;
		*/
		
		
		if (this.adresse != null){
			System.out.println(nom_entreprise + " est situé au " + adresse + "\n");
		}
		else {
			System.out.println(nom_entreprise);
		}
		if (this.salariers != null) {
			System.out.println("La liste des salariés : " + "\n") ;
			for (int i = 0; i < salariers.length; i++) {
				System.out.println(salariers[i].toString());
			}
		}
		System.out.println("Horaires d'ouverture : " + jours_ouverts + "j/7 de " + heure_ouverture + "H à " + heure_fermeture + "H" + "\n" + "Telephone : " + telephone + "\n" + "Site web : " + site_web) ;
	}
	
	public String getNomEntreprise() {
		return nom_entreprise;
	}

	public void setNomEntreprise(String nom_entreprise) {
		this.nom_entreprise = nom_entreprise;
	}

	public Salariers[] getSalariers() {
		return salariers;
	}

	public void setSalariers(Salariers[] salariers) {
		this.salariers = salariers;
	}

	public int getJoursOuvert() {
		return jours_ouverts;
	}

	public void setJoursOuvert(int jours_ouvert) {
		this.jours_ouverts = jours_ouvert;
	}

	public int getHeureOuverture() {
		return heure_ouverture;
	}

	public void setHeureOuverture(int heure_ouverture) {
		this.heure_ouverture = heure_ouverture;
	}
	
	public int getHeureFermeture() {
		return heure_fermeture;
	}

	public void setHeureFermeture(int heure_fermeture) {
		this.heure_fermeture = heure_fermeture;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getSiteWeb() {
		return site_web;
	}

	public void setSiteWeb(String site_web) {
		this.site_web = site_web;
	}
}

