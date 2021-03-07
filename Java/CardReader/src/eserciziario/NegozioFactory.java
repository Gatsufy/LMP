package eserciziario;

public class NegozioFactory {
	
	public Negozio creaNegozio(String sede,String annoInizio, String partitaIva,String merceVenduta){
		
		return new Negozio(sede,Integer.parseInt(annoInizio),partitaIva,merceVenduta);
		
	}

}
