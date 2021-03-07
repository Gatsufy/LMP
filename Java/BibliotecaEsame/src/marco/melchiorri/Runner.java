package marco.melchiorri;

import java.util.ArrayList;
import java.util.Calendar;

public class Runner {

	public static void main(String[] args) {
		
		Persona pe1= new Persona("Marco", "Melchiorri");
		
		Persona pe2= new Persona("Seia", "Bucci");
		
		//Map<String,Book> map= new HashMap<String,Book>();
		
		ArrayList<Prestito> listaPrestiti=new ArrayList<>();
		
		ArrayList<Book> listaLibri=new ArrayList<>();
		
		ArrayList<Dvd> listaDvd =new ArrayList<>();
		
		Calendar ca1=Calendar.getInstance();
		
		Calendar ca2=Calendar.getInstance();
				
		ca1.set(Calendar.YEAR, 2016);
		ca1.set(Calendar.MONTH, 6);
		ca1.set(Calendar.DAY_OF_MONTH, 12);
		
		ca2.set(Calendar.YEAR, 2016);
		ca2.set(Calendar.MONTH, 7);
		ca2.set(Calendar.DAY_OF_MONTH, 12);
		
		Prestito p1=new Prestito(ca1.getTime(),ca2.getTime(),pe1);
		
		
		listaPrestiti.add(p1);
		
		ca1.set(Calendar.YEAR, 2016);
		ca1.set(Calendar.MONTH, 5);
		ca1.set(Calendar.DATE,11);
		
		ca2.set(Calendar.YEAR, 2016);
		ca2.set(Calendar.MONTH, 6);
		ca2.set(Calendar.DATE, 15);
		
		Prestito p2=new Prestito(ca1.getTime(),ca2.getTime(),pe2);
		
		listaPrestiti.add(p2);
		
		Book b1=new Book("Il libro della giungla", 1980, 350, listaPrestiti);
		
		listaLibri.add(b1);
		
		Database da1=new Database(listaLibri, listaDvd);
		
		System.out.println(da1.periodoPiuLungoBook(b1));
		

	}

}
