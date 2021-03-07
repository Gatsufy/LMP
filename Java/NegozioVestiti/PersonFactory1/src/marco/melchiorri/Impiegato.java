package marco.melchiorri;

import java.util.Date;

public class Impiegato extends Persona {
	
	private String matricola;
	
	private int livello;
	
	private String mansione;

	public Impiegato(String nome, String cognome, Date dataNascita, String codiceFiscale, String matricola, int livello,
			String mansione) {
		super(nome, cognome, dataNascita, codiceFiscale);
		this.matricola = matricola;
		this.livello = livello;
		this.mansione = mansione;
	}

	public String getMatricola() {
		return matricola;
	}

	public int getLivello() {
		return livello;
	}

	public String getMansione() {
		return mansione;
	}
	
	

}
