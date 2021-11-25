/**
 * 
 */
package core.day_19_stringClass_stringManipulation_Part_01;

/**
 * @author esalkan
 *
 */
public class _07_task_79_printingWovels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a program to print only vowel (a,e,o,i,u) in given string String word =
		 * "doldur sufi kadehleri aşk ile"; Output: o,u,u,i,a,e,e,i,a,i,e
		 */

		String word = "doldur sufi kadehleri aşk ile";

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'ı' || word.charAt(i) == 'i'
					|| word.charAt(i) == 'o' || word.charAt(i) == 'ö' || word.charAt(i) == 'u'
					|| word.charAt(i) == 'ü') {

				System.out.print(word.charAt(i));

			}
		}

	}

}
