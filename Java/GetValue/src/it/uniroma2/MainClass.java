package it.uniroma2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		GetValue prova=new GetValue();
		
		Scanner tastiera=new Scanner(System.in);
		
		System.out.println("Dammi il valore minore");
		int minV=tastiera.nextInt();
		
		System.out.println("Dammi il valore maggiore");
		int maxV=tastiera.nextInt();
		
		
		int value=prova.getValue(minV,maxV);
		
		System.out.println(value);

	}

}
