package eserciziario;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PersonArchive {
	
	private Map<String,Persona> map=new HashMap<String,Persona>();

	public PersonArchive(Map<String, Persona> map) {
		super();
		this.map = map;
	}

	public Map<String, Persona> getMap() {
		return map;
	}

	public void setMap(Map<String, Persona> map) {
		this.map = map;
	}
		
	public void CreaImpiegato(String nome,String cognome,Date date, String codiceFiscale,String matricola, String mansione, int livello){
		
		map.put(codiceFiscale, new Impiegato(nome,cognome,date,codiceFiscale,matricola,mansione,livello));
		
	}

}
