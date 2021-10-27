/**
 * 
 */
package day_08_controlFlowStatements_elseIf_switchCase_Part_2;

/**
 * @author esalkan
 *
 */
public class _04_task_31_triangleAngles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A triangle is valid if the sum of all the three angles is equal to
		// 180 degrees. Write a program that declares three integers as 
		// angles and check whether a triangle is valid or not.
		
		int a = 60;
		int b = 60;
		int c = 60;
		
		if ((a+b+c)==180) {
			System.out.println("This is a valid triangle");
		} else {
			System.out.println("This is not a valid triangle");
		}
	}

}
