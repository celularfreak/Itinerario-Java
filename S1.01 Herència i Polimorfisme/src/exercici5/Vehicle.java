package exercici5;

public class Vehicle {
			String marca;
			String model;
			String color;
			int potencia;
			int numPortes;

public Vehicle(String marca, String model, String color, int potencia, int numPortes) {
	
	this.marca = marca;
	this.model = model;
	this.color = color;
	this.potencia = potencia;
	this.numPortes = numPortes;
	}

public void dimensiones(int largo) {
	System.out.println("largo"+largo);
	}
public void dimensiones(int largo, int ancho) {
	System.out.println("largo"+largo+"ancho"+ancho);
	}
public void dimensiones(int largo, int ancho, int alto) {
	System.out.println("largo"+largo+"ancho"+ancho+alto+"alto");}
}

