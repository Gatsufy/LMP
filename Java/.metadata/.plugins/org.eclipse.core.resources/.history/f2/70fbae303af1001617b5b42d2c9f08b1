package eserciziario;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Person> map=new HashMap<String,Person>();
		
		PersonArchive pa=new PersonArchive();
		
		Calendar c1=Calendar.getInstance();
		
		Calendar c2=Calendar.getInstance();
		
		c1.set(1990, 6,25 );
		
		Impiegato imp1= (Impiegato) pa.factoryImpegato("Marco", "Melchiorri", c1.getTime(), "MLCMRC90L25H501M", "0219773", "Tecnico informatico", 4);
		
		map.put(imp1.getCodiceFiscale(), imp1);
		
		System.out.println(map.size());
		
		
		
		

	}

}
