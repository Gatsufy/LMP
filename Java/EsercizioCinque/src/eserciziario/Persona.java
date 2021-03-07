package eserciziario;

import java.util.Date;

public abstract class Persona {
	
	private String nome;
	
	private String cognome;
	
	private Date date;
	
	private String codiceFiscale;

	public Persona(String nome, String cognome, Date date, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.date = date;
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Date getDate() {
		return date;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	

}
