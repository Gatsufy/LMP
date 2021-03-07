package marco.melchiorri;

public class Prodotto {
	
	private double prezzo;
	
	private String nome;
	
	private String categoria;
	
	private String destinatario;

	public Prodotto(double prezzo, String nome, String categoria, String destinatario) {
		super();
		this.prezzo = prezzo;
		this.nome = nome;
		this.categoria = categoria;
		this.destinatario = destinatario;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getDestinatario() {
		return destinatario;
	}
	
	
	
	

}
