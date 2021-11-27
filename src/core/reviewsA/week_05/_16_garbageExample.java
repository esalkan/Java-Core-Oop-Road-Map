package core.reviewsA.week_05;

/**
 * @author esalkan
 */
public class _16_garbageExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "JAVA";

		str = "python"; // "JAVA" object is unreferenced and eligible for garbage collection

		System.out.println(str);

		str = null; // "python" is unreferenced and eligible for garbage collection
		System.out.println(str);
	}

}
