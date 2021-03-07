package it.uniroma2;

public class MethodClass {
	public static int confronto(int first , int second){
		int difference=0;
		if(first>second){
			difference=first-second;
		}else if(second>first){
			difference=second-first;
		}
		return difference;
}
}
