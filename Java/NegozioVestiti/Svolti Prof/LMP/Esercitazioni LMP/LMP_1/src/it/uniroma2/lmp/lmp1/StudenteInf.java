package it.uniroma2.lmp.lmp1;

public class StudenteInf extends StudenteImpl {

	public StudenteInf(String nome, String cognome){
		
		super(nome, cognome);
			
		
		
	}

	@Override
	protected String createMatricola(int contatore) {
		return  "INF" + contatore;
		
		
	}
	
}
