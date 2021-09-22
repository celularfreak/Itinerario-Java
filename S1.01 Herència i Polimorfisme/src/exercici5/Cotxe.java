package exercici5;


public class Cotxe extends Vehicle {

	int diametreRodes;
	
	public Cotxe(String marca, String model, String color, int potencia, int numPortes, int diametreRodes) {
		super(marca, model, color, potencia, numPortes);
		this.diametreRodes = diametreRodes;
	}
	
	public static void main(String[] args) {
		System.out.println("He creado la clase Vehicle que contiene el metodo dimensiones sobrecargado 3 veces.");
		System.out.println("\nHa continuacion he creado la clase derivada Cotxe que contiene una nueva version del metodo dimensiones.");
		System.out.println("\nHe creado una instancia llamada berlina y definido sus valores.");
		
		Cotxe berlina = new Cotxe("Ford", "Focus", "Rojo",120,5,225);
		
		System.out.println("\nMarca: "+ berlina.marca+"\n"+"Model: "+berlina.model+"\n"+"Color: "+ berlina.color+"\n"+"Potencia: "+berlina.potencia+"\n"+"Numero de portes: "+berlina.numPortes+"\nDiametre de Rodes: "+berlina.diametreRodes);
		
		System.out.println("\nA continuacion ejecuto desde la clase Cotxe los tres metodos creados en Vehicle y a continuacion el cuarto metodo creado en Cotxe.");
		
		berlina.dimensiones(4);
		berlina.dimensiones(4,3);
		berlina.dimensiones(4,3,2);
		berlina.dimensiones();
		
	}
	public void dimensiones() {
		System.out.println("\nCuarta Sobrecarga creada dentro de Cotxe:");
		System.out.println("\nNo consten dades.");
		}
}
