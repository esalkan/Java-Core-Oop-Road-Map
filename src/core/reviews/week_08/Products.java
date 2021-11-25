package core.reviews.week_08;

/**
 * @author esalkan
 *
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
