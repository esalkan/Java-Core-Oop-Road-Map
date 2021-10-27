/**
 * 
 */
package day_11_controlFlowStatements_Part_5;

/**
 * @author esalkan
 *
 */
public class _02_nestedForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <=5; i++) {
			System.out.println("Outer Loop Iteration : " + i);
			for (int j = 1; j <= 3; j++) {
				System.out.println("i = " + i + "; j = " + j);
			}
		}
	}

}
