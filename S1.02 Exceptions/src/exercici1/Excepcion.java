package exercici1;

public class Excepcion {

	public static void main(String[] args) {
		
		try
		{ 
			System.out.println("Estamos en try");
			throw new Exception("Provocamos la excepción");
		}
		catch (Exception e) {
			System.out.println("Estamos en catch: "+e.getMessage());
		}
		finally {
			System.out.println("Llegamos al finally");
		}
	}
}
