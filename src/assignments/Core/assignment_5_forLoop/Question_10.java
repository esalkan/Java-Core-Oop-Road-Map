package assignments.Core.assignment_5_forLoop;

/**
 * @author esalkan
 */
public class Question_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Print following output using nested for loops:
		// 1
		// 22
		// 333
		// 4444
		// 55555
		// 666666
		// 7777777

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
