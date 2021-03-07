package it.uniroma2;

import java.util.Scanner;


public class GetValue{
	private int value;
	
	private String sollecito="Per favore inserisci un valore valido";
	
	Scanner tastiera= new Scanner(System.in);

	public int getValue(int minValue, int maxValue) {
		System.out.println(sollecito);
		value=tastiera.nextInt();
		while(value<minValue || value>maxValue){
			System.out.println(sollecito);
			value=tastiera.nextInt();
		}
		return value;
	}
	
	

}
