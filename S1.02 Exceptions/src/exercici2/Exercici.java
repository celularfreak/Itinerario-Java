package exercici2;

public class Exercici {
	
	private void prova() {
		System.out.println("Exejecutamos metodo prova");
	}
	
	public static void main(String[] args) {
		
		Exercici ex1= null;//creamos y inicializamos objeto ex1
		
		try {
			ex1.prova();
			System.out.println("Invocamos metodo");//invocamos metodo con la referencia que hemos creado
		} catch (NullPointerException e) {
			System.out.println("Excepción capturada"); // capturamos la excepcion
		}
	
	}
}
