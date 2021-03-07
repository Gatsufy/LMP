package eserciziario;

public class Negozio extends Attivita{
	
	private String partitaIva;
	
	private String merceVenduta;

	public Negozio(String sede, int annoInizio, String partitaIva, String merceVenduta) {
		super(sede, annoInizio);
		this.partitaIva = partitaIva;
		this.merceVenduta = merceVenduta;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public String getMerceVenduta() {
		return merceVenduta;
	}
	
	
	

}
