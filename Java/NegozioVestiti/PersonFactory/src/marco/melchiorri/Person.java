package marco.melchiorri;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String codiceFiscale;
	public Person(String nome, String cognome, Date dataNascita, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.codiceFiscale = codiceFiscale;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	@Override
	public String toString(){
		return getNome()+","+cognome+","+new SimpleDateFormat("yyyy-MM-dd").format(getDataNascita())+","+codiceFiscale;
	}
}
