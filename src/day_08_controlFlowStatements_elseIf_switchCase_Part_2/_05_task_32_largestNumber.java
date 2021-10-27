/**
 * 
 */
package day_08_controlFlowStatements_elseIf_switchCase_Part_2;

/**
 * @author esalkan
 *
 */
public class _05_task_32_largestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare 3 Numbers
		// Program should display which one is largest
		
		int num1=10000;
		int num2=2000;
		int num3=300;
		
		if((num1>num2)&&(num1>num3)) {
			
			System.out.println("Num1 is greatest one");
			
		}else if((num2>num1)&&(num2>num3)) {
			
			System.out.println("Num2 is greatest one");
			
		}else if((num3>num1)&&(num3>num2)) {
			
			System.out.println("Num3 is greatest one");
			
		}else {
			
			System.out.println("Numbers are equal");
		}
		
		
	}

}
