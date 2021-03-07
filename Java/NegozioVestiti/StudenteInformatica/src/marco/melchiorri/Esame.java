package marco.melchiorri;

import java.util.Date;

public class Esame {
	
	private String nome;
	
	private Date superamentoEsame;
	
	private int voto;
	
	private boolean lode;

	public Esame(String nome, Date superamentoEsame, int voto, boolean lode) {
		super();
		this.nome = nome;
		this.superamentoEsame = superamentoEsame;
		this.voto = voto;
		this.lode = lode;
	}

	public String getNome() {
		return nome;
	}

	public Date getSuperamentoEsame() {
		return superamentoEsame;
	}

	public int getVoto() {
		return voto;
	}

	public boolean isLode() {
		return lode;
	}
	
	@Override
	public String toString(){
		return this.nome;
	}

}
