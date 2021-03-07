package marco.melchiorri;

import java.util.ArrayList;
import java.util.Date;

public class DateBase {
	
	private ArrayList<Cliente> listaClienti;

	public DateBase(ArrayList<Cliente> listaClienti) {
		super();
		this.listaClienti = listaClienti;
	}

	public ArrayList<Cliente> getListaClienti() {
		return listaClienti;
	}
	
	@SuppressWarnings("deprecation")
	public int numeroAcquistoClienti(int mese, int anno){
		int totale=0;
		for(Cliente c: listaClienti){
			for(Acquisto a: c.getListaAcquisti()){
				if(a.getDataAcquisto().getMonth()==mese && a.getDataAcquisto().getYear()==anno-1900){
					totale++;
				}
			}
		}
		return totale;
	}
	
	public ArrayList<Prodotto> prodottiVendutiData(Date d){
		ArrayList<Prodotto> listaProdotti=new ArrayList<>();
		for(Cliente c: listaClienti ){
			for(Acquisto a: c.getListaAcquisti()){
				if(a.getDataAcquisto()==d){
				for(Prodotto p: a.getListaProdotti()){
					listaProdotti.add(p);
				}
			}
		}
	}
		return listaProdotti;
}

}