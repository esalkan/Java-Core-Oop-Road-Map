package day_30_wrapperClass;

/**
 * @author esalkan
 *
 */
public class _02_wrapperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Each of Java’s eight primitive data types has a class dedicated to it. These
		 * are known as wrapper classes because they ”wrap” the primitive data type into
		 * an object of that class.
		 * 
		 * The wrapper classes are part of the java.lang package, which is imported by
		 * default into all Java programs.
		 * 
		 * Wrapper class in Java provides the mechanism to convert primitive into object
		 * and object into primitive.
		 * 
		 */

		System.out.println("+----- Integer Wrapper -----+");
		int n1 = 10;
		Integer n2 = new Integer(10);
		Integer n3 = new Integer("10");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		Integer num1 = Integer.valueOf(1234);
		System.out.println(num1);

		System.out.println("+----- Double Wrapper -----+");
		double d1 = 3.124123;
		Double d2 = new Double(3.124123);
		Double d3 = new Double("3.124123");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		System.out.println("+----- Char Wrapper -----+");
		char c1 = 'a';
		Character c2 = new Character('a');
		System.out.println(c1);
		System.out.println(c2);

		System.out.println("+----- Byte Wrapper -----+");
		byte b1 = 100;
		Byte b2 = new Byte((byte) 100);
		System.out.println(b1);
		System.out.println(b2);

		System.out.println("+----- Boolean Wrapper -----+");
		boolean bool1 = true;
		Boolean bool2 = new Boolean(true);
		Boolean bool3 = new Boolean("true");
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
	}

}
