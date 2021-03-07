package marco.melchiorri;

import java.util.ArrayList;

public class ClienteFactory {
	
	public static Cliente ClienteFactory(String nome,String indirizzo, ArrayList<Acquisto> listaAcquisti){
		try{
			if(listaAcquisti.size()==0){
				throw new Exception("Questo cliente non ha effettuato acquisti");
				
			}
		}
		catch(Exception e){
			System.out.println("Non è possibile avere cliente che non hanno effettuato acquisti");
			System.exit(0);
			
		}
		return new Cliente(nome,indirizzo,listaAcquisti );
	}

}
