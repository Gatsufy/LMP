package marco.melchiorri;

import java.util.ArrayList;
import java.util.Date;

public class Registro {
	private String nomeNegozio;
	
	private ArrayList<Cliente> listaClienti;
	private ArrayList<Prodotto> listaProdottiAcquisiti;
	private ArrayList<Acquisto> listaAcquisti;

	public Registro(ArrayList<Cliente> listaClienti,ArrayList<Prodotto> listaProdotti,ArrayList<Acquisto> listaAcquisti, String nomeNegozio) {
		super();
		this.nomeNegozio=nomeNegozio;
		this.listaClienti = listaClienti;
		this.listaProdottiAcquisiti = listaProdotti;
		this.listaAcquisti = listaAcquisti;
	}



	public ArrayList<Prodotto> getListaProdotti() {
		return listaProdottiAcquisiti;
	}

	public ArrayList<Acquisto> getListaAcquisti() {
		return listaAcquisti;
	}



	public ArrayList<Cliente> getListaClienti() {
		return listaClienti;
	}
	
	
	
	public String getNomeNegozio() {
		return nomeNegozio;
	}

	public ArrayList<Prodotto> getListaProdottiAcquisiti() {
		return listaProdottiAcquisiti;
	}



	public void inserisciClienti(ArrayList<Cliente> listaClienti,Cliente c){
		if(listaClienti==null){
			listaClienti=new ArrayList<>();
			listaClienti.add(c);
		}
		listaClienti.add(c);
	}
	
	public void InserisciProdotto(Prodotto p){
		if(listaProdottiAcquisiti==null){
			listaProdottiAcquisiti=new ArrayList<>();
			listaProdottiAcquisiti.add(p);
		}
		listaProdottiAcquisiti.add(p);
	}
	
	
	@SuppressWarnings("deprecation")
	public int numeroAcquistiCliente(int mese, int anno){
		int indexA=0;
		int totaleAcquisti=0;
		for(Cliente c: listaClienti){
			for(Acquisto a: c.getListaAcquisti()){
				if(c.getListaAcquisti().get(indexA).getData().getMonth()==mese && c.getListaAcquisti().get(indexA).getData().getYear()+1900==anno){
					//System.out.println(mese);
					//System.out.println(c.getListaAcquisti().get(indexA).getData().getMonth());
					totaleAcquisti++;
					//System.out.println("ciao");
				}
				indexA++;
			}
		}
		return totaleAcquisti;
	}
	
	public ArrayList<Prodotto> numeroArticoliVendutPerData(Date d){
		int indexA=0;
		//int indexP=0;
		ArrayList<Prodotto> listaProdotti=new ArrayList<>();
		for(Acquisto a: listaAcquisti){
			if(listaAcquisti.get(indexA).getData()==d){
				for(Prodotto p: a.getListaProdottiAcquistati()){
					listaProdotti.add(p);
				}
			}
		}
		return listaProdotti;
	}
	
	public int numeroAcquistiNome(Prodotto p1){
		int value=0;
		for(Cliente c: listaClienti){
			for(Acquisto a: c.getListaAcquisti()){
				for(Prodotto p: a.getListaProdottiAcquistati()){
					if(p.getNome()==p1.getNome()){
						value++;
					}
				}
			}
		}
		return value;
	}
	
}
