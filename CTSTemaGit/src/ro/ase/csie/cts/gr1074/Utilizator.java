package ro.ase.csie.cts.gr1074;

import java.util.ArrayList;

public class Utilizator {
	
	String nume;
	String adresa;
	ArrayList<String> listaTitluriCarti=null;
	
	public Utilizator(String nume,String adresa, ArrayList<String> listaTitluriCarti) {
		super();
		this.nume = nume;
		this.adresa=adresa;
		this.listaTitluriCarti = listaTitluriCarti;
	}
	
	 

}
