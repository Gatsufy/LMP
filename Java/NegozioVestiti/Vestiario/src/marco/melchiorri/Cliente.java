package marco.melchiorri;

import java.util.ArrayList;

public class Cliente{
	
	private String nome;
	
	private String indirizzoPersona;
	
	private ArrayList<Acquisto> listaAcquisti;

	public Cliente(String nome, String indirizzoPersona, ArrayList<Acquisto> listaAcquisti) {
		super();
		this.nome = nome;
		this.indirizzoPersona = indirizzoPersona;
		this.listaAcquisti = listaAcquisti;
	}

	public String getNome() {
		return nome;
	}

	public String getIndirizzoPersona() {
		return indirizzoPersona;
	}

	public ArrayList<Acquisto> getListaAcquisti() {
		return listaAcquisti;
	}
}
