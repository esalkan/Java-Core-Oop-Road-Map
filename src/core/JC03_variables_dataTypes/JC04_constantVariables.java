package core.JC03_variables_dataTypes;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_constantVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Constant Variables
		// Değişmez, sabit değişkenler

		/**
		 * In program flow constant variables written with capital letters. during the program flow they have
		 * constand values.
		 *
		 * Program akışında değişmez sabit değişkenler büyük haflerle yazılırlar. Program akışında tanımlanan
		 * değerleri değişmez.
		 */

		double PI = 3.14;
		System.out.println(PI);
		PI = 5;
		System.out.println(PI);
		PI = 100;
		System.out.println(PI);

		final double pi = 3.14;
		System.out.println("final pi = " + pi);

		final String birthday = "17/09/1981";
		System.out.println("final string birthday " + birthday);

		final int capacity = 50;
		System.out.println("final int capacity = " + capacity);
	}

}
