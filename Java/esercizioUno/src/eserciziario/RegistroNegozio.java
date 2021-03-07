package eserciziario;

import java.util.ArrayList;
import java.util.Date;

public class RegistroNegozio {
	
	private ArrayList<Cliente> listaClienti;

	public RegistroNegozio(ArrayList<Cliente> listaClienti) {
		super();
		this.listaClienti = listaClienti;
	}

	public ArrayList<Cliente> getListaClienti() {
		return listaClienti;
	}
	
	@SuppressWarnings("deprecation")
	public int numeroAcquistiCliente(int mese, int anno){
		int numeroClienti=0;
		for(Cliente c: listaClienti){
			for(Acquisto a: c.getListaAcquisti()){
				if(a.getData().getMonth()==mese && a.getData().getYear()==anno){
					numeroClienti++;
				}
			}
		}
		return numeroClienti;
	}
	
	public ArrayList<Prodotto> prodottiCompratiInUnaCertaData(Date d){
		ArrayList<Prodotto> listaProdotti=new ArrayList<>();
		for(Cliente c:listaClienti){
			for(Acquisto a: c.getListaAcquisti()){
				if(a.getData()==d){
					for(Prodotto p: a.getListaProdotti()){
						listaProdotti.add(p);
					}
				}
			}
		}
		return listaProdotti;
	}
	

}
