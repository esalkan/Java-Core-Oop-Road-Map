package exercises.patternPrograms;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Pattern03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Diamond shape composed of Star(*)

		int number, i, k, count = 1;
		number = 5;
		count = number - 1;
		for (k = 1; k <= number; k++) {
			for (i = 1; i <= count; i++)
				System.out.print(" ");
			count--;
			for (i = 1; i <= 2 * k - 1; i++)
				System.out.print("*");
			System.out.println();
		}
		count = 1;
		for (k = 1; k <= number - 1; k++) {
			for (i = 1; i <= count; i++)
				System.out.print(" ");
			count++;
			for (i = 1; i <= 2 * (number - k) - 1; i++)
				System.out.print("*");
			System.out.println();

		}
	}
 
}
