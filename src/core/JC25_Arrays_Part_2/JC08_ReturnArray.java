package core.JC25_Arrays_Part_2;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC08_ReturnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// for (double num : getArray()) {
		// System.out.println(num);
		// }

		double[] values = getArray();
		// or
		// double[] values;
		// values = getArray();
		for (double d : values) {
			System.out.println(d);
		}

	}

	public static double[] getArray() {

		double[] array = { 1.2, 2.3, 3.4, 4.5, 5.6 };

		return array;

	}

}
