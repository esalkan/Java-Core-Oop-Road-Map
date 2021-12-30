package core.JC08_controlFlowStatements_elseIf_switchCase_Part_2;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC09_task_35_findGreatestNested {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1 = 1000;
		int n2 = 10000;
		int n3 = 100111;

		if (n1 > n2 && n1 > n3) {

			System.out.println("The greatest number is => n1 => " + n1);

		} else {

			if (n2 > n1 && n2 > n3) {
				System.out.println("The greatest number is => n2 => " + n2);
			} else {
				System.out.println("The greatest number is => n3 => " + n3);
			}

		}

	}

}
