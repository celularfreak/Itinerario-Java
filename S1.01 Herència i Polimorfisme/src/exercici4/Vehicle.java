package exercici4;

public class Vehicle {

	private static final String marca = "Ford";
	final String model;
	String color;
	int potencia;
	int numPortes;
	

	public Vehicle(String model, String color, int potencia, int numPortes) {
		
		this.model = model;
		this.color = color;
		this.potencia = potencia;
		this.numPortes = numPortes;
	}


@SuppressWarnings("static-access")
public static void main (String[] args) {
	System.out.println("Hemos definido la marca del vehicle como Static final Ford y al crear el constructor no podremos cambiar el valor.");
	System.out.println("\nEl modelo ha sido definido como final, por lo que al crear el objeto podemos introducir el valor pero despues no podra ser modificado.");
	System.out.println("\nCreamos una berlina modelo Focus y un suv modelo Kuga.");
	
	Vehicle berlina = new Vehicle("Focus", "Rojo", 120, 5);
	Vehicle suv= new Vehicle("Kuga", "Gris", 140, 3);
	
	System.out.println("\nMarca: "+ Vehicle.marca+"\n"+"Model: "+berlina.model+"\n"+"Color: "+ berlina.color+"\n"+"Potencia: "+berlina.potencia+"\n"+"Numero de portes: "+berlina.numPortes);

	System.out.println("\nMarca: "+ suv.marca+"\n"+"Model: "+suv.model+"\n"+"Color: "+ suv.color+"\n"+"Potencia: "+suv.potencia+"\n"+"Numero de portes: "+suv.numPortes);
	
	berlina.color = "Amarillo";
	
	System.out.println("\nPodemos modificar valores, como por ejemplo el color");
	
	System.out.println("\nMarca: "+ berlina.marca+"\n"+"Model: "+berlina.model+"\n"+"Color: "+ berlina.color+"\n"+"Potencia: "+berlina.potencia+"\n"+"Numero de portes: "+berlina.numPortes);
	
	suv.numPortes=5;
	
	System.out.println("\nO el numero de puertas, pero Marca y Modelo no podran ser modificados.");
	
	System.out.println("\nMarca: "+ suv.marca+"\n"+"Model: "+suv.model+"\n"+"Color: "+ suv.color+"\n"+"Potencia: "+suv.potencia+"\n"+"Numero de portes: "+suv.numPortes);
}
	
	
	
}
