package exercici2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProvaTreeSet {

	public static void main(String[] args) {
		
		ArrayList<Month> año = new ArrayList <Month>();
		
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
		
		//TreeSet<Month> año2 = new TreeSet<Month>();
		
		//TreeSet<Month> año2 = new TreeSet<Month>(año);
		//año2.addAll(año);
		
		LinkedHashSet<Month> año2 = new LinkedHashSet<Month>();
		año2.addAll(año);
		
		for(Month m : año2)
		{
			System.out.println(m);
		}
		año2.add(new Month("Agosto"));
		System.out.println("\n\n");
		for(Month m : año2)
		{
			System.out.println(m);
		}
		
		
	}

}
