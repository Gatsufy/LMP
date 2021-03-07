package eserciziario;

import java.util.ArrayList;

public class Esame {
	
	private ArrayList<Studente> listaStudenti;

	public Esame(ArrayList<Studente> listaStudenti) {
		super();
		this.listaStudenti = listaStudenti;
	}

	public ArrayList<Studente> getListaStudenti() {
		return listaStudenti;
	}
	
	public int numeroPromossi(){
		int contatore=0;
		
		for(Studente s: listaStudenti){
			if(s.getProvaScritta().punteggioFinale()>=18){
				contatore++;
			}
		}
		return contatore;
	}
	
	public double percentualeBocciati(){
		int contatore=0;
		double percentuale=0;
		for(Studente s: listaStudenti){
			if(s.getProvaScritta().punteggioFinale()<18){
				contatore++;
				System.out.println(contatore);
			}
		}
		percentuale=((double)contatore/listaStudenti.size());
		return percentuale*100;
	}

}
