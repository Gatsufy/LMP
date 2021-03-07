package eserciziario;

import java.util.Date;

public class Studente {
	
	private String nome;
	
	private String cognome;
	
	private Date dataNascita;
	
	private String luogoNascita;
	
	private int annoIscrizione;

	public Studente(String nome, String cognome, Date dataNascita, String luogoNascita, int annoIscrizione) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.annoIscrizione = annoIscrizione;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}
	
	

}
