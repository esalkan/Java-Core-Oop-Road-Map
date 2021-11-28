/**
 * 
 */
package core.day_25_Arrays_Part_2;

/**
 * @author esalkan
 *
 */
public class _04_ForEachLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * the for-each loop is used to access each successive value in a collection of
		 * values. The main usage of for-each is iterating over collection classes or
		 * arrays.
		 */

		/**
		 * Syntax
		 * 
		 * for (dataType elementVariable : array) { // Statement }
		 * 
		 */

		int[] numbers = { 3, 6, 9 };

		for (int i : numbers) {
			System.out.println(i);
		}

		/**
		 * ForEach Loop vs For Loop
		 * 
		 * - Use ForEach Loop:
		 * 
		 * When you need to access the values that are stored in an array, from the
		 * first element to the last element.
		 * 
		 * When you do not concern the size of the array, and you do not have to create
		 * an “index” variable.
		 * 
		 * - Use For Loop:
		 * 
		 * When you need to change the contents of an array element
		 * 
		 * When you need to work through the array elements in reverse order
		 * 
		 * When you need to access some of the array elements, but not all of them
		 * 
		 * When you need to simultaneously work with two or more arrays within the loop
		 */

		System.out.println("\n+----------o----------o----------+\n");

		String[] products = { "Apple", "Ibm", "Microsoft", "Oracle", "Cydeo", "Udemy" };
		double[] prices = { 1000, 132.1, 25.242, 124.523, 6323, 745.5 };

		System.out.println("\n----- print products with for loop  -----\n");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}

		System.out.println("\n----- print products with for-each loop -----\n");

		for (String product : products) {
			System.out.println(product);
		}
		
		
		System.out.println("\n----- print prices with for loop -----\n");

		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		System.out.println("\n----- print prices with for loop -----\n");
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		System.out.println("\n----- print prices with for-each loop -----\n");
		for (double price : prices) {
			System.out.println(price);
		}

		System.out.println("\n----- print products item in reverse order -----\n");
		for (int i = products.length - 1; i >= 0; i--) {
			System.out.println(products[i]);
		}

	}

}
