package core.day_10_controlFlowStatements_Part_4;

/**
 * @author esalkan
 *
 */
public class _02_forLoop {

	/**
	 * @param args
	 */

	// Loops check a condition. If it returns true, a code block will run. Then the
	// condition will
	// be checked again and if it is still returns true, the code block will run
	// again. It repeats
	// until the condition return false
	//
	// There is 3 Loops
	// 1- For Loop
	// 2- While Loop
	// 3- Do While Loop

	public static void main(String[] args) {

		// If you need to run code a specific number of times, use a for loop. In a for
		// loop, the
		// condition is usually a counter which is used to tell how many times the loop
		// should run.
		// init = initialization

		// print 5 times Hello
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		System.out.println("\n+----------------------------------+\n");

		// printing 5 times "Hello" with for loop
		for (int i = 1; i < 5; i++) {
			System.out.println(i + "- Hello");
		}

		System.out.println("\n+----------------------------------+\n");

		// Example for loop
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = " + i);
		}

		System.out.println("\n+----------------------------------+\n");

		// Example for loop
		for (int i = 5; i <= 10; i++) {
			System.out.println("i = " + i);
		}

		System.out.println("\n+----------------------------------+\n");

		// Example for loop
		for (int num = 20; num >= 10; num--) {
			System.out.println("num = " + num);
		}

		System.out.println("\n+----------------------------------+\n");

		// Example for loop
		for (int i = 0; i <= 100; i += 10) {
			System.out.println("i = " + i);
		}

		System.out.println("\n+----------------------------------+\n");

		// Example for loop
		for (int i = 50; i >= 0; i -= 5) {
			System.out.println("i = " + i);
		}
	}
}