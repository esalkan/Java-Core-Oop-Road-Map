/**
 * 
 */
package day_10_controlFlowStatements_Part_4;

/**
 * @author esalkan
 *
 */
public class _08_task_45_forLoop_repeatedBiggerNumber {

	/**
	 * @param args
	 */
	
	//	User should be able to declare 2 values and program should display 
	//	which number is largest.
	//	if numbers are equal, it should display numbers are equal
	//	Above steps need to repeated to number of times that is also declared by user.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 54;
		int num2 = 61;
		int repeat = 4;
		
		for(int i = 1; i <= repeat; i++) {
			
			if (num1 > num2) {
				System.out.println("Num1 is greater than Num2");
			} else if (num2 > num1) {
				System.out.println("Num2 is greater than Num1");
			} else if (num1 == num2) {
				System.out.println("Num1 is equal to Num2");
			}
			
		}
	}

}
