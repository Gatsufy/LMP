package eserciziario;

import java.util.ArrayList;

public class Dvd {
	
	private int nome;
	
	private int annoPubblicazione;
	
	private int durata;
	
	private ArrayList<Prestito> listaPrestiti;

	public Dvd(int nome, int annoPubblicazione) {
		super();
		this.nome = nome;
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNome() {
		return nome;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public int getDurata() {
		return durata;
	}

	public ArrayList<Prestito> getListaPrestiti() {
		return listaPrestiti;
	}
	
	

}
