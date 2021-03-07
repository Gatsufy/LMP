package marco.melchiorri;

public class Prodotto {
	
	private double prezzo;
	
	private String nome;
	
	private String categoriaVestiario;
	
	private String destinatario;

	public Prodotto(double prezzo, String nome, String categoriaVestiario, String destinatario) {
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

	public String getDestinatario() {
		return destinatario;
	}
	
	

}
