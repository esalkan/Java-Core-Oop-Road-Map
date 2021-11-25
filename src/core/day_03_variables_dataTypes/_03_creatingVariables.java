package core.day_03_variables_dataTypes;

/**
 * @author esalkan
 *
 */
public class _03_creatingVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int price = 5;
		int quantity = 4;

		System.out.println("price = " + price);
		System.out.println("quantity = " + quantity);

		System.out.println("\n+----------------------------+\n");

		int price2, quantity2;
		price2 = 500;
		quantity2 = 400;

		System.out.println("price2 = " + price2);
		System.out.println("quantity2 = " + quantity2);

		System.out.println("\n+----------------------------+\n");

		int price3 = 50, quantity3 = 40;
		System.out.println("price3 = " + price3);
		System.out.println("quantity3 = " + quantity3);

		System.out.println("\n+----------------------------+\n");

		@SuppressWarnings("unused")
		String s1, s2; // Declared but not assigned
		String s3 = "Yes", s4 = "No"; // Declared and assigned

		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
	}

}
