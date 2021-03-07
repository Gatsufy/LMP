
public class Persona {
	private String Nome;
	
	public Persona(){
		Nome="Nessun nome";
	}
	
	public Persona(String nomeIniziale){
		Nome=nomeIniziale;
	}
	
	public void setNome(String nuovoNome){
		Nome=nuovoNome;
	}
	
	public String getNome(){
		return Nome;
	}
	
	public void ScriviOutput(){
		System.out.println("Il nome è: "+ Nome);
	}
}
