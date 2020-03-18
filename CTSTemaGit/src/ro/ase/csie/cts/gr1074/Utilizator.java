package ro.ase.csie.cts.gr1074;

import java.util.ArrayList;

public class Utilizator implements GestionareBibliotecaPersonala {
	
	String nume;
	String adresa;
	ArrayList<String> listaTitluriCarti=null;
	
	public Utilizator(String nume,String adresa, ArrayList<String> listaTitluriCarti) {
		super();
		this.nume = nume;
		this.adresa=adresa;
		this.listaTitluriCarti = listaTitluriCarti;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public ArrayList<String> getListaTitluriCarti() {
		return listaTitluriCarti;
	}

	public void setListaTitluriCarti(ArrayList<String> listaTitluriCarti) {
		this.listaTitluriCarti = listaTitluriCarti;
	}

	@Override
	public void adaugaCarte(String titlu) {
		if(titlu!=null)
		{
			listaTitluriCarti.add(titlu);
		}
	}

	@Override
	public int nrCartiInBiblioteca() {
	
		if(listaTitluriCarti!=null)
		{
			return listaTitluriCarti.size();
		}
		else
			return 0;
	}
	
	 

}
