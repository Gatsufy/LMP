package eserciziario;

public abstract class Attivita {
	
	private String sede;
	
	private int annoInizio;

	public Attivita(String sede, int annoInizio) {
		super();
		this.sede = sede;
		this.annoInizio = annoInizio;
	}

	public String getSede() {
		return sede;
	}

	public int getAnnoInizio() {
		return annoInizio;
	}
	
	
	
	
	
	

}
