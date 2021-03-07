package eserciziario;

import java.util.Date;

public class Prestito {
	
	private Date dataInizio;
	
	private Date dataFine;
	
	private Utente utente;

	public Prestito(Date dataInizio, Date dataFine, Utente utente) {
		super();
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.utente = utente;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public Utente getUtente() {
		return utente;
	}
	
	

}
