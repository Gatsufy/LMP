package eserciziario;

public class ProvaScritta {
	
	private int punteggioUno;
	
	private int punteggioDue;
	
	private int punteggioTre;

	public ProvaScritta(int punteggioUno, int punteggioDue, int punteggioTre) {
		super();
		this.punteggioUno = punteggioUno;
		this.punteggioDue = punteggioDue;
		this.punteggioTre = punteggioTre;
	}

	public int getPunteggioUno() {
		return punteggioUno;
	}

	public int getPunteggioDue() {
		return punteggioDue;
	}

	public int getPunteggioTre() {
		return punteggioTre;
	}
	
	public int punteggioFinale(){
		return punteggioUno+punteggioDue+punteggioTre;
	}

}
