package marco.melchiorri;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		Ingrediente i1=new Ingrediente("Mascarpone", 1.00);
		
		Ingrediente i2=new Ingrediente("Savoiardi", 0.99);
		
		Ingrediente i3=new Ingrediente("Uova", 1.50);
		
		ArrayList<Ingrediente> listaIngredienti=new ArrayList<>();
		
		listaIngredienti.add(i1);
		listaIngredienti.add(i2);
		listaIngredienti.add(i3);
		
		Pietanza p1=new Pietanza("Tiramisù", 4.99,listaIngredienti);
		
		System.out.println(p1.guadagnoPietanza());

}
	
}
