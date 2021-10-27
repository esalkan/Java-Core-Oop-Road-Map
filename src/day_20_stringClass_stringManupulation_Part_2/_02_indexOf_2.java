/**
 * 
 */
package day_20_stringClass_stringManupulation_Part_2;

/**
 * @author esalkan
 *
 */
public class _02_indexOf_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * indexOf() Method
		 * 
		 * --> indexOf() method returns the index within the calling String of the first
		 * occurrence of the specified value, starting fromIndex. Returns -1 if the
		 * value is not found.
		 */
		
		// index of with 2 values

		String list = "html-selenium-angular-jenkins-grid";

		int firstDash = list.indexOf("-");
		System.out.println("First Dash index : " + firstDash);

		int secondDash = list.indexOf("-", (firstDash + 1));
		// int secondDash = list.indexOf("-", 5); 
		// 4 is firstDash index and for next
		// one we find use +1 and starts 5
		System.out.println("Second Dash index : " + secondDash);
		
		int thirdDash = list.indexOf("-", (secondDash+1));
		System.out.println("Third Dash index : " + thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);

	}

}