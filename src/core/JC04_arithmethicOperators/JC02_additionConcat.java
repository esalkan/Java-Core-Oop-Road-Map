package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC02_additionConcat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Number + Number 	: Addition
		// Sayı + Sayı 		: Toplama
		System.out.println("Number + Number : Addition");
		System.out.println("2 + 2 = " + (2 + 2));
		System.out.println("2 + 200 = " + (2 + 200));

		// Number + String 	: Concatenation
		// Sayı + Dize 		: Birleştirme
		System.out.println("\nNumber + String : Concatenation ");
		System.out.println("Hello " + 5);

		// String + Boolean : Concatenation
		// Dize + Boole : Birleştirm
		System.out.println("\nString + Boolean : Concatenation");
		System.out.println(true + "Hello");

		// Boolean + Number : Number will not work for addition
		// Boole + Sayı 	: Numara ekleme çalışmayacak
		System.out.println("\nBoolean + Number will not work for addition");
		// System.out.println(true + 1); // Error, Hata
		System.out.println("System.out.println(true + 1);");

		System.out.println(2 + 0 + 3 + "codesofmine");
		System.out.println("codesofmine" + 2 + 0 + 5);
		System.out.println(2 + 0 + 5 + "codesofmine" + 2 + 0 + 5);
	}

}
