package marco.melchiorri;

import java.util.Calendar;

public class Runner {

	public static void main(String[] args) {
		PersonArchive pa1=new PersonArchive();
		
		Calendar c1=Calendar.getInstance();
		
		c1.set(Calendar.YEAR, 1990);
		pa1.creaPersona("Marco","Melchiorri",c1.getTime(),"ABCDE","01234",2,"Impiegato");

		Person p = pa1.getPerson("ABCDE");
		System.out.println(p);
	}

}
