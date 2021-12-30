package core.JC10_controlFlowStatements_Part_4;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_task_41_forLoop_oddNumbers {

	/**
	 * @param args
	 */
	// odd = tek sayılar
	// Write a program that displays all odd numbers between 5-140 in same line

	public static void main(String[] args) {
		for (int i = 5; i <= 140; i++) {
			if (i % 2 == 1) {
				System.out.print(i + ", ");
			}
		}
	}

}
