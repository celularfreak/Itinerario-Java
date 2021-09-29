package exercici2;

import java.util.TreeSet;

public class ProvaTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Month> año = new TreeSet<Month>();
	
		año.add(new Month("Enero"));
		año.add(new Month("Febrero"));
		año.add(new Month("Marzo"));
		año.add(new Month("Abril"));
		año.add(new Month("Mayo"));
		año.add(new Month("Junio"));
		año.add(new Month("Julio"));
		año.add(new Month("Agosto"));
		año.add(new Month("Septiembre"));
		año.add(new Month("Octubre"));
		año.add(new Month("Noviembre"));
		año.add(new Month("Diciembre"));
		

		for(Month m : año)
		{
			System.out.println(m);
		}
		System.out.println("\n\nAhora provamos que no se puede agregar un objeto duplicado");
		System.out.println("\n");
		año.add(new Month("Agosto"));
		for(Month m : año)
		{
			System.out.println(m);
		}
		
		
	}

}
