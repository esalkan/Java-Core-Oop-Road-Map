package core.day_14_methods_Part_2;

/**
 * @author esalkan
 */
public class _11_valueReturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = sum(2, 3);
		System.out.println(x);
	}

	public static int sum(int num1, int num2) {
		int result; // local variable
		result = num1 + num2;
		return result;
	}
}
