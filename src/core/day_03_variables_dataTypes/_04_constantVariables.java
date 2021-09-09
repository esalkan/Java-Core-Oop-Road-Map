package core.day_03_variables_dataTypes;
/**
 * @author esalkan
 *
 */
public class _04_constantVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double PI = 3.14;
		System.out.println(PI);
		PI = 5;
		System.out.println(PI);
		PI = 100;
		System.out.println(PI);

		final double pi = 3.14;
		System.out.println("final pi = " + pi);

		final String birthday = "17/09/1981";
		System.out.println("final string birthday " + birthday);

		final int capacity = 50;
		System.out.println("final int capacity = " + capacity);
	}

}
