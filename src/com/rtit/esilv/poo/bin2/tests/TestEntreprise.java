package com.rtit.esilv.poo.bin2.tests;

import com.rtit.esilv.poo.bin2.basics.Adresse;
import com.rtit.esilv.poo.bin2.basics.Salariers;
import com.rtit.esilv.poo.bin2.basics.Entreprise;


public class TestEntreprise {
	public static void main(String[] args) {
		
		Adresse adr = new Adresse ("Rte des Acacias","49","1227","Carouge", "Genève");
		Salariers Maxime = new Salariers("Maxime", "2004","5500");
		Salariers Valentin = new Salariers("Valentin", "2004","7800");
		Salariers Robin = new Salariers("Robin", "2003","6900");
		Salariers Callum = new Salariers("Callum", "2003","5400");
		Salariers[] salariers = {Maxime,Valentin,Robin,Callum};
		
		Entreprise BCGE = new Entreprise("BCGE Agence BCGE Praille-Acacias",adr,salariers,7,9,18,"058 211 21 00","bcge.ch");
		
		BCGE.afficheInfo();
		BCGE.masseSalariale();
		BCGE.moyenne();
	}
}
