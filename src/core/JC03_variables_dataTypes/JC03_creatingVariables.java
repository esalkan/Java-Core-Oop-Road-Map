package core.JC03_variables_dataTypes;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_creatingVariables {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating Variables and Assigning Values - Değişkenler Oluşturma ve Değer Atama
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

		String s1, s2; 	// Declared but not assigned
						// Oluşturuldu ama veri ataması yapılmadı.
		String s3 = "Yes", s4 = "No"; 	// Declared and assigned
										// Oluşturuldu ve veri ataması yapıldı

		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
	}
}
