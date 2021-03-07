package marco.melchiorri;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PersonArchive {
	
	private Map<String,Person> map;
	
	public PersonArchive(){
		map = new HashMap<String,Person>();
	}
	
	public void creaPersona(Object...o){
		if(o.length==7){
			map.put((String)o[3],new Impiegato((String)o[0],(String)o[1],(Date)o[2],(String)o[3],(String)o[4],(Integer)o[5],(String)o[6]));
		}
	}
	
	public Person getPerson(String codiceFiscale){
		return map.get(codiceFiscale);
	}

}
