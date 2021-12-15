package core.JC15_methodOverloading;

/**
 * @author esalkan
 */
public class JC09_swapTheWalues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;

		// Swap the n1 to n2 and n2 to n1

		int dmmy;

		dmmy = n1;
		n1 = n2;
		n2 = dmmy;

		System.out.println("n1 = " + n1 + "\nn2 = " + n2);

		System.out.println();

		// Another way without additional variable

		int x1 = 10, x2 = 20;

		x1 = x1 + x2;
		x2 = x1 - x2;
		x1 = x1 - x2;

		System.out.println("x1 = " + x1 + "\nx2 = " + x2);
	}

}
