package it.uniroma2.lmp;

public class Cane {
	String Nome;
	String razza;
	int et‡;
	
	public void ScriviOutput(){
		System.out.println("Il nome del cane Ë: "+ Nome);
		System.out.println("L'eta del cane Ë: " + et‡);
		System.out.println("La razza del cane Ë: "+ razza);
		
	}
	
	public int Et‡InAnniUmani(int et‡Cane){
		int anniUmani=0;
		if(et‡Cane<=2){
			anniUmani=et‡Cane*11;
		}else{
			anniUmani=22+ ((et‡Cane-2)*5);
		}
		return anniUmani;
	}

}
