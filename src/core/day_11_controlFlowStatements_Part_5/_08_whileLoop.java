package core.day_11_controlFlowStatements_Part_5;

/**
 * @author esalkan
 *
 */
public class _08_whileLoop {

	/**
	 * @param args
	 */

	/**
	 * WHILE LOOP
	 * 
	 * while loop repeatedly executes same set of statements as long as condition is
	 * true.
	 * 
	 * condition is checked at loop start.
	 * 
	 * the code is repeated in a loop is called the body of the loop
	 * 
	 * Each repetition of the loop body is called an iteration of the loop.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// print 0-10

		int i = 0;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// using a loop , iterate untill we have 10 students in the room

		int numberOfStudents = 1;

		while (numberOfStudents <= 10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;
		}

		// print 11,10,9,8......1

		int num = 11;
		while (num >= 1) {
			System.out.print(num + " ");
			num--;
		}

	}

}
