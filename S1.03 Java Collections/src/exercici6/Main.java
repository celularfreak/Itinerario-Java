package exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList <Integer>();
		
		lista.add(0,1);
		lista.add(1,2);
		int numero = 3;
		int posicion;
		
		do {
				posicion = lista.size()/2;
				lista.add(posicion, numero);
				numero++;
				System.out.println(lista);
		}while (lista.size()!=10);
	}
}
		
			
			
		
	
	

