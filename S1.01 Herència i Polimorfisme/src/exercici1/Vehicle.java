package exercici1;

public class Vehicle {

				String marca;
				String model;
				String color;
				int potencia;
				int numPortes;
				
				public Vehicle(String marca, String model, String color, int potencia, int numPortes) {
					
					System.out.println("\n3: Mètode constructor.");
					
					this.marca = marca;
					this.model = model;
					this.color = color;
					this.potencia = potencia;
					this.numPortes = numPortes;
					}
				
				public  static void main(String[] args) {
					
					System.out.println("\n1: Mètode Main");
				
					iniciar();
		
					}
				
				public static  void iniciar() {
					
					System.out.println("\n2: Mètode Iniciar().");
					
					Vehicle berlina = new Vehicle("Ford", "Focus", "Rojo", 120, 5);
					
					System.out.println("\nEs mostren els atributs de l'objecte Berlina que hem creat");
					
					System.out.println("\nMarca: "+ berlina.marca+"\n"+"Model: "+berlina.model+"\n"+"Color: "+ berlina.color+"\n"+"Potencia: "+berlina.potencia+"\n"+"Numero de portes: "+berlina.numPortes);
		
	}		


					

				
}
