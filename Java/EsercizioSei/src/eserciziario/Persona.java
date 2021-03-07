package eserciziario;

import java.util.Date;

public class Persona {
	
	private String nome;
	
	private String cognome;
	
	private String luogoNascita;
	
	private Date dataNascita;

	public Persona(String nome, String cognome, String luogoNascita, Date dataNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.luogoNascita = luogoNascita;
		this.dataNascita = dataNascita;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public Date getDataNascita() {
		return dataNascita;
	}
	
	
	
	

}
