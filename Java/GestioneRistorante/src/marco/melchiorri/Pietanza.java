package marco.melchiorri;

import java.util.ArrayList;

public class Pietanza {
	
	private String nome;
	
	private double prezzo;
	
	private ArrayList<Ingrediente> listaIngredienti;

	public Pietanza(String nome, double prezzo, ArrayList<Ingrediente> listaIngredienti) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.listaIngredienti = listaIngredienti;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public ArrayList<Ingrediente> getListaIngredienti() {
		return listaIngredienti;
	}
	
	public double guadagnoPietanza(){
		double costoTotale=0;
		
		int index=0;
		for(Ingrediente i: listaIngredienti){
			//costoTotale=costoTotale+listaIngredienti.get(index).getPrezzo();
			costoTotale=costoTotale+i.getPrezzo();
			index++;
		}
		return prezzo-costoTotale;
	}
	

}
