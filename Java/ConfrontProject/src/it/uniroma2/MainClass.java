package it.uniroma2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int result;
		Scanner tastiera=new Scanner(System.in);
		System.out.println("Digita il primo numero");
		int first=tastiera.nextInt();
		System.out.println("Digita il secondo numero");
		int second=tastiera.nextInt();
		result=MethodClass.confronto(first,second);
		System.out.println("il risulato è:" +result);
	}

}
