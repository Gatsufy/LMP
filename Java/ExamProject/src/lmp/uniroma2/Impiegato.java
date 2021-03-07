package lmp.uniroma2;

public class Impiegato extends PersonArchive {
	
	private String Matricola;
	
	private String Mansione;
	
	private int Livello;
	
	public Impiegato(String nomeIniziale,String cognomeIniziale,String fiscalCode,int day,int month,int year, String MatricolaIniziale, String MansioneIniziale, int LivelloIniziale){
		super(nomeIniziale,cognomeIniziale,fiscalCode,day,month,year);
		Matricola=MatricolaIniziale;
		
		Mansione=MansioneIniziale;
		
		Livello=LivelloIniziale;
	}
	
	public void setMatricola(String nuovaMatricola){
		Matricola=nuovaMatricola;
	}
	
	public String getMatricola(){
		return Matricola;
	}
	
	public void setMansione(String nuovaMansione){
		Mansione=nuovaMansione;
	}
	
	public String getMansione(){
		return Mansione;
	}
	
	public void setLivello(int nuovoLivello){
		Livello=nuovoLivello;
	}
	
	public int getLivello(){
		return Livello;
	}
	

}
