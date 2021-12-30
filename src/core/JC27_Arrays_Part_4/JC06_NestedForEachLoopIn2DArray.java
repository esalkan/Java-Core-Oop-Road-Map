package core.JC27_Arrays_Part_4;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC06_NestedForEachLoopIn2DArray {

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
