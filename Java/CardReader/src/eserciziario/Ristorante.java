package eserciziario;

public class Ristorante extends Attivita{
	
	public enum Tipo{
		PIZZERIA,ITALIANO,ETNICO;
	}
	
	private String partitaIva;
	
	private Tipo tipoCucina;

	public Ristorante(String sede, int annoInizio, String partitaIva, Tipo tipoCucina) {
		super(sede, annoInizio);
		this.partitaIva = partitaIva;
		this.tipoCucina = tipoCucina;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public Tipo getTipoCucina() {
		return tipoCucina;
	}
	
	
	
	

}
