package marco.melchiorri;

import java.util.ArrayList;
import java.util.Date;

public class Acquisto {
	
	private Date data;
	
	private ArrayList<Prodotto> listaProdottiAcquistati;

	public Acquisto(Date data, ArrayList<Prodotto> listaProdottiAcquistati) {
		super();
		this.data = data;
		this.listaProdottiAcquistati = listaProdottiAcquistati;
	}

	public Date getData() {
		return data;
	}

	public ArrayList<Prodotto> getListaProdottiAcquistati() {
		return listaProdottiAcquistati;
	}
}
