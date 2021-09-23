package exercici3;

public class Vehicle {

	static {
		System.out.println("La clase cargada y este es un mensaje dentro de un bloque static que se ejecuta solo una vez.");
	}
	
	{
		System.out.println("La clase cargada y este es un mensaje dentre de un bloque no estatico que se ejecuta cada vez que creamos un objeto. ");
	}

	public Vehicle() {
		System.out.println("El constructor de Vehicle");
	}

	public void iniciar() {
		System.out.println("Metodo iniciar");
	}
	public static void parar() {
		System.out.println("Metodo parar");
	}

}