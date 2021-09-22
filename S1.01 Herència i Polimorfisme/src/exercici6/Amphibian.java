package exercici6;

public class Amphibian {
		
		private static final boolean vertebrado = true;
		private static final boolean oviparo = true;
		private static final boolean pelo = false;
		private static final int numPatas = 4;
		boolean cola;
		
		public static int getNumpatas() {
			return numPatas;
		}

		public static boolean isPelo() {
			return pelo;
		}

		public static boolean isOviparo() {
			return oviparo;
		}

		public static boolean isVertebrado() {
			return vertebrado;
		}

		public Amphibian(boolean cola) {
			super();
			this.cola = cola;
		}
		
	

	
	
	

}
