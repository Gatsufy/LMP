package marco.melchiorri;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

   public class PersonArchive {
	
	private Map<String,Persona> map =new HashMap<String ,Persona>(); 
	
	public void CreaImpiegato(String nome, String cognome, Date data, String codiceFiscale, String matricola, int livello,  String mansione){
		map.put(codiceFiscale, new Impiegato(nome,cognome,data,codiceFiscale,matricola,livello,mansione));
	}
	
	public void getPersona(String codiceFiscale){
		map.get(codiceFiscale);
		}

}
