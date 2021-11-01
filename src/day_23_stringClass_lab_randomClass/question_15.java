/**
 * 
 */
package day_23_stringClass_lab_randomClass;

/**
 * @author esalkan
 *
 */
public class question_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Given a string, return true if "bad" appears starting at index 0 or 1 in the
		 * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may
		 * be any length, including 0.
		 * 
		 * hasBad("badxx") → true
		 * 
		 * hasBad("xbadxx") → true
		 * 
		 * hasBad("xxbadxx") → false
		 */
		
		String str = "xbadxx";
		
		int strLen = str.length();
		System.out.println(strLen);
		
		if(str.substring(0,3).contains("bad") || str.substring(1,4).contains("bad")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		System.out.println("+---- for loop solution -----+");
		
		boolean flag = true;
		
		for (int i = 0; i < 2; i++) {
			if(str.substring(i,i+3).contains("bad")) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		
		if (flag) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		

	}

}
