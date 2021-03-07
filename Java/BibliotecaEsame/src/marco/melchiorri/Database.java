package marco.melchiorri;

import java.util.ArrayList;

public class Database {
	
	private ArrayList<Book> listaBook;
	
	private ArrayList<Dvd> listaDvd;

	public Database(ArrayList<Book> listaBook, ArrayList<Dvd> listaDvd) {
		super();
		this.listaBook = listaBook;
		this.listaDvd = listaDvd;
	}

	public ArrayList<Book> getListaPrestitiBook() {
		return listaBook;
	}

	public ArrayList<Dvd> getListaPrestitiDvd() {
		return listaDvd;
	}
	
	public ArrayList<Book> getListaBook() {
		return listaBook;
	}

	public ArrayList<Dvd> getListaDvd() {
		return listaDvd;
	}

	
	@SuppressWarnings("deprecation")
	public long periodoPiuLungoDvd(Dvd d){
		long maxPeriodo=0;
		for(Prestito p: d.getListaDvd()){
			if(maxPeriodo< p.getFinePrestito().getTime()-p.getInizioPrestito().getTime()){
				maxPeriodo=p.getFinePrestito().getTime()-p.getInizioPrestito().getTime();
			}
		}
		return (((maxPeriodo/1000)/60)/60)/24;
	}
	
	@SuppressWarnings("deprecation")
	public int periodoPiuLungoBook(Book b){
		long maxPeriodo=0;
		for(Prestito p: b.getSequenzaPrestiti()){
			if(maxPeriodo< p.getFinePrestito().getTime()-p.getInizioPrestito().getTime()){
				maxPeriodo=p.getFinePrestito().getTime()-p.getInizioPrestito().getTime();
			}
		}
		return (int) ((((maxPeriodo/1000)/60)/60)/24);
	}
	
	public void incongruenzeBook(Book b){
		for(int i=0;i<b.getSequenzaPrestiti().size();i++){
			for(int i1=1; i1<b.getSequenzaPrestiti().size();i1++){
				if(b.getSequenzaPrestiti().get(i1).getFinePrestito().before(b.getSequenzaPrestiti().get(i).getInizioPrestito())){
					System.out.println("Incogruenza");
				}
			}
		}
	}

}
