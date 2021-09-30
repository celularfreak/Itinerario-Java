package exercici8;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashMap <String,Month> lista = new LinkedHashMap<String,Month>();
		lista.put("Uno", new Month("Enero"));
		lista.put("Dos",new Month("Febrero"));
		lista.put("Tres", new Month("Marzo"));
		lista.put("Cuatro",new Month("Abril"));
		lista.put("Cinco", new Month("Mayo"));
		lista.put("Seis",new Month("Junio"));
		lista.put("Siete", new Month("Julio"));
		lista.put("Ocho",new Month("Agosto"));
		lista.put("Nueve", new Month("Septiembre"));
		lista.put("Diez",new Month("Octubre"));
		lista.put("Once", new Month("Noviembre"));
		lista.put("Doce",new Month("Diciembre"));
		
		System.out.println(lista);
		
		TreeMap<String, Month> copia = new TreeMap<>(lista);
		lista.clear();
		lista.putAll(copia);
		
		System.out.println(lista);
	}

}
