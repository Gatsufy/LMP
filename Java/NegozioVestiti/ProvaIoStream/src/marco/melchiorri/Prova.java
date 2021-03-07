package marco.melchiorri;

import java.io.FileWriter;
import java.io.IOException;


public class Prova {

	public static void main(String[] args) {
		
		String nomeFile="out.txt";
		
		FileWriter scritturaFile=null;
		
		try {
			scritturaFile=new FileWriter(nomeFile);
			scritturaFile.write("hello");
			scritturaFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
