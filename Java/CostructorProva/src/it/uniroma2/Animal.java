package it.uniroma2;

public class Animal {
	
	private String nome;
	
	private int et‡;
	
	private double peso;
	
	public Animal(){
		nome="Nessun nome";
		
		et‡=0;
		
		peso=0.0;
		
	}
	
	
	public Animal(String nomeIniziale,int et‡Iniziale, double pesoIniziale){
		set(nomeIniziale,et‡Iniziale,pesoIniziale);
	}
	
	public Animal(String nomeIniziale){
		set(nomeIniziale,et‡,peso);
	}
	
	public Animal(int et‡Iniziale){
		set(nome,et‡Iniziale,peso);
	}
	
	public Animal(double pesoIniziale){
		set(nome,et‡,pesoIniziale);
	}
	
	private void set(String nuovoNome,int nuovaEt‡,double nuovoPeso){
		nome=nuovoNome;
		if((nuovaEt‡<0) || (nuovoPeso<0) ){
			System.out.println("Hai inserito valori non validi");
			System.exit(0);
		}else{
			et‡=nuovaEt‡;
			peso=nuovoPeso;
			
		}
	}
	
	public void ScriviOutput(){
		System.out.println("Nome: "+nome);
		
		System.out.println("Et‡: "+et‡);
		
		System.out.println("Peso: "+peso);
	}

}
