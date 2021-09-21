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
public int dimensiones(int largo, int ancho) {
	return ancho;}
public int dimensiones(int largo, int ancho, int alto) {
	return alto;}
}

