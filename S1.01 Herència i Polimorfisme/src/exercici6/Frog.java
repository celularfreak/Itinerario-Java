package exercici6;

public class Frog extends Amphibian{
	
	public static final String habitat ="Agua";
	boolean pielLisa;
	String color;
	

	public Frog(boolean cola, boolean pielLisa, String color) {
		super(cola);
		this.pielLisa = pielLisa;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("He creado la clase Amphibian y la clase Frog que hereda de ella.\nAmphibian tiene como atributos Vertebrado, Oviparo, Pelo, Numero de patas y si tiene Cola.\nEn Frog Piel lisa y color.");
		
		Frog rana = new Frog(false,true,"Verde");
		
		System.out.println("\nHe creado un objeto rana y con to String muestro todos los atributos, los propios de Frog y los heredados de Amphibian.\n");
		System.out.println(rana);
		
	}
	public String toString() {
		return "Clase Frog \nTiene la piel lisa =" + pielLisa + ", \nDe que color es =" + color + ", \nTiene cola = " + cola + "\nEs vertebrado = " +isVertebrado()+"\nEs oviparo = "+isOviparo()+"\nTiene pelo = "+isPelo()+"\nCuanta patas tiene = "+getNumpatas();
	}
}
