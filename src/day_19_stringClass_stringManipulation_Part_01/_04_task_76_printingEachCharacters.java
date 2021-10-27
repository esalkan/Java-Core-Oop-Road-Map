/**
 * 
 */
package day_19_stringClass_stringManipulation_Part_01;

/**
 * @author esalkan
 *
 */
public class _04_task_76_printingEachCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Display each character in the console.
		// Last character index always length()-1
		
		String str = "Java Task 76";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
