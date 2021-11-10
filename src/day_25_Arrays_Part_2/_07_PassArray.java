/**
 * 
 */
package day_25_Arrays_Part_2;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _07_PassArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creating an array
		int[] nums = new int[4];
		
		//pass the array getValue Method
		getValue(nums);
		
		System.out.println("Here are the numbers that you entered : ");
		
		// pass the array to showArray Method
		showArray(nums);
		
	} 
	
	public static void getValue(int[] array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a series of " + array.length + " numbers");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number " + (i+1) + " :");
			array[i] = sc.nextInt();
		}
	}
	
	public static void showArray(int[] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
