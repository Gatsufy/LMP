package eserciziario;

import java.util.Date;

public class Impiegato extends Persona {
	
	private String matricola;
	
	private String mansione;
	
	private int livello;

	public Impiegato(String nome, String cognome, Date date, String codiceFiscale, String matricola, String mansione,
			int livello) {
		super(nome, cognome, date, codiceFiscale);
		this.matricola = matricola;
		this.mansione = mansione;
		this.livello = livello;
	}

	public String getMatricola() {
		return matricola;
	}

	public String getMansione() {
		return mansione;
	}

	public int getLivello() {
		return livello;
	}
	
	

}
