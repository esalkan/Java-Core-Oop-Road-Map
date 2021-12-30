package core.reviews.week_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
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
