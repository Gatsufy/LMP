package it.uniroma2.lmp.lmp1.impl;

import it.uniroma2.lmp.lmp1.model.Studente;

public class StudenteFactory {
	
	private int contatore;
	
	public Studente createStudente( String nome, String cognome, String codicefacolta ){
		return new StudenteImpl(nome, cognome, codicefacolta + ++contatore);
	}
	
	

}
