/**
 * 
 */
package day_26_Arrays_Part_3;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _05_splitMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * split() Method
		 * 
		 * split() method is used to split a string into an array of substrings, and
		 * returns the new array
		 * 
		 * split() yöntemi, bir dizeyi, bir dizi alt dizeye bölmek için kullanılır ve
		 * yeni diziyi döndürür.
		 * 
		 * Delimeter for the split function. It can be a space or any character and java
		 * will look for that inside the string and split
		 * 
		 * Ayırma işlevi için sınırlayıcı Bir boşluk veya herhangi bir karakter olabilir
		 * ve java bunu dizenin içinde arayacak ve bulunca bölme/parçalama işlemini
		 * yapacaktır.
		 */

		// A string text
		String str = "It will display the array of the size";

		// When split a text it return an array and thats why we have to assign it to an
		// array with the same data type
		// here i split the string with " " space
		System.out.println("\n+----- split with \" \" -----+");
		String[] splittedStr = str.split(" ");
		
		System.out.println("\n+----- o -----+");
		System.out.println(splittedStr.length);
		
		System.out.println("\n+----- o -----+");
		System.out.println(Arrays.toString(splittedStr));
		
		System.out.println("\n+----- o -----+");
		
		for(String item : splittedStr) {
			System.out.println(item);
		}
		
		System.out.println("\n+----- o -----+");
		System.out.println(splittedStr[2]);
		System.out.println(splittedStr[4]);

		System.out.println("\n+----- split with \"the\" -----+");
		String[] splitFromThe = str.split("the");
		System.out.println(splitFromThe.length);
		System.out.println(Arrays.toString(splitFromThe));
		for(String item : splitFromThe) {
			System.out.println(item.trim());
		}
		
	}

}
