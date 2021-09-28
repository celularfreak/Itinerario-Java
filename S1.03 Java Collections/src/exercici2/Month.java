package exercici2;

import java.util.ArrayList;
import java.util.TreeSet;

public class Month {
	
	String name;
	
public Month(String name) {
		this.name = name;
	}

public static void main(String[] args) {
	
	TreeSet <Month> año = new TreeSet<>();
	
	
	
	año.add(new Month("Enero"));
	año.add(new Month("Febrero"));
	año.add(new Month("Marzo"));
	año.add(new Month("Abril"));
	año.add(new Month("Mayo"));
	año.add(new Month("Junio"));
	año.add(new Month("Julio"));
	año.add(new Month("Septiembre"));
	año.add(new Month("Octubre"));
	año.add(new Month("Noviembre"));
	año.add(new Month("Diciembre"));
	
	System.out.println("\nComprobamos la lista de meses que hemos creado\n");
	for (Month month: año) {
		System.out.println("Nom del mes: "+month.name);
	}
	System.out.println("\nComprobamos la lista de meses que hemos creado\n");
	//año.add(7, new Month("Agosto"));
	for (Month month: año) {
		System.out.println("Nom del mes: "+month.name);
	}
}
}