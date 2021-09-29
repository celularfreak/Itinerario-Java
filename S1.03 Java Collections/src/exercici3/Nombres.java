package exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Nombres {

	static int contador;
	static String[] nombre = {"Luke", "Leia", "Anakin", "Padme", "Han"};
		
		
		public static void main(String[] args) {
			
				pruebaArray();
				pruebaArrayList();
				pruebaLinkedList();
				pruebaHashSet();
				pruebaLinkedHashSet();
				pruebaTreeSet();
		}	


public static String next() {
	//System.out.println(nombre[contador]);
	if (contador == nombre.length -1) {
		contador = 0;
	}else {
			contador++;
			}
	return nombre[contador];
}

static void pruebaArray() {
	System.out.println("\nPrueba de Array");
	String [] nombres = new String[6];
	for (int i = 0; i <= nombre.length; ++i) {
		nombres[i] = next();
	}
	for (int y = 0; y <= nombres.length-1; ++y) {
		System.out.println(nombres[y]);
	}
}

static void pruebaArrayList(){
	System.out.println("\nPrueba de ArrayList");
	ArrayList<String> nombres = new ArrayList <String>();
	for (int i = 0; i <= nombre.length; ++i) {
		nombres.add(next());
	}
	for (String n: nombres) {
		System.out.println(n);
	}
}
static void pruebaLinkedList() {
	System.out.println("\nPrueba de LinkedList");
	LinkedList<String> nombres = new LinkedList <String>();
	for (int i = 0; i <= nombre.length; ++i) {
		nombres.add(next());
	}
	for (String n: nombres) {
		System.out.println(n);
	}
}
static void pruebaHashSet() {
	System.out.println("\nPrueba de HashSet");
	HashSet<String> nombres = new HashSet <String>();
	for (int i = 0; i <= nombre.length; ++i) {
		nombres.add(next());
	}
	for (String n: nombres) {
		System.out.println(n);
	}
}
static void pruebaLinkedHashSet() {
	System.out.println("\nPrueba de LinkedHashSet");
	LinkedHashSet<String> nombres = new LinkedHashSet <String>();
	for (int i = 0; i <= nombre.length; ++i) {
		nombres.add(next());
	}
	for (String n: nombres) {
		System.out.println(n);
	}
}
static void pruebaTreeSet() {
	System.out.println("\nPrueba de TreeSet");
	TreeSet<String> nombres = new TreeSet <String>();
	for (int i = 0; i <= nombre.length; ++i) {
		nombres.add(next());
	}
	for (String n: nombres) {
		System.out.println(n);
	}
}

}