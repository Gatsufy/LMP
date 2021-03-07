package marco.melchiorri;

import java.util.ArrayList;
import java.util.Date;

public class Negozio {
	
	private String nome;
	
	private ArrayList<Cliente> listaClienti;

	public Negozio(String nome, ArrayList<Cliente> listaClienti) {
		super();
		this.nome = nome;
		this.listaClienti = listaClienti;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Cliente> getListaClienti() {
		return listaClienti;
	}
	
	@SuppressWarnings("deprecation")
	public int numeroAcquistiCliente(ArrayList<Prodotto> listaProdotti, int mese, int anno){
		int acquistoClienti=0;
		int c1=0; //contatore clienti
		int a1=0; //contatore acquisto
		for(Cliente c: listaClienti){
			for(Prodotto p: listaProdotti){
				if(listaClienti.get(c1).getListaAcquisti().get(a1).getListaProdotti().contains(p)
						&& (listaClienti.get(c1).getListaAcquisti().get(a1).getDataAcquisto().getMonth()==mese && 
					listaClienti.get(c1).getListaAcquisti().get(a1).getDataAcquisto().getYear()==anno  )){
				acquistoClienti++;
				}	
			}
			c1++;
		}
		return acquistoClienti;
	}
	
	@SuppressWarnings("deprecation")
	public ArrayList<Prodotto> creaListaProdotti(int mese,int anno, ArrayList<Acquisto> listaAcquisti){
		ArrayList<Prodotto> listaProdotti=null;
		int a1=0;
		int p1=0;
		for(Acquisto a: listaAcquisti){
			if(listaAcquisti.get(a1).getDataAcquisto().getMonth()== mese && listaAcquisti.get(a1).getDataAcquisto().getYear()==anno){
				if(listaProdotti==null){
					listaProdotti=new ArrayList<Prodotto>();
					listaProdotti.add(listaAcquisti.get(a1).getListaProdotti().get(p1));
				}
				listaProdotti.add(listaAcquisti.get(a1).getListaProdotti().get(p1));
			}
			p1++;
		}
		return listaProdotti;
	}
	
	public int acquistoProdotto(Prodotto p,ArrayList<Acquisto> listaAcquisti){
		int a1=0;
		int p1=0;
		int totale=0; //indica totale acquisti fatti;
		for(Acquisto a: listaAcquisti){
			if(listaAcquisti.get(a1).getListaProdotti().get(p1).getNome()==p.getNome()){
				totale++;	
			}
			p1++;
		}
		return totale;
	}

		
	}
	


