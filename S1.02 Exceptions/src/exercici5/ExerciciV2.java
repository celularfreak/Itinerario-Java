package exercici5;

import java.util.ArrayList;

public class ExerciciV2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> prova = new ArrayList<Integer>();
		
		int numero = 0;
		boolean condicio = false;
		prova.add(numero);
		
	while (condicio != true) {
		
		try {
			prova.get(10);
			condicio = true;
		}catch (IndexOutOfBoundsException e){
			System.out.println("El indice buscado es "+numero+" y no existe."); 
			System.out.println("Hemos capturado el error.");
			numero++;
			prova.add(numero);
			}		
	}
	System.out.println("El inice buscado es "+numero+", ya no hay error.");
	}
}
