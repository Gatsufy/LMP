package marco.melchiorri;

import java.util.ArrayList;

public class PietanzeCalde extends Pietanza {
	
	private double costoCottura;

	public PietanzeCalde(String nome, double prezzo, ArrayList<Ingrediente> listaIngredienti, double costoCottura) {
		super(nome, prezzo, listaIngredienti);
		this.costoCottura = costoCottura;
	}

	public double getCostoCottura() {
		return costoCottura;
	}
	
	

}
