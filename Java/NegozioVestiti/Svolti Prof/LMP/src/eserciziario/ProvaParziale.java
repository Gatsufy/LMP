package eserciziario;

import java.util.ArrayList;

public class ProvaParziale {
	
	private int voto;
	
	private ArrayList<String> domande;
	
	Studente studente;

	public ProvaParziale(int voto, ArrayList<String> domande, Studente studente) {
		super();
		this.voto = voto;
		this.domande = domande;
		this.studente = studente;
	}

	public int getVoto() {
		return voto;
	}

	public ArrayList<String> getDomande() {
		return domande;
	}

	public Studente getStudente() {
		return studente;
	}

}
