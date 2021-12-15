package core.JC13_methods_Part_1;

/**
 * @author esalkan
 */
public class JC12_passMultipleArguments {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// showSum(int num1, int num2)
		showSum(5, 10);
		showSum(50, 20);
		showSum(60, 1);
		showSum(500, 100);
	}

	public static void showSum(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}
