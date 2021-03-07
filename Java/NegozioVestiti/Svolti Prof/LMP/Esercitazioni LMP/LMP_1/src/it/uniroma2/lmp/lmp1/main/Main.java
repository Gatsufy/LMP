package it.uniroma2.lmp.lmp1.main;

import it.uniroma2.lmp.lmp1.Persona;
import it.uniroma2.lmp.lmp1.PersonaImpl;
import it.uniroma2.lmp.lmp1.StudenteImpl;
import it.uniroma2.lmp.lmp1.StudenteInf;
import it.uniroma2.lmp.lmp1.StudentePSI;

public class Main {
	
	public static void main(String[] args){
		
		Persona pippo = new PersonaImpl("pippo","franchi");
		
		Persona andrea = new StudenteInf("andrea","rossi");
		
		Persona mario = new StudenteInf("mario","rossi");
		Persona gino = new StudentePSI("gino","topo");
		
		System.out.println("la persona creata é " + andrea);
		System.out.println("l'altra persona creata é " + mario);	
		System.out.println("l'altra persona creata é " + gino);
		
	}

}
