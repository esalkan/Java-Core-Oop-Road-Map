package day_29_Arrays_Part_6.Lab_4_Cont;

/**
 * @author esalkan
 *
 */
public class Question_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Write a method that accepts an array and prints the total of the numbers in
		 * the array, except ignore sections of numbers starting with a 6 and extending
		 * to the next 7 (every 6 will be followed by at least one 7).
		 * 
		 * int[] x = { 1, 2, 2 }; -> 5
		 * 
		 * int[] y = { 1, 2, 2, 6, 99, 99, 7 }; -> 5
		 * 
		 * int[] a = { 1, 1, 6, 7, 2 }; -> 4
		 * 
		 * int[] b = { 1, 1, 6, 2 }; -> 2
		 * 
		 * int[] c = { 1, 2, 2, 6, 99, 99, 7, 3, 4 }; -> 12
		 */
		
		int[] x = { 1, 2, 2 };
		int[] y = { 1, 2, 2, 6, 99, 99, 7 };
		int[] a = { 1, 1, 6, 7, 2 };
		int[] b = { 1, 1, 6, 2 };
		int[] c = { 1, 2, 2, 6, 99, 99, 7, 3, 4 };
		
		System.out.println(sumOfArray(x));
		System.out.println(sumOfArray(y));
		System.out.println(sumOfArray(a));
		System.out.println(sumOfArray(b));
		System.out.println(sumOfArray(c));

	}
	
	public static int sumOfArray(int[] arr) {
		
		int result = 0;
		
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
		
			if (flag) {
			
				if (arr[i] == 7) {
				
					flag = false;
				}
				
			} else if (arr[i] == 6){
				
				flag = true;
				
			} else {
				
				result += arr[i];
				
			}
		}

		return result;
		
	}

}
