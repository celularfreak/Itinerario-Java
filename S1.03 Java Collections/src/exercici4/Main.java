package exercici4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

		static ArrayList<Month> año = new ArrayList <Month>();
		

		public static void main(String[] args) {
			
			iniciar();
			pruebaArrayList();
			pruebaLinkedList();
			pruebaHashSet();	
			pruebaLinkedHashSet();	
			pruebaTreeSet();
		}
		
		static void iniciar() {
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
		}
	
		static void pruebaArrayList() {
			System.out.println("\nPrueba de Arraylist: ");
		
			Iterator<Month> iter = año.iterator();
			while (iter.hasNext())
			  System.out.println(iter.next());
		}
		static void pruebaLinkedList() {
			System.out.println("\nPrueba de LinkedList: ");
			LinkedList<Month> año2 = new LinkedList <Month>();
			año2.addAll(año);
		
			Iterator<Month> iter2 = año2.iterator();
			while (iter2.hasNext())
			  System.out.println(iter2.next());
		}
		
	 static void pruebaHashSet() {
		 System.out.println("\nPrueba de HashSet: ");
		 HashSet<Month> año3 = new HashSet <Month>();
			año3.addAll(año);
		
			Iterator<Month> iter3 = año3.iterator();
			while (iter3.hasNext())
			  System.out.println(iter3.next()); 
	 }
	 static void pruebaLinkedHashSet() {
		 System.out.println("\nPrueba de LinkedHashSet: ");
		 LinkedHashSet<Month> año4 = new LinkedHashSet <Month>();
			año4.addAll(año);
		
			Iterator<Month> iter4 = año4.iterator();
			while (iter4.hasNext())
			  System.out.println(iter4.next());
	 }
	 static void pruebaTreeSet() {
		 System.out.println("\nPrueba de TreeSet: ");
		 TreeSet<Month> año5 = new TreeSet <Month>();
			año5.addAll(año);
		
			Iterator<Month> iter5 = año5.iterator();
			while (iter5.hasNext())
			  System.out.println(iter5.next());
	 }
}