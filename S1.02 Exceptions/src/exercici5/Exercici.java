package exercici5;

public class Exercici {

	public static void main(String[] args) {
		
	int primerNum = 20;
	int segonNum = 0;
	int resultado =0;
	
	boolean condicio = false;
	
	while (condicio != true) {
		
		try {
			resultado = primerNum / segonNum;
			
		}catch (Exception e){
			System.out.println("No se puede dividir entre 0 y se captura el error");
			condicio = true;
		}
		System.out.println(primerNum+" / "+segonNum+" = "+resultado);
	}
	
	}
}
