package exercici7;

public class Frog extends Amphibian{
	
	public static final String habitat ="Agua";
	boolean pielLisa;
	String color;
	private static final boolean vertebrado = false;
	private static final boolean oviparo = false;
	private static final boolean pelo = true;
	private static final int numPatas = 5;
	boolean cola;
	

	public Frog(boolean cola, boolean pielLisa, String color) {
		super(cola);
		this.pielLisa = pielLisa;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("He creado la clase Amphibian y la clase Frog que hereda de ella.\nAmphibian tiene como atributos Vertebrado, Oviparo, Pelo, Numero de patas y si tiene Cola.\nEn Frog tiene Piel lisa, color y he añadido las de Amphibian cambiando los valores.");
		
		Frog rana = new Frog(false,true,"Verde");
		
		System.out.println("\nHe creado un objeto rana y con to String muestro todos los atributos, los propios de Frog y los heredados de Amphibian cuyos valores se substituyen por los definidos en Frog.\n");
		System.out.println(rana);
		
	}
	public String toString() {
		return "Clase Frog \nTiene la piel lisa =" + pielLisa + ", \nDe que color es =" + color + ", \nTiene cola = " + cola + "\nEs vertebrado = " +isVertebrado()+"\nEs oviparo = "+isOviparo()+"\nTiene pelo = "+isPelo()+"\nCuantas patas tiene = "+getNumpatas();
	}

	public static boolean isVertebrado() {
		return vertebrado;
	}

	public static boolean isOviparo() {
		return oviparo;
	}

	public static boolean isPelo() {
		return pelo;
	}

	public static int getNumpatas() {
		return numPatas;
	}

}
