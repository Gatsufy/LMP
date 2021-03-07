package it.uniroma2.lmp.lmp1;

public abstract class StudenteImpl extends PersonaImpl implements Studente {

	protected String matricola;
	static protected int contatore;
	
	public StudenteImpl(String nome, String cognome){
		
		super(nome, cognome);
		matricola = createMatricola(++contatore);
		
	}
	
	protected abstract String createMatricola(int contatore);
	
	public String getMatricola() {
		
		return matricola;
		
   }
	
	public String toString(){
		
		return super.toString() + " " + matricola;
		
		
	}
	
	
	
	

}
