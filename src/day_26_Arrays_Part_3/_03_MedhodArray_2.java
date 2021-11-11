/**
 * 
 */
package day_26_Arrays_Part_3;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _03_MedhodArray_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * createArray medhod will accept one parameter which is arraySize use will enter some cars
		 * 
		 * findCar method - will accept 2 parameters which 1- int value, toFindCar
		 * 
		 * if car is found return true
		 * 
		 * if not return false
		 * 
		 */

		System.out.println(findCar(5,"Honda"));
		
	}
	

	public static String[] createArray(int arraySize) {
		Scanner sc = new Scanner(System.in);
		String[] carArray = new String[arraySize];
		for (int i = 0; i < carArray.length; i++) {
			System.out.print("Enter your car # : " + (i+1));
			carArray[i] = sc.next();
		}
		return carArray;
	}
	
	public static boolean findCar(int value, String toFindCar) {
		for (String car : createArray(value)) {
			if (car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
		}
		return false;
	}
}
