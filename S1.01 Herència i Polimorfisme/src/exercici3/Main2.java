package exercici3;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("Ahora invocamos primero el metodo parar");
		Vehicle.parar();
		
		System.out.println("Creamos un objeto y: ");
		Vehicle v1 = new Vehicle();
		
		System.out.println("\nCreamos un segundo objeto");
		Vehicle v2 = new Vehicle();

		v1.iniciar();
		v1.parar();
	}

}
