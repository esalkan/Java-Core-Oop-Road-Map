/**
 * 
 */
package core.JC24_Arrays_Part_1;

/**
 * @author esalkan
 *
 */
public class JC02_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] myList = { 10, 20, 30, 40 };
		String[] myArray = { "Apple", "Orange", "Watermelon" };

		System.out.println("myList, index 0 : " + myList[0]);
		System.out.println("myList, index 1 : " + myList[1]);
		System.out.println("myList, index 2 : " + myList[2]);
		System.out.println("myList, index 3 : " + myList[3]);

		System.out.println("myList.length() : " + myList.length);
		System.out.println("myArray.length() : " + myArray.length);

		System.out.println("\n+----- myArray ----- for Loop -----+\n");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("myArray index " + i + " : " + myArray[i]);
		}

		System.out.println("\n+----- myList ----- for Loop -----+\n");
		for (int i = 0; i < myList.length; i++) {
			System.out.println("myList index " + i + " : " + myList[i]);
		}

		int[] scores = { 80, 90, 100, 35, 60, 72, 64, 30, 10, 5, 3, 99, 89, 80, 90, 100, 35, 60, 72, 64, 30, 10, 5, 3,
				99, 89 };

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}

		System.out.println("\n+----- o -----+\n");
		System.out.println("Sum is : " + sum);
		System.out.println("Total element in array is : " + scores.length);
		System.out.println("Average is : " + sum / scores.length);

	}

}
