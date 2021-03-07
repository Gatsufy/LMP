package marco.melchiorri;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Classe{
	
	private String nome;
	
	private int annoFrequentazione; //indica l'eta degli studenti in corso con gl Studi;
	
	private ArrayList<Studente> listaStudenti;

	public Classe(String nome, int annoFrequentazione, ArrayList<Studente> listaStudenti) {
		super();
		this.nome = nome;
		this.annoFrequentazione = annoFrequentazione;
		this.listaStudenti = listaStudenti;
	}

	public String getNome() {
		return nome;
	}

	public int getAnnoFrequentazione() {
		return annoFrequentazione;
	}

	public ArrayList<Studente> getListaStudenti() {
		return listaStudenti;
	}
	
	public void inserisciStudente(Studente s1){
		if(listaStudenti==null){
			listaStudenti= new ArrayList<>();
			listaStudenti.add(s1);
		}
		listaStudenti.add(s1);
	}
	
	public int getNumeroStudenti(){
		return listaStudenti.size();
	}
	
	@SuppressWarnings("deprecation")
	public boolean studenteBocciato(){
	
		for(Studente s: listaStudenti){
			if(s.getAnnoNascita().getYear()<this.annoFrequentazione-1900)
				return true;
		}
		return false;
	}
	
}
