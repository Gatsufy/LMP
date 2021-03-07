package it.uniroma2.lmp;

public class BambinoScuola {
	
	private String nomeBambino;
	
	private int et‡Bambino;
	
	private String nomeInsegnante;
	
	private String saluto;
	
	public BambinoScuola(){
		nomeBambino="Nessun nome";
		
		et‡Bambino=0;
		
		nomeInsegnante="Nessun nome";
		
		saluto="Nessun saluto";
	}
	
	public BambinoScuola(String nuovoNome,int nuovaEt‡,String nuovaInsegnante, String nuovoSaluto){
		nomeBambino=nuovoNome;
		
		et‡Bambino=nuovaEt‡;
		
		nomeInsegnante=nuovaInsegnante;
		
		saluto=nuovoSaluto;
	}
	
	public void setNomeBambino(String nuovoNome){
		nomeBambino=nuovoNome;
	}
	
	public String getNomeBambino(){
		return nomeBambino;
	}
	
	public void setEt‡Bambino(int nuovaEt‡){
		if(nuovaEt‡<=0){
			System.out.println("Inserito valore sbagliato");
			System.exit(0);
		}
		et‡Bambino=nuovaEt‡;
	}
	
	public int getEt‡(){
		return et‡Bambino;
	}
	
	public void setNomeInsegnante(String nuovaInsegnante){
		nomeInsegnante=nuovaInsegnante;
	}
	
	public String getNuovaInsegnante(){
		return nomeInsegnante;
	}
	
	public void scriviOutput(){
		System.out.println("Il nome del bimbo Ë: "+ nomeBambino);
		System.out.println("L'et‡ del bimbo Ë: "+ et‡Bambino );
		System.out.println("Maesta: "+ nomeInsegnante);
		
	}
	

}
