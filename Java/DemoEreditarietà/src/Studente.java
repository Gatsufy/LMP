
public class Studente extends Persona {
	private int Matricola;
	
	public Studente(){
		super();
		Matricola=0;
	}
	
	public Studente(String nomeIniziale,int matricolaIniziale){
		super(nomeIniziale);
		Matricola=matricolaIniziale;
	}
	
	public void reimposta(String nuovoNome,int nuovaMatricola){
		setNome(nuovoNome);
		Matricola=nuovaMatricola;
		
	}
	
	public int getMatricola(){
		return Matricola;
	}
	
	public void setMatricola(int nuovaMatricola){
		Matricola=nuovaMatricola;
	}
	
	

}
