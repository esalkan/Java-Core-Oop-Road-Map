package core.JC26_Arrays_Part_3;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_StringManupulation_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Array String manipulation
		 * 
		 */
		String[] myCars = { "Honda", "Mercedes", "Volvo", "Toyota", " Ford " };

		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2, 3));
		System.out.println(myCars[1].equals(myCars[2]));
		System.out.println(myCars[1] == myCars[2]);

		System.out.println("\n+----- o ----- o ----- o -----+\n");
		// Find each of the Array member length
		for (int i = 0; i < myCars.length; i++) {
			System.out.println(myCars[i].length());
		}

	}

}
