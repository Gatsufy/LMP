package eserciziario;

import java.util.Date;

public class LiberoProfessionista extends Person {
	
	private String partitaIva;
	
	private String professione;

	public LiberoProfessionista(String nome, String cognome, Date dataNascita, String codiceFiscale, String partitaIva,
			String professione) {
		super(nome, cognome, dataNascita, codiceFiscale);
		this.partitaIva = partitaIva;
		this.professione = professione;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public String getProfessione() {
		return professione;
	}
	
	@Override
	public String toString(){
		return this.getNome()+this.getCognome();
	}

}
