package it.uniroma2;

import java.util.*;

public class MainString {

	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		System.out.println("Dammi un valore");
		int value=tastiera.nextInt();
		System.out.println("Dammi un nome");
		String name=tastiera.next();
		PrintString.StampaStringa(name, value);
		
	}

}
