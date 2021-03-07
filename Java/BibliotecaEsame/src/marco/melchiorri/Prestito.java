package marco.melchiorri;

import java.util.Date;

public class Prestito {
	
	private Date inizioPrestito;
	
	private Date finePrestito;
	
	private Persona persona;

	public Prestito(Date inizioPrestito, Date finePrestito, Persona persona) {
		super();
		this.inizioPrestito = inizioPrestito;
		this.finePrestito = finePrestito;
		this.persona = persona;
	}

	public Date getInizioPrestito() {
		return inizioPrestito;
	}

	public Date getFinePrestito() {
		return finePrestito;
	}

	public Persona getPersona() {
		return persona;
	}
	
	
	

}
