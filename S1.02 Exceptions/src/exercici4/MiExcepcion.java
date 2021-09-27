package exercici4;

public class MiExcepcion extends Exception {

	public MiExcepcion(String mensaje) {
		super(mensaje);
	}

	public static void main(String[] args) {
		
		try {
			throw new MiExcepcion("Mensaje de error");
			
		} catch (MiExcepcion e) {
			System.out.println("Estamos en catch: "+e.getMessage());
		}
	}
}