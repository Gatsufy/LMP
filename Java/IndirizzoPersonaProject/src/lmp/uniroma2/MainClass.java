package lmp.uniroma2;

public class MainClass {

	public static void main(String[] args) {
		
		IndirizzoPersona persona1=new IndirizzoPersona("Marco","Melchiorri");
		
		persona1.change_email("mm.melchiorri@gmail.com");
		
		persona1.change_phone("3494221932");
		
		persona1.scriviOutput();
		

	}

}
