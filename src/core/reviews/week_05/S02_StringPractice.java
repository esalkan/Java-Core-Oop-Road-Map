package core.reviews.week_05;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class S02_StringPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n----- concat() -----\n");
		String str = "SDET";
		str.concat(" School");

		System.out.println(str);

		String strNew = str.concat(" School");
		System.out.println(str);
		System.out.println(strNew);

		str = strNew; // What happens to "SDET" Object ? --> garbage collector picks it up
		// str reference variable points to new object "SDET School"

		System.out.println("str : " + str);

		System.out.println("\n----- toUpperCase() -----\n");

		String str2 = "Java Course";
		str2.toUpperCase();

		System.out.println("str2 : " + str2);

		str2 = str2.toUpperCase();
		System.out.println("str2 after assigned : " + str2);

	}

}
