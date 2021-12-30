package core.reviews.week_07;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Products {

	/**
	 * @param args
	 */

	String name;
	double price;

	public void setInfo(String n, double d) {
		name = n;
		price = d;
	}

	public String toString() {
		return "Products [name=" + name + ", price=" + price + "]";
	}

}
