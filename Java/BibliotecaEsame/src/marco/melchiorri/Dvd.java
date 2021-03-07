package marco.melchiorri;

import java.util.ArrayList;

public class Dvd {
	
	private String nome;
	
	private int annoPubblicazione;
	
	private int durataMin; //indica la durata in minuti del film
	
	private ArrayList<Prestito> listaDvd;

	public Dvd(String nome, int annoPubblicazione, int durataMin, ArrayList<Prestito> listaDvd) {
		super();
		this.nome = nome;
		this.annoPubblicazione = annoPubblicazione;
		this.durataMin = durataMin;
		this.listaDvd = listaDvd;
	}

	public String getNome() {
		return nome;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public int getDurataMin() {
		return durataMin;
	}

	public ArrayList<Prestito> getListaDvd() {
		return listaDvd;
	}
	
	
	

}
