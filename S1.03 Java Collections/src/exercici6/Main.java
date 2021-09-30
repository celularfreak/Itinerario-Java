package exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		int[] numeros= {1,2,3,4,5,6,7,8,9};
		
		LinkedList<Integer> lista = new LinkedList <Integer>();
		
		ListIterator<Integer> it = lista.listIterator();
		
		while(it.hasNext()) {
			for (int x: numeros) {
				lista.add(x);
			}
			 //lista.add((Integer) añadir.previous());
			System.out.println(lista);
	}
		
	}
}
