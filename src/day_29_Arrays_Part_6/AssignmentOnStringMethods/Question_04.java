package day_29_Arrays_Part_6.AssignmentOnStringMethods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class Question_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * You have a word, do the following:
		 * 
		 * If the word has odd number of characters and has 5 or more characters, print
		 * the middle three characters of the word. Otherwise, print "invalid".
		 * 
		 * Sample Output:
		 * 
		 * fifteen ==> fte
		 * 
		 * apple ==> ppl
		 * 
		 * hey ==> invalid
		 * 
		 * java ==> invalid
		 * 
		 * whatsup ==> ats
		 * 
		 * $ ==> invalid
		 * 
		 */

		
		String[] words = {"whatsup", "fifteen", "apple", "hey", "java", "$", "123456789"};
		
		for (int i = 0; i < words.length; i++) {
			String str = words[i];
			
			int holderForLongStr = str.length()-3;
			holderForLongStr = holderForLongStr/2;
			int holderForEqualStr = 1; 

			if (str.length() % 2 == 1 && str.length() > 5) {
				System.out.println(str.substring(holderForLongStr, str.length()-holderForLongStr));
			} else if (str.length() % 2 == 1 && str.length() == 5) {
				System.out.println(str.substring(holderForEqualStr, str.length()-holderForEqualStr));
			} else {
				System.out.println("Invalid!");
			}
		}
		
		
		

	}

}
