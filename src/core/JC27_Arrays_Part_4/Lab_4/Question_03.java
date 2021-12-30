package core.JC27_Arrays_Part_4.Lab_4;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 
		 * QUESTION 3 :
		 * 
		 * Write a method that accepts 2 arrays and checks the lengths of the arrays
		 * first. If lengths are more than 1, it prints true if the arrays have the same
		 * first element or they have the same last element. If the length of the array
		 * is not more than 1, it prints the "array1 is not a valid array" or "array2 is
		 * not a valid array"
		 * 
		 * int[] x = { 1, 2, 3 }; -> true
		 * 
		 * int[] y = { 7, 3 };
		 * 
		 * 
		 * int[] x1 = { 1, 2, 3 }; ->false
		 * 
		 * int[] y1 = { 7, 3, 2 };
		 * 
		 * 
		 * int[] x2 = { 1, 2, 3 }; -> true
		 * 
		 * int[] y2 = { 1, 3 };
		 * 
		 * 
		 * int[] x3 = { 1 }; -> Array1 is not valid.
		 * 
		 * int[] y3 = { 7, 3 };
		 * 
		 * 
		 * int[] x4 = { 1, 2, 3 }; -> Array2 is not valid. int[] y4 = { 1 };
		 * 
		 */

		int[] x = { 1, 2, 3 };
		int[] y = { 7, 3 };
		int[] x1 = { 1, 2, 3 };
		int[] y1 = { 7, 3, 2 };
		int[] x2 = { 1, 2, 3 };
		int[] y2 = { 1, 3 };
		int[] x3 = { 1 };
		int[] y3 = { 7, 3 };
		int[] x4 = { 1, 2, 3 };
		int[] y4 = { 1 };

		System.out.println(checkArrays(x, y));
		System.out.println(checkArrays(x1, y1));
		System.out.println(checkArrays(x2, y2));
		System.out.println(checkArrays(x3, y3));
		System.out.println(checkArrays(x4, y4));

	}

	public static String checkArrays(int[] arr1, int[] arr2) {

		int arr1Len = arr1.length;
		int arr2Len = arr2.length;

		if (!(arr1Len > 1)) {
			return "Array 1 length is not a valid array";
		}
		if (!(arr2Len > 1)) {
			return "Array 2 length is not a valid array";
		}

		if (arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1]) {
			return "true";
		} else {
			return "false";
		}
	}
}
