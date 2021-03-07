package marco.melchiorri;

import java.util.Date;

public class LiberoProfessionista extends Persona {
	
	private String professione;
	
	private String partitaIva;

	public LiberoProfessionista(String nome, String cognome, Date dataNascita, String codiceFiscale, String professione,
			String partitaIva) {
		super(nome, cognome, dataNascita, codiceFiscale);
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
