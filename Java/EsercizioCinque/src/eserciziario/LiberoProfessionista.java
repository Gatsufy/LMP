package eserciziario;

import java.util.Date;

public class LiberoProfessionista extends Persona {
	
	private String professione;
	
	private String partitaIva;

	public LiberoProfessionista(String nome, String cognome, Date date, String codiceFiscale, String professione,
			String partitaIva) {
		super(nome, cognome, date, codiceFiscale);
		this.professione = professione;
		this.partitaIva = partitaIva;
	}

	public String getProfessione() {
		return professione;
	}

	public String getPartitaIva() {
		return partitaIva;
	}
	
	
	
	
}
