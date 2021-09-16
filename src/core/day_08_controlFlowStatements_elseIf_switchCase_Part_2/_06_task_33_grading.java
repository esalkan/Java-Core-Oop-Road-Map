package core.day_08_controlFlowStatements_elseIf_switchCase_Part_2;

/**
 * @author esalkan
 *
 */
public class _06_task_33_grading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a Java Program for the following logic:
		// § If marks < 60, then print “Fail”
		// § If marks >= 60, but less than 90, then print “Pass”
		// § If marks >= 90, then print “Passed with Distinction”

		int mark = 90;

		if (mark < 60) {
			System.out.println("Fail");
		} else if (mark >= 60 && mark < 90) {
			System.out.println("Pass");
		} else if (mark > 90) {
			System.out.println("Passed with distinction");
		} else {
			System.out.println("Invalid Score");
		}

	}

}
