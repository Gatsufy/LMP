package marco.melchiorri;

public class Studente {
	
	private String nome;
	
	private String cognome;
	
	private String matricola;
	
	private TestScritto scritto;

	public Studente(String nome, String cognome, String matricola,TestScritto testScritto) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.scritto=testScritto;
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

	public void setScritto(TestScritto scritto) {
		this.scritto = scritto;
	}
	
	public int getTestScritto(){
		return scritto.votoStudente();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString(){
		return nome+" "+cognome+ " "+ matricola;
	}
}
