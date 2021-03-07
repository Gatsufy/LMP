package eserciziario;

import java.util.ArrayList;
import java.util.Date;

public class Acquisto {
	
	private Date data;
	
	private ArrayList<Prodotto> listaProdotti;

	public Acquisto(Date data, ArrayList<Prodotto> listaProdotti) {
		super();
		this.data = data;
		this.listaProdotti = listaProdotti;
	}

	public Date getData() {
		return data;
	}

	public ArrayList<Prodotto> getListaProdotti() {
		return listaProdotti;
	}
	
	
	
	

}
