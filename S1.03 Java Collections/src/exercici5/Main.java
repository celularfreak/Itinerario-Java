package exercici5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		int[] numeros= {1,2,3,4,5,6,7,8,9};
		
		List<Integer> lista = new ArrayList<Integer>();
		for (int i: numeros) {
			lista.add(i);
		}
		System.out.println("La lista original: "+lista);
		
		List<Integer> listainversa = new ArrayList<Integer>();
		ListIterator<Integer> inverso = lista.listIterator(lista.size());
		while(inverso.hasPrevious()) {
			 listainversa.add((Integer) inverso.previous());
			 
		}
		System.out.println("Nueva lista ordenada al reves: "+listainversa);
		
		
		
				

	}

}
