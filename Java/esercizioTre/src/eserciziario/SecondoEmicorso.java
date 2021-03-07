package eserciziario;

import java.util.ArrayList;

public class SecondoEmicorso {
	
	private ProvaScrittaModuloDue provaScritta;
	
	private ProvaOraleModuloDue provaOrale;
	
	private int coefficienteScritto;
	
	private  int coefficienteOrale;
	
	private Studente studente;
	
	private ArrayList<String> argomentiScritto;
	
	private ArrayList<String> argomentiOrale;

	public SecondoEmicorso(ProvaScrittaModuloDue provaScritta, ProvaOraleModuloDue provaOrale, int coefficienteScritto,
			int coefficienteOrale, Studente studente, ArrayList<String> argomentiScritto,
			ArrayList<String> argomentiOrale) {
		super();
		this.provaScritta = provaScritta;
		this.provaOrale = provaOrale;
		this.coefficienteScritto = coefficienteScritto;
		this.coefficienteOrale = coefficienteOrale;
		this.studente = studente;
		this.argomentiScritto = argomentiScritto;
		this.argomentiOrale = argomentiOrale;
	}

	public ProvaScrittaModuloDue getProvaScritta() {
		return provaScritta;
	}

	public ProvaOraleModuloDue getProvaOrale() {
		return provaOrale;
	}

	public int getCoefficienteScritto() {
		return coefficienteScritto;
	}

	public int getCoefficienteOrale() {
		return coefficienteOrale;
	}

	public Studente getStudente() {
		return studente;
	}

	public ArrayList<String> getArgomentiScritto() {
		return argomentiScritto;
	}

	public ArrayList<String> getArgomentiOrale() {
		return argomentiOrale;
	}
	
	public int mediaPesataSecondoEmicorso(){
		return (((provaScritta.getMediaScritta()*coefficienteScritto)+(provaOrale.getPunteggio()*coefficienteOrale))/(coefficienteScritto+coefficienteOrale));

	}

}
