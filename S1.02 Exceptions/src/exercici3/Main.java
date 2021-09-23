package exercici3;

public class Main {

	public static void main(String[] args) {
		//creamos el array
		int arrayProva[] = {1,2,3,4};
		
		try {
			//intentamos leer un elemento que no existe
			int x = arrayProva[5];
		}catch (ArrayIndexOutOfBoundsException e) {//Capturamos el error y mostramos un texto
			System.out.println("Capturamos la excepcion");
		}finally {//mostramos un texto para demostrar que el control de excepciones funciona
			System.out.println("Finalizamos");
		}

	}

}
