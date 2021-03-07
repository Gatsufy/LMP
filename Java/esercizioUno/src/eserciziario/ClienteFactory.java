package eserciziario;

import java.util.ArrayList;

public class ClienteFactory {
	
	public Cliente creaCliente(String nome, String indirizzo, ArrayList<Acquisto> listaAcquisti){
		
		try{
			if(listaAcquisti.size()==0){
				throw new Exception("Non sono presenti prodotti");
					
				}
		    }
		catch(Exception e){
			System.out.println("non è possibile avere un cliente senza acquisti");
		}
		return new Cliente(nome,indirizzo,listaAcquisti);
	}

}
