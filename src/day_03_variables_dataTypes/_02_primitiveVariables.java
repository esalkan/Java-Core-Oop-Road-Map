/**
 * 
 */
package day_03_variables_dataTypes;

/**
 * @author esalkan
 *
 */
public class _02_primitiveVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 25;
		byte b2 = -25;
		// byte b3 = 128;
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		// Integer Numbers 
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		
		long l1 = 5000; // Suffix L is optional. Literal 5000 is of integer type
		long l2 = -2147483649L; // Suffix L is mandatory, this number is out of integer range
		long creditCardNumber = 5876_1234_3453_9832l;
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);
		
		// Floating Numbers
		float f1 = 2.1f;
		double d1 = 3.14;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		
		
		// Char Data Type
		char c1 = 'A';
		char c2 = 65; //Decimal value corresponding to character 'A'
		char c3 = '\u0041'; // Unicode value corresponding to character 'A'
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		// Boolean Data Type
		
		boolean status = true;
		boolean status2 = false;
		
		System.out.println("status = " + status);
		System.out.println("status2 = " + status2);
		
		// String Data Type
		String name = "Alkan";
		String age = "40";
		System.out.println("My Name Is " + name + " and i am " + age + " years old.");
	}

}
