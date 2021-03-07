package marco.melchiorri;

import java.util.Date;

public class Studente {
	
	private Date annoNascita;
	
	private int annoIscrizione;
	
	private String luogoNascita;
	
	private String nome, cognome;

	public Studente(Date annoNascita,  String luogoNascita, String nome, String cognome) {
		super();
		this.annoNascita = annoNascita;
		this.luogoNascita = luogoNascita;
		this.nome = nome;
		this.cognome = cognome;
	}

	public Date getAnnoNascita() {
		return annoNascita;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	

}
