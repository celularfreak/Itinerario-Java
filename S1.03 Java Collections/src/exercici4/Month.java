package exercici4;

public class Month implements Comparable{
	
	String name;
	
	public Month(String name) {
				this.name = name;
			}

	public String toString() {
		return "Mes: " + name;
	}
	public static void main(String[] args) {
		

	}

	public int compareTo(Object o) {//necesario para TreeSet

		int result = 0;
		Month other = null;

		if (o != null && o instanceof Month) {
			other = (Month) o;
		}

		result = this.name.compareTo(other.name);

		return result;
	}

}
