package exercici2;

public class Vehicle {

	public static void main(String[] args) {
		
		System.out.println("El main crea un objeto de la clase para poder llamar al metodo iniciar que es no-estatic.\n");
		
		Vehicle berlina = new Vehicle();
		
		System.out.println(berlina);
		berlina.iniciar();
		
		parar();

	}
	
	public static void parar() {
		System.out.println("\nA continuación se ejecuta el metodo parar.");
		System.out.println("\n\nParando...");
	}
	
	public void iniciar() {
	
		System.out.println("\nSe ejecuta el metodo iniciar.");
		System.out.println("\n\nIniciando...");
		
	}
	
}
