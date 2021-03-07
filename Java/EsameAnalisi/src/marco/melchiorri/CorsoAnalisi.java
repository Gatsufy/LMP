package marco.melchiorri;

import java.util.ArrayList;

public class CorsoAnalisi {
	
	private String nome;
	
	private ArrayList<Studente> listaStudenti=new ArrayList<>();

	public CorsoAnalisi(String nome,ArrayList<Studente> listaStudenti) {
		super();
		this.nome=nome;
		this.listaStudenti = listaStudenti;
	}
	
	public String getNomeCorso(){
		return nome;
	}

	public ArrayList<Studente> getListaStudenti() {
		return listaStudenti;
	}
	
	public int numeroStudentiPromossi(){
		int numberPassed=0;
		
		for(Studente s: listaStudenti){
			if(s.getTestScritto()>=18){
				numberPassed++;
			}
		}
		return numberPassed;
	}
	
	public int percentualeStudentiBocciati(){
		int percentuale=0;
		
		for(Studente s: listaStudenti){
			if(s.getTestScritto()<18){
				percentuale++;
			}
		}
		System.out.println("La percentuale degli studenti bocciati è :");
		return percentuale;
	}

}
