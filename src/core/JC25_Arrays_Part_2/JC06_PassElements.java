package core.JC25_Arrays_Part_2;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC06_PassElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] numbers = { 541, 0, 1, 2, 3, 4, 5, 1453 };

		for (int value : numbers) {
			showValue(value);
		}

	}

	public static void showValue(int n) {
		System.out.print(n + " ");
	}

}
