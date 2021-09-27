package exercici4;

public class Exception extends prova {

	String paraula;

	public Exception(String paraula) {
		this.paraula = paraula;
	}
	public void mostrar(){
		System.out.println(paraula);
}
	public static void main(String[] args) {
		
		Exception ex1 = null;
		
		try {
			ex1.mostrar();
			System.out.println("Invocamos metodo");//invocamos metodo con la referencia que hemos creado
		} catch (NullPointerException e) {
			System.out.println("Excepción capturada"); // capturamos la excepcion
		}
	}
}