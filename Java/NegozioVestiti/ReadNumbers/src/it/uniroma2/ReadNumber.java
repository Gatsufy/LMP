package it.uniroma2;

import java.util.Scanner;

public class ReadNumber {
	
	public static int media(int x,int y,int z){
		int media=(x+y+z)/3;
		return media;
	}

	public static void main(String[] args) {
		
		Scanner tastiera=new Scanner(System.in);
		System.out.println("Dammi 3 numeri");
		System.out.println("Il primo numero è ");
		int first=tastiera.nextInt();
		System.out.println("il secondo numero è ");
		int second=tastiera.nextInt();
		System.out.println("il terzo numero è ");
		int third=tastiera.nextInt();
		System.out.println("La media dei 3 numeri è: "+ media(first,second,third));

	}

}
