package marco.melchiorri;

import java.util.ArrayList;

import java.util.Calendar;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Studente> lista1=null;
		
		Classe c1= new Classe("VC", 1991, lista1);
		
		Calendar ca1=Calendar.getInstance();
		
		ca1.set(Calendar.DATE, 25);
		ca1.set(Calendar.MONTH, 6);
		ca1.set(Calendar.YEAR, 1991);
		
		Studente s1=new Studente(ca1.getTime(),"Roma","Marco","Melchiorri");
		
		c1.inserisciStudente(s1);
		
		ca1.set(Calendar.DATE, 14);
		ca1.set(Calendar.MONTH, 6);
		ca1.set(Calendar.YEAR, 1991);
		
		Studente s2= new Studente(ca1.getTime(),"Roma", "Seia", "Bucci");
		
		
		//System.out.println(s1.getAnnoNascita());
		//System.out.println(s2.getAnnoNascita());
		
		c1.inserisciStudente(s2);
		
		System.out.println(c1.studenteBocciato());
		
		
		
		

	}

}
