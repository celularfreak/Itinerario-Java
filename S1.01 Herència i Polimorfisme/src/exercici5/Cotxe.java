package exercici5;


public class Cotxe extends Vehicle {

	int diametreRodes;
	
	public Cotxe(String marca, String model, String color, int potencia, int numPortes, int diametreRodes) {
		super(marca, model, color, potencia, numPortes);
		this.diametreRodes = diametreRodes;
	}
	
	public void dimensiones() {;}
	
	public static void main(String[] args) {
		
		Cotxe berlina = new Cotxe("Ford", "Focus", "Rojo",120,5,225);
		
berlina.dimensiones(5,5,5);
		
		
		System.out.println("\nMarca: "+ berlina.marca+"\n"+"Model: "+berlina.model+"\n"+"Color: "+ berlina.color+"\n"+"Potencia: "+berlina.potencia+"\n"+"Numero de portes: "+berlina.numPortes+"\nDiametre de Rodes: "+berlina.diametreRodes);
		
		
	
		
	}
}
