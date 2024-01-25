package core.JC03_variables_dataTypes;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC02_primitiveVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Primitive Data Types - İlkel Veri Türleri

		// Java has 8 primitive data types; byte, short, int, long, float, double, char and boolean.
		// Java 8 ilkel veri türüne sahiptir; byte, short, int, long, float, double, char ve boolean.

		// Byte Data Type - Byte Veri Türü
		byte b1 = 25;
		byte b2 = -25;
		// byte b3 = 128;

		// Print the value of b1 and b2 - b1 ve b2 değerlerini yazdırma
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);

		// Short Data Type - Kısa Veri Türü
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;

		// Print the value of s1, s2 and s3 - s1, s2 ve s3 değerlerini yazdırma
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);

		// Integer Data Type - Tamsayı Veri Türü
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;

		// Print the value of i1, i2, i3 and i4 - i1, i2, i3 ve i4 değerlerini yazdırma
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);

		// Long Data Type - Uzun Veri Türü
		long l1 = 5000; // Suffix L is optional. Literal 5000 is of integer type
						// Sonek L isteğe bağlıdır. Değişmez 5000 tamsayı türündedir.
		long l2 = -2147483649L; // Suffix L is mandatory, this number is out of integer range
								// // Sonek L zorunludur, bu sayı tamsayı aralığının dışındadır.
		long creditCardNumber = 5876_1234_3453_9832l;

		// Print the value of l1, l2 and creditCardNumber - l1, l2 ve creditCardNumber değerlerini yazdırma
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);

		// Float Data Type - Ondalık Veri Türü
		float f1 = 2.1f;
		double d1 = 3.14;

		// Print the value of f1 and d1 - f1 ve d1 değerlerini yazdırma
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);

		// Char Data Type - Karakter Veri Türü
		char c1 = 'A';
		char c2 = 65; 	// Decimal value corresponding to character 'A'
						// 'A' karakterine karşılık gelen ondalık değer

		char c3 = '\u0041'; // Unicode value corresponding to character 'A'
							// 'A' karakterine karşılık gelen Unicode değeri

		// Print the value of c1, c2 and c3 - c1, c2 ve c3 değerlerini yazdırma
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

		// Boolean Data Type - Mantıksal Veri Türü
		boolean status = true;
		boolean status2 = false;

		// Print the value of status and status2 - status ve status2 değerlerini yazdırma
		System.out.println("status = " + status);
		System.out.println("status2 = " + status2);

		// String Data Type - Dize Veri Türü
		String name = "Alkan";
		String age = "40";
		System.out.println("My Name Is " + name + " and i am " + age + " years old.");
	}
}