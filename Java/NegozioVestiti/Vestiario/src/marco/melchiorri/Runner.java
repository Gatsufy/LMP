package marco.melchiorri;

import java.util.ArrayList;
import java.util.Calendar;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Cliente> listaClienti=new ArrayList<>();
		
		ArrayList<Acquisto> listaAcquisti=new ArrayList<>();
		
		ArrayList<Prodotto>listaProdotti1= new ArrayList<>();
		
		ArrayList<Prodotto>listaProdotti2= new ArrayList<>();

		
		Prodotto p1=new Prodotto(19.99,"Sbirulino", "Maglietta", "Uomo");
		
		Prodotto p2=new Prodotto(24.99,"Babibo","Intimo", "Donna");
		
		Prodotto p3=new Prodotto(39.99,"Colbacco","Cappelli","Misto");
		
		Prodotto p4=new Prodotto(9.99,"Bubala","Calzini", "Uomo");
		
		
		listaProdotti1.add(p1);
		listaProdotti1.add(p2);
		listaProdotti2.add(p3);
		listaProdotti2.add(p4);
		
		
		
		
		Calendar c1=Calendar.getInstance();
		
		c1.set(Calendar.YEAR, 2017);
		c1.set(Calendar.MONTH, 6);
		c1.set(Calendar.DAY_OF_MONTH, 25);
		
		Acquisto a1=new Acquisto(c1.getTime(),listaProdotti1);
		
		c1.set(Calendar.YEAR, 2017);
		c1.set(Calendar.MONTH, 6);
		c1.set(Calendar.DAY_OF_MONTH, 25);
		
		Acquisto a2=new Acquisto(c1.getTime(),listaProdotti2);
		
		listaAcquisti.add(a1);
		listaAcquisti.add(a2);
		
		Cliente cl1=new Cliente("Marco","Via Bellegra 49", listaAcquisti);
		
		listaClienti.add(cl1);
		
		Registro r1=new Registro(listaClienti,listaProdotti1,listaAcquisti,"Da marco");
		
		//System.out.println(r1.numeroAcquistiCliente(c1.getTime().getMonth(), c1.getTime().getYear()));
		
		System.out.println(r1.numeroAcquistiCliente(6,2017));
		
	}

}
