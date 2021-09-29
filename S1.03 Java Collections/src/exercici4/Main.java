package exercici4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

		static ArrayList<Month> año = new ArrayList <Month>();
		

		public static void main(String[] args) {
			
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
			
			
			/*Iterator<Month> iter = año.iterator();
			while (iter.hasNext())
			  System.out.println(iter.next());
			*/
			pruebaLinkedList();
				
		}
		static void pruebaLinkedList() {
			
			LinkedList<Month> año2 = new LinkedList <Month>();
			año2.addAll(año);
		
			Iterator<Month> iter = año2.iterator();
			while (iter.hasNext())
			  System.out.println(iter.next());
		}
	 
}