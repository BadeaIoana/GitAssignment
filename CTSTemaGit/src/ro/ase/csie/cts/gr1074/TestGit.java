package ro.ase.csie.cts.gr1074;

import java.util.ArrayList;

public class TestGit {

	public static void main(String[] args) {
		
		System.out.println("Hello Git ! Denumirea proiectului de licenta este 'Aplicatie mobila pentru schimb de carti'.");

		ArrayList<String> listaCarti=new ArrayList<>();
		Utilizator utilizator = new Utilizator("Alexandru","Iasi",listaCarti);
		
		utilizator.adaugaCarte("Sherlock Holmes");
		utilizator.adaugaCarte("Call me by your name");
		
		System.out.println("Utilizatorul "+utilizator.getNume()+" are "+utilizator.nrCartiInBiblioteca()+" carti in biblioteca sa virtuala.");
		
	}

}
