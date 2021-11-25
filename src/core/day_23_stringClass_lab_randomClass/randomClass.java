/**
 * 
 */
package core.day_23_stringClass_lab_randomClass;

import java.util.Random;

/**
 * @author esalkan
 *
 */
public class randomClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("+----- random() -----+");
		Random rn = new Random();
		int num = rn.nextInt();
		System.out.println("nextInt() Random int return : " + num);
		double num1 = rn.nextDouble();
		System.out.println("nexDouble() Random double return : " + num1);
		float num2 = rn.nextFloat();
		System.out.println("nextFloat() Random float return : " + num2);
		long num3 = rn.nextLong();
		System.out.println("nextLong() Random long return : " + num3);
		boolean num4 = rn.nextBoolean();
		System.out.println("nextBoolean() Random boolean return : " + num4);
		int num5 = rn.nextInt(5);
		System.out.println("nextInt(int bound) nextInt(5) Random int return : " + num5);

		System.out.println("+----- () -----+");

		/**
		 * 
		 * Generating random number between two given values.
		 * 
		 * We can add or subtract a value to shift the numeric range upward or downward
		 */

		int rndm = rn.nextInt(10) + 1; // range of 1 thru 10
		System.out.println("range of 1 thru 10 : " + rndm);
		int rndm1 = rn.nextInt(100) - 50; // range of -50 thru 49
		System.out.println("range of -50 thru 49 : " + rndm1);

	}

}
