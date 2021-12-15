package core.JC05_unaryAssignmentRelationalLogicalOperators;

/**
 * @author esalkan
 *
 */
public class JC04_task_20_unaryOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		a = -a-- + a++ / -a-- * --a;

		// a in memory = 1 - > 0 - > 0 - > -1
		// result = -1 + 0 / -1 * -1 = -1 + 0 * -1 = -1 + 0 = -1

		System.out.println(a);

	}

}
