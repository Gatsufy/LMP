package it.uniroma2;

import java.util.Scanner;

public class Calculator {
	//Metodo per la somma
	public static int somma(int x,int y){
		int somma=x+y;
		return somma;
	}
	//Metodo per la sottrazione
	public static int sottrazione(int x,int y){
		int sottrazione=x-y;
		return sottrazione;
	}
	
	//Metodo per la moltiplicazione
	public static int moltiplicazione(int x,int y){
		int moltiplicazione=x*y;
		return moltiplicazione;
	}
	
	//Metodo per la divisione
	public static int divisione(int x,int y){
		int divisione=x/y;
		return divisione;
	}

	public static void main(String[] args) {
		
		Scanner tastiera=new Scanner(System.in);
				
		System.out.println("Dammi 2 numeri");
		System.out.println("il primo numero è ");
		int first=tastiera.nextInt();
		System.out.println("Il secondo numero è ");
		int second=tastiera.nextInt();
		
		System.out.println("Dammi un operatore tra quelli seguenti");
		System.out.println("1: Somma");
		System.out.println("2: Sottrazione ");
		System.out.println("3: Moltiplicazione ");
		System.out.println("4: Divisione");
		
		int comando=tastiera.nextInt();
		int result=0;
		if(comando==1){
			 result=somma(first,second);

		}
		if(comando==2){
			result=sottrazione(first,second);
		}
		if(comando==3){
			result=moltiplicazione(first,second);
		}
		if(comando==4){
			result=divisione(first,second);
		}
		System.out.println("il risultato è: "+ result);


	}

}
