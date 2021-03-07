package it.uniroma2.lmp;

public class MainClass {

	public static void main(String[] args) {
		int et‡Umana=0;
		Cane balto=new Cane();
		balto.Nome="Balto";
		balto.et‡=8;
		balto.razza="Pastore Tedesco";
		balto.ScriviOutput();
		
		Cane scooby=new Cane();
		scooby.Nome="Scooby";
		scooby.et‡=2;
		scooby.razza="husky";
		
		et‡Umana=scooby.Et‡InAnniUmani(scooby.et‡);
		System.out.println("La corrispettiva et‡ per un umano Ë: "+ et‡Umana);
		
		
	}

}
