package assignments.assignment_6_nestedForLoop_level_extraSpicy;

/**
 * @author esalkan
 */
public class Question_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//	Write a Java program to print the following pattern

		//	1
		//	10
		//	101
		//	1010
		//	10101
		//	101010
		//	1010101
		
		for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= row; col++) {
				if (col%2==1) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
		
	}

}
