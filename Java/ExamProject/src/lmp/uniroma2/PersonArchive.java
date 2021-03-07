package lmp.uniroma2;


public class PersonArchive {
	
	private String Nome;
	
	private  String Cognome;
	
	private int Year;
	
	private int Month;
	
	private int Day;
	
	private String Fiscal_Code;
	
	
	public PersonArchive(String nomeIniziale,String cognomeIniziale,String fiscaleIniziale,int Day, int Month, int Year){
		setNome(nomeIniziale);
		
		setCognome(cognomeIniziale);
		
		setFiscalCode(fiscaleIniziale);
		
		setDay(Day);
		
		setMonth(Month);

		setYear(Year);
		
	}
	
	//Sarà presente nessun nome all'interno di nome
	public void setNome(String nuovoNome){
		Nome=nuovoNome;
		
	}
	
	public String getNome(){
		return Nome;
		
	}
	
	public void setCognome(String nuovoCognome){
		Cognome=nuovoCognome;
	}
	
	public String getCognome(){
		return Cognome;
	}
	
	public void setFiscalCode(String newFiscal_Code){
		Fiscal_Code=newFiscal_Code;
		
	}
	
	public String getFiscalCode(){
		return Fiscal_Code;
		
	}
	
	
	public void setYear(int newYear){
		Year=newYear;
		
	}
	
	public int getYear(){
		return Year;
	}
	
	
	public void setMonth(int newMonth){
		Month=newMonth;
		
	}
	
	public int getMonth(){
		return Month;
	}
	
	public void setDay(int newDay){
		Day=newDay;
		
	}
	
	public int getDay(){
		return Day;
	}
	
	public void ScriviOutput(){
		System.out.println(getNome());
		
		System.out.println(getCognome());

		
		System.out.println(getFiscalCode());
		
		
	}
	
	
		
	
}
