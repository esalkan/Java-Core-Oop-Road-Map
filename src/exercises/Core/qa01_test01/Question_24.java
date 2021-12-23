package exercises.Core.qa01_test01;

/**
 * @author esalkan
 */
public class Question_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		boolean b1 = false;
		boolean b2 = false;

		if (b2 != (b1 = !b2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
