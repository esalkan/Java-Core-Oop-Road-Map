package core.reviewsA.week_05;

/**
 * @author esalkan
 */
public class _13_local_Vs_Instance_Variables_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_12_local_Vs_Instance_Variables obj = new _12_local_Vs_Instance_Variables();

		System.out.println(" -----local variable-------");
		obj.showDifference();

		System.out.println("------instance variable-------");
		obj.a = 10;
		System.out.println(obj.a);

		for (int i = 0; i < 10; i++) { // i is local to for loop
			System.out.println(i + " ");
		}
		// System.out.println(i); local variable can NOT print here
	}

}
