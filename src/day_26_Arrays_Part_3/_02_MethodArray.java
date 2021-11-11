/**
 * 
 */
package day_26_Arrays_Part_3;

import java.util.Random;

/**
 * @author esalkan
 *
 */
public class _02_MethodArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printArray(40);
	}

	public static int[] createArray(int arraySize) {
		Random rn = new Random();
		int[] myArray = new int[arraySize];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rn.nextInt(100);
		}
		return myArray;
	}
	
	public static void printArray(int number) {
		for(int value : createArray(number)) {
			System.out.println(value);
		}
	}
	
	
}
