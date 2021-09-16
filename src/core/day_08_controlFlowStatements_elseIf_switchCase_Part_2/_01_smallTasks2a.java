package core.day_08_controlFlowStatements_elseIf_switchCase_Part_2;

/**
 * @author esalkan
 *
 */
public class _01_smallTasks2a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1-Write an if-else statement that assigns 20 to variable y if the variables
		// x is greater than 100. Otherwise, it should assign 0 to the variable y

		int x = 200;
		int y = 10;

		if (x > 100) {
			y = 20;
		} else {
			y = 0;
		}
		System.out.println("y = " + y);

		System.out.println("\n+----------------------------------------+\n");

		// 2-write an if-else statement that assigns 1 to x when y is equal to 100.
		// Otherwise, it should assign 0 to x

		if (y == 100) {
			x = 1;
		} else {
			x = 0;
		}
		System.out.println("x = " + x);

		System.out.println("\n+----------------------------------------+\n");

		// 3-Write an if-else statement that assigns 0 to the variable b and assigns 1
		// to the
		// variable c if the variable a is less than 10.
		// Otherwise, it should assign -99 to the variable b and assign 0 to variable c

		int a = 20;
		int b = 0;
		int c = 0;

		if (a < 10) {
			b = 0;
			c = 1;

		} else {
			b = -99;
			c = 0;

		}

		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
