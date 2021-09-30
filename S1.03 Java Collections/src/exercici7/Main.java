package exercici7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		pruebaHashMap();
		pruebaHashSet();
	
	
	}
	static void pruebaHashMap() {
		
	HashMap<Integer, String> lista = new HashMap<Integer,String>();
		
		lista.put(1, "Luke");
		lista.put(5, "Rey");
		lista.put(3, "Anakin");
		lista.put(4,"Han");
		lista.put(2, "Leia");
		
		System.out.println("\nEl HashMap creado: ");
		System.out.println(lista);
		
		LinkedHashMap<Integer, String> listaLinked = new LinkedHashMap<Integer, String>(lista);
		System.out.println("\nEl LinkedHashMap creado: ");
		System.out.println(listaLinked);
	
	}
	static void pruebaHashSet() {
		
		HashSet<String> lista2 = new HashSet<String>();
			
			lista2.add("Luke");
			lista2.add("Rey");
			lista2.add("Anakin");
			lista2.add("Han");
			lista2.add("Leia");
			
			System.out.println("\nEl HashSet creado: ");
			System.out.println(lista2);
			
			LinkedHashSet<String> listaLinked2 = new LinkedHashSet<String>(lista2);
			System.out.println("\nEl LinkedHashSet creado: ");
			System.out.println(listaLinked2);
		
	
	}
}
