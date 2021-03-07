package marco.melchiorri;

import java.util.ArrayList;

public class RegistroEsami {
	
	private ArrayList<Esame> listaEsami=new ArrayList<>();

	public RegistroEsami(ArrayList<Esame> listaEsami) {
		super();
		this.listaEsami = listaEsami;
	}

	public ArrayList<Esame> getListaEsami() {
		return listaEsami;
	}
	
	public double mediaAritmetica(){
		int numeroEsami=0;
		int votoTotale=0;
		for(Esame e: listaEsami){
			votoTotale=votoTotale+e.getVoto();
			numeroEsami++;
		}
		return votoTotale/numeroEsami;
	}
	
	public int numeroEsamiPassati(){
		int numeroEsami=0;
		for(Esame e: listaEsami){
			if(e.getVoto()>=18){
				numeroEsami++;
			}
		}
		return numeroEsami;
	}

}
