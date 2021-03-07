package marco.melchiorri;

public class TestScritto {
	
	private int votoEsercizio1;
	
	private int votoEsercizio2;
	
	private int votoEsercizio3;

	public TestScritto(int votoEsercizio1, int votoEsercizio2, int votoEsercizio3) {
		super();
		this.votoEsercizio1 = votoEsercizio1;
		this.votoEsercizio2 = votoEsercizio2;
		this.votoEsercizio3 = votoEsercizio3;
	}

	public int getVotoEsercizio1() {
		return votoEsercizio1;
	}

	public int getVotoEsercizio2() {
		return votoEsercizio2;
	}

	public int getVotoEsercizio3() {
		return votoEsercizio3;
	}
	
	public int votoStudente(){
		int votoTotale=votoEsercizio1+votoEsercizio2+votoEsercizio3;
		System.out.println("Il voto dello studente è");
		return votoTotale;
	}

}
