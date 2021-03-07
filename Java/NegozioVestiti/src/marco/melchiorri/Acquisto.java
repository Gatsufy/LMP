package marco.melchiorri;

import java.util.ArrayList;
import java.util.Date;

public class Acquisto {
	private Date dataAcquisto;
	
	private ArrayList<Prodotto> listaProdotti;

	public Acquisto(Date dataAcquisto, ArrayList<Prodotto> listaProdotti) {
		super();
		this.dataAcquisto = dataAcquisto;
		this.listaProdotti = listaProdotti;
	}

	public Date getDataAcquisto() {
		return dataAcquisto;
	}

	public ArrayList<Prodotto> getListaProdotti() {
		return listaProdotti;
	}
	
	
}
