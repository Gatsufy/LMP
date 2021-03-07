package eserciziario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FactoryCardReader {

	public Attivita creaAttivita(String filePath){
		Map<String,String> map = new HashMap<String,String>();
		FileReader fileReader = null; //crea un oggetto in grado di leggere il contenuto di un file;
		try {
			fileReader = new FileReader(filePath); //file path indica il file che dev essere letto
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader); //un oggetto creato sul file reader in grado di leggere una riga intera
		String riga="";
		try {
			while((riga=bufferedReader.readLine())!=null){
				String[] elemRiga = riga.split(":");
				map.put(elemRiga[0], elemRiga[1]);
			}

			String fileType=map.get("filetype");
			switch(fileType){
			case "negozio":
				NegozioFactory negozioFactory = new NegozioFactory();
				return negozioFactory.creaNegozio(map.get("sede"), map.get("in_attività_dal"),map.get("partita_IVA"), map.get("merce_venduta"));
				//case "associazione": return new Associazione();break;
				//case "ristorante": return new Ristorante();break;
			default:
				return null;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
