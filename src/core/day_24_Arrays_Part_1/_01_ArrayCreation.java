/**
 * 
 */
package core.day_24_Arrays_Part_1;

/**
 * @author esalkan
 *
 */
public class _01_ArrayCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * An array is a special type of variable that can hold multiple values of the
		 * same data type simultaneously.
		 * 
		 * • An array is an object that stores the collection of values
		 * 
		 * • One variable is used to store multiple items of same type and same variable
		 * is used to modify the items
		 */

		/**
		 * 
		 * Declaring arrays
		 * 
		 * • There are 2 ways to declare one-dimensional Arrays:
		 * 
		 * 1. Specify the type(primitive or object), and then specify square brackets[]
		 * and finally the array variable name.
		 * 
		 * int[] scores;
		 * 
		 * String[] names;
		 * 
		 * Student[] students;
		 * 
		 * 2. Specify the type(primitive or object), and then specify the array variable
		 * name which is followed by square brackets[]
		 * 
		 * int scores[];
		 * 
		 * String names[];
		 * 
		 * Students[];
		 * 
		 */

		/**
		 * Instantiating arrays
		 * 
		 * • To instantiate one dimensional array, use the keyword new, followed by type
		 * and then finally specify the size within square brackets[]
		 * 
		 * 1. Declare and instantiate in separate statements
		 * 
		 * int[] scores;
		 * 
		 * scores = new int[4];
		 * 
		 * String[] names;
		 * 
		 * names = new String[5];
		 * 
		 * 2. Declare and instantiate in single statement.
		 * 
		 * int[] scores = new int[4];
		 * 
		 * String[] nammes = new String[5];
		 * 
		 */

		/**
		 * 
		 * Keep in Mind It is illegal to include the size of the array in the
		 * declarations, Following statement will give compilation error.
		 * 
		 * int[5] scores; // Error
		 * 
		 * Once an array is created, it's size can not be changed.
		 * 
		 * final int NUM_ELEMENTS = 6;
		 * 
		 * int[] numbers = new int[NUM_ELEMENTS];
		 */
		int score1 = 80;
		int score2 = 85;
		int score3 = 90;
		int score4 = 100;
		int score5 = 85;
		// ......
		// ......
		int score100 = 90;

		int avgScore = (score1 + score2 + score3 + score4 + score5) / 5;
		System.out.println(avgScore);

		int[] scores = new int[5];
		scores[0] = 80;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 100;
		scores[4] = 50;

		System.out.println("Index 0 : " + scores[0]);
		System.out.println("Index 1 : " + scores[1]);
		System.out.println("Index 2 : " + scores[2]);
		System.out.println("Index 3 : " + scores[3]);
		System.out.println("Index 4 : " + scores[4]);

		int avgScore2 = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 2;
		System.out.println("Avg : " + avgScore2);
	}

}
