package exercici1;

public class Excepcion {
	
	int numero;
	String texto;
	
	 public static void main(String[] args) {
		 Excepcion prueba;
		 try {
			 prueba = new Excepcion(3.5,"prueba");
		 }catch (IllegalArgumentException e) {
			 System.out.println("hey");
		 }
		 finally { System.out.println("paso por aqui");}
	 }
	 
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Excepcion(int numero, String texto) {
		super();
		this.numero = numero;
		this.texto = texto;
	}
	
}