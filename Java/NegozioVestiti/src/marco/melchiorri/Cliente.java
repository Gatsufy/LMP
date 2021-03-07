package marco.melchiorri;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	
	private String indirizzo;
	
	private ArrayList<Acquisto> listaAcquisti;

	public Cliente(String nome, String indirizzo, ArrayList<Acquisto> listaAcquisti) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaAcquisti = listaAcquisti;
	}

	public String getNome() {
		return nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public ArrayList<Acquisto> getListaAcquisti() {
		return listaAcquisti;
	}
	
	
	
	
 
}
