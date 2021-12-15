package core.JC10_controlFlowStatements_Part_4;

/**
 * @author esalkan
 *
 */
public class JC01_ternaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String result;

		int score = 88;
		//
		// if (score > 60) {
		// result = "Pass...";
		// } else {
		// result = "Fail...";
		// }

		// ? and : are ternary operators
		result = score > 60 ? "Pass..." : "Fail...";

		System.out.println(result);

		// Nested If condition
		int x = 5;

		// Lambda expression
		System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);

		if (x > 2) {
			if (x < 4) {
				System.out.println(10);
			} else {
				System.out.println(8);
			}
		} else {
			System.out.println(7);
		}
	}
}
