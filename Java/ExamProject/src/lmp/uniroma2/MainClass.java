package lmp.uniroma2;

public class MainClass {

	public static void main(String[] args) {
		PersonArchive persona1= new PersonArchive("Marco","Melchiorri","MLCMRC90L25H501M",25,07,1990);
		
		Impiegato persona2=new Impiegato("Mirko","Melchiorri","MLCMRC90L25H501M",25,07,1990,"0219773","Cuoco",4);
		
		persona1.ScriviOutput();
		
		persona2.ScriviOutput();		
		
	}

}
