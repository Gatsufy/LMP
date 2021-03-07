package marco.melchiorri;

import java.util.ArrayList;

public class Book {
	
	private String titolo;
	
	private int annoPubblicazione;
	
	private int numeroPagine;
	
	private ArrayList<Prestito> sequenzaPrestiti;

	public Book(String titolo, int annoPubblicazione, int numeroPagine, ArrayList<Prestito> sequenzaPrestiti) {
		super();
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
		this.sequenzaPrestiti = sequenzaPrestiti;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public ArrayList<Prestito> getSequenzaPrestiti() {
		return sequenzaPrestiti;
	}
	
	
	
	

}
