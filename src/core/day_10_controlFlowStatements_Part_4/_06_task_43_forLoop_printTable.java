package core.day_10_controlFlowStatements_Part_4;

/**
 * @author esalkan
 *
 */
public class _06_task_43_forLoop_printTable {

	/**
	 * @param args
	 */

	// Write a program to print the number of table

	public static void main(String[] args) {

		System.out.println("Number\t\tNumber Squared");
		System.out.println("------------------------------");

		for (int i = 1; i <= 10; i++) {
			i++;
			System.out.println(i + "\t\t" + i * i);

		}
	}
}
