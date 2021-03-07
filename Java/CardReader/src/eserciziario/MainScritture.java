package eserciziario;

import java.io.FileWriter;
import java.io.IOException;

public class MainScritture {

	public static void main(String[] args) {
		
		String nomeFile="C:/Users/Marco/Desktop/pippo.txt";
		try {
			FileWriter fw = new FileWriter(nomeFile);
			
			fw.write("sayonara");
			fw.write("hello");
			fw.append("amico");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
