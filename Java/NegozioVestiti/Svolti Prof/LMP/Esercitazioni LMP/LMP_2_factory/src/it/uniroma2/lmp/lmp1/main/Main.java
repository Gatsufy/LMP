package it.uniroma2.lmp.lmp1.main;

import it.uniroma2.lmp.lmp1.impl.PersonaImpl;
import it.uniroma2.lmp.lmp1.impl.StudenteFactory;
import it.uniroma2.lmp.lmp1.impl.StudenteImpl;
import it.uniroma2.lmp.lmp1.model.Persona;
import it.uniroma2.lmp.lmp1.model.Studente;

public class Main {
	
	public static void main(String[] args){
		
		Persona pippo = new PersonaImpl("pippo","franchi");
		
		StudenteFactory fact = new StudenteFactory();
		Studente andrea = fact.createStudente("andrea","rossi", "INF");
		
		Studente mario = fact.createStudente("mario","rossi", "INF");
		Studente gino = fact.createStudente("gino","topo", "PSI");
		
		System.out.println("la persona creata é " + andrea);
		System.out.println("l'altra persona creata é " + mario);	
		System.out.println("l'altra persona creata é " + gino);
		
	}

}
