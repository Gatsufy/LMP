package marco.melchiorri;

import java.util.Date;

public class Impiegato extends Person {
	
	private String matricola;
	
	private Integer livello;
	
	private String mansione;

	public Impiegato(String nome, String cognome, Date dataNascita, String codiceFiscale, String matricola, Integer livello,
			String mansione) {
		super(nome, cognome, dataNascita, codiceFiscale);
		this.matricola = matricola;
		this.livello = livello;
		this.mansione = mansione;
	}

	public String getMatricola() {
		return matricola;
	}

	public Integer getLivello() {
		return livello;
	}

	public String getMansione() {
		return mansione;
	}
	
	@Override
	public String toString(){
		return super.toString()+","+matricola+","+livello+","+mansione;
	}
	

}
