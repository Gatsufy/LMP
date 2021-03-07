package it.uniroma2.lmp.lmp1;

public class PersonaImpl implements Persona{
	
	protected String nome;
	protected String cognome;

	public PersonaImpl(String nome, String cognome){
		
		this.nome = nome;
		this.cognome = cognome;
		
	}

	public String getNome(){
		return nome;
	}

	public String getCognome(){
		return cognome;
	}
	
	public String toString(){// stampa senza usare get
		return nome + " " + cognome;
	}

}
