package marco.melchiorri;

import java.util.Date;

public abstract class Persona {
	
	private String nome;
	
	private String cognome;
	
	private Date dataNascita;
	
	private String codiceFiscale;

	public Persona(String nome, String cognome, Date dataNascita, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.codiceFiscale = codiceFiscale;
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

	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	
	
	

}
