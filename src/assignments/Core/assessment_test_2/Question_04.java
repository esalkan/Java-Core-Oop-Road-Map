package assignments.Core.assessment_test_2;

/**
 * @author esalkan
 */
public class Question_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int grade = 55;

		if (grade >= 40) {
			System.out.println("Congrat...");
			if (grade < 60 || grade == 60) {
				System.out.println("You passed...");
			}
		} else {
			System.out.println("You failed...");
		}
	}

}
