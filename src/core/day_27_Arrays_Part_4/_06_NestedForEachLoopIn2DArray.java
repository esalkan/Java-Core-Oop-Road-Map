/**
 * 
 */
package core.day_27_Arrays_Part_4;

/**
 * @author esalkan
 *
 */
public class _06_NestedForEachLoopIn2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] staff = { { "Ali", "Cihan", "Şamil", "Doğukan" }, { "Metin", "Semih", "Eray" },
				{ "Engin", "Naim", "Hüsnü", "Efraim", "Ali" } };

		for (String[] persons : staff) {
			for (String person : persons) {
				System.out.print(person + " ");
			}
			System.out.println();
		}

	}

}
