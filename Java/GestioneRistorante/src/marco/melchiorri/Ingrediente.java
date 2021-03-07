package marco.melchiorri;

public class Ingrediente {
	
	private String nome;
	
	private double prezzo;

	public Ingrediente(String nome, double prezzo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}
	
	

}
