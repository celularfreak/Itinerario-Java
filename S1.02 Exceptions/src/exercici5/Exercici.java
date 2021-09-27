package exercici5;

public class Exercici {

	public static void main(String[] args) {
		
	int primerNum = 20;
	int segonNum = 0;
	int resultado =0;
	
	boolean continuar = true;
	
	while (continuar) {
		
		try {
			resultado = primerNum / segonNum;
			continuar = false;
		}catch (Exception e){
			System.out.println("No se puede dividir entre 0 y se captura el error");
		}finally {segonNum++;}
		
	}
	System.out.println("Estoy fuera");
	}
}
