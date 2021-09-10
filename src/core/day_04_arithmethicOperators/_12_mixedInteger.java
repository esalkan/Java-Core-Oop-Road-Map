package core.day_04_arithmethicOperators;
/**
 * @author esalkan
 *
 */
public class _12_mixedInteger {

	/**
	 * @param args
	 */


	public static void main(String[] args) {
		/**
		 * Mixed Integer Operations -> When values of the byte or short data types are
		 * used in arithmetic expressions, they are temporarily converted to int values.
		 * 
		 * -> The result of an arithmetic operation using only a mixture of byte, short,
		 * or int values will always be an int
		 * 
		 * short firstNumner = 10; short secondNumber = 20; short thirdNumber;
		 * 
		 *  Error thirdNumber = firstNumber + secondNumber;
		 */
		// short firstNumner = 10;
		// short secondNumber = 20;
		// short thirdNumber;

		// Error
		// thirdNumber = firstNumner + secondNumber;

		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;

		System.out.println("Sources and their assigned values;\n" + "int i1 = 5;\n" + "int i2 = 10;\n"
				+ "float f1 = 15.5f;\n" + "double d1 = 20.5;\n");

		int res1 = i1 + i2;
		float res2 = i1 + i2;
		double res3 = i2 + d1;

		System.out.println("int res1 = i1 + i2; is equal " + res1);
		System.out.println("float res2 = i1 + i2; is equal " + res2);
		System.out.println("double res3 = i2 + d1; is equal " + res3);

		short firstNumber = 10;
		short secondNumber = 20;

		// short + short is giving error and we save data in integer dataType
		int thirdNumber = firstNumber + secondNumber;
		// or we can cast it and push the compiler compile it as a short dataType
		short thirdNumber2 = (short) (firstNumber + secondNumber);

		System.out.println("\nshort firstNumber = 10;\n" + "short secondNumber = 20;");
		System.out.println("Casted to the Integer Data Type : " + thirdNumber);
		System.out.println("Casted to the Short Data Type : " + thirdNumber2);

		byte b1 = 20;
		byte b2 = 2;

		int b3 = b1 * b2;
		// or we can cast it
		byte b3_1 = (byte) (b1 * b2);

		int num1 = 20;
		int num2 = 30;

		byte res = (byte) (b1 + b2); // casting required

		byte ress = 126 + 1; // No casting is required cause directly numbers given

	}

}
