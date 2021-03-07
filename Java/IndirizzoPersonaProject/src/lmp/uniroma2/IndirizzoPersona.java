package lmp.uniroma2;

public class IndirizzoPersona {
	
	private  String name;
	
	private  String surname;
	
	private String emailAdress;
	
	private String phoneNumber;
	
	
	
	public IndirizzoPersona(String nomeIniziale,String cognomeIniziale){
		
		name=nomeIniziale;
		
		surname=cognomeIniziale;
		
	}

	public void change_email(String newEmail){
		
		emailAdress=newEmail;
		
	}
	
	public String get_email(){
		
		return emailAdress;
		
	}
	
	public void change_phone(String newNumber){
		
		phoneNumber=newNumber;
		
	}
	
	public String get_number(){
		
		return phoneNumber;		
		
	}
	
	public String getName(){
		
		return name;
				
	}
	
	public String getSurname(){
		
		return surname;
		
	}
	
	public void scriviOutput(){
		System.out.println(name);
		
		System.out.println(surname);
		
		System.out.println(emailAdress);
		
		System.out.println(phoneNumber);
	}
	
	
}
