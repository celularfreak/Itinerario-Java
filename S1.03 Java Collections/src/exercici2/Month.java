package exercici2;

public class Month implements Comparable {

	public Month(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		return "Mes: " + name;
	}

	public int compareTo(Object o) {

		int result = 0;
		Month other = null;

		if (o != null && o instanceof Month) {
			other = (Month) o;
		}

		result = this.name.compareTo(other.name);

		return result;
	}

}
