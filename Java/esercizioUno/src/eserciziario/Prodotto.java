package eserciziario;

public class Prodotto {
	
	private double prezzo;
	
	private String nome;
	
	private String categoriaVestiario;
	
	private int destinatario;

	public Prodotto(double prezzo, String nome, String categoriaVestiario, int destinatario) {
		super();
		this.prezzo = prezzo;
		this.nome = nome;
		this.categoriaVestiario = categoriaVestiario;
		this.destinatario = destinatario;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoriaVestiario() {
		return categoriaVestiario;
	}

	public int getDestinatario() {
		return destinatario;
	}
	
	

}
