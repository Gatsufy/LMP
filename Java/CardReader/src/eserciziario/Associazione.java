package eserciziario;

public class Associazione extends Attivita{
	
	public enum Scopo{
		RICREATIVO,CULTURALE,VOLONTARIATO;
	}
	
	private Scopo scopo;

	public Associazione(String sede, int annoInizio, Scopo scopo) {
		super(sede, annoInizio);
		this.scopo = scopo;
	}

	public Scopo getScopo() {
		return scopo;
	}
	
	

}
