package core.JC11_controlFlowStatements_Part_5;

/**
 * @author esalkan
 *
 */
public class JC12_task_53_whileLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a program using while loop, that calculates the sum of the
		// even numbers between 0 and 100

		int i = 0;
		int sumEven = 0;

		while (i < 100) {

			if (i % 2 == 0) {

				sumEven = sumEven + i;
				System.out.println(i);
			}

			i++;
		}

		System.out.println(sumEven);

	}

}
