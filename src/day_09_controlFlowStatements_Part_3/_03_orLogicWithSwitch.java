/**
 * 
 */
package day_09_controlFlowStatements_Part_3;

/**
 * @author esalkan
 *
 */
public class _03_orLogicWithSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'B';
		
		// A or B or C -> pass D or E -> fail
		
		//		switch (grade) {
		//		case 'A':
		//			System.out.println("Pass");
		//			break;
		//		case 'B':
		//			System.out.println("Pass");
		//			break;
		//		case 'C':
		//			System.out.println("Pass");
		//			break;
		//		case 'D':
		//			System.out.println("Fail");
		//			break;
		//		case 'E':
		//			System.out.println("Fail");
		//			break;
		//		default:
		//			break;
		//		}
				
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
			System.out.println("Fail");
			break;
		}
	}

}
