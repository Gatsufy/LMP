package it.uniroma2.lmp.lmp1;

public class StudentePSI extends StudenteImpl {

	public StudentePSI(String nome, String cognome){
		
		super(nome, cognome);
			
		
		
	}

	@Override
	protected String createMatricola(int contatore) {
		return  "PSI" + contatore;
		
		
	}
	
}
