package it.uniroma2.lmp.lmp1.impl;

import it.uniroma2.lmp.lmp1.model.Studente;

public class StudenteImpl extends PersonaImpl implements Studente {

	protected String matricola;
	
	StudenteImpl(String nome, String cognome, String matricola){
		
		super(nome, cognome);
		this.matricola = matricola;
	}
	
	
	public String getMatricola() {
		
		return matricola;
		
   }
	
	public String toString(){
		
		return super.toString() + " " + matricola;
		
		
	}
	
	
	
	

}
