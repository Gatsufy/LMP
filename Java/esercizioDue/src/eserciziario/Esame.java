package eserciziario;

import java.util.Date;

public class Esame {
	
	private String nomeCorso;
	
	private Date dataSuperamento;
	
	private int voto;
	
	private boolean lode;

	public Esame(String nomeCorso, Date dataSuperamento, int voto, boolean lode) {
		super();
		this.nomeCorso = nomeCorso;
		this.dataSuperamento = dataSuperamento;
		this.voto = voto;
		this.lode = lode;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public Date getDataSuperamento() {
		return dataSuperamento;
	}

	public int getVoto() {
		return voto;
	}

	public boolean isLode() {
		return lode;
	}
	
	
	
	

}
