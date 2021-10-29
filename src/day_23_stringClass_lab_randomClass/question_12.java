/**
 * 
 */
package day_23_stringClass_lab_randomClass;

/**
 * @author esalkan
 *
 */
public class question_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Return true if the string "cat" and "dog" appear the same number of times in
		 * the given string. 
		 * 
		 * catDog("catdog") → true 
		 * 
		 * catDog("catcat") → false
		 * 
		 * catDog("1cat1cadodog") → true
		 */
		
		String str = "catdog";
		
		int cat = 0;
		int dog = 0;
		
		for (int i = 0; i < str.length()-2; i++) {
			if (str.substring(i, i+3).equals("cat")) {
				cat++;
			} else if (str.substring(i, i+3).equals("dog")) {
				dog++;
			}
		}
		
		if (dog == cat) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
