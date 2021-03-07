package eserciziario;

public class Studente {
	
	private String nome;
	
	private String cognome;
	
	private String matricola;
	
	private ProvaScritta provaScritta;

	public Studente(String nome, String cognome, String matricola, ProvaScritta provaScritta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.provaScritta = provaScritta;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getMatricola() {
		return matricola;
	}

	public ProvaScritta getProvaScritta() {
		return provaScritta;
	}
	
	

}
