package exercises.questionsANDanswers.replit.methods;

/**
 * @author esalkan
 *
 */
public class MethodsWithString_MergeThem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Solved and Test Cases Passed
		
		/**
		 * Write a method mergeStrings that will return the strings merged, one letter
		 * at a time, starting with one. Please note one and two can be of different
		 * lengths.
		 * 
		 * Examples:
		 * 
		 * s1 ==> "12345" s2 ==> "abcde"
		 * 
		 * mergeStrings(s1,s2) ==> "1a2b3c4d5e"
		 * 
		 * mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
		 * 
		 * mergeStrings("java", "selenium") ==> "jsaevlaenium"
		 */

		String s1 = "12345";
		String s2 = "abcde";

		mergeStrings(s1, s2);
		System.out.println(mergeStrings("java", "selenium"));

	}

	public static String mergeStrings(String str1, String str2) {
		int oneLen = str1.length() - 1;
		int twoLen = str2.length() - 1;
		String dummy = "";
		String remain = ""; 

		if (oneLen == twoLen) {
			for (int i = 0; i <= oneLen; i++) {
				for (int j = i; j <= i; j++) {
					dummy += str1.charAt(i) + "" + str2.charAt(j);
				}
			}
		} else if (oneLen > twoLen) {	
			
			int rem = oneLen-twoLen;
			rem = oneLen - rem;
			
			remain = str1.substring(rem+1);
			
			for (int i = 0; i <= oneLen-(oneLen-twoLen); i++) {
				for (int j = i; j <= i; j++) {
					dummy += str1.charAt(i) + "" + str2.charAt(j);
				}
			}
			
			
		} else if(twoLen > oneLen) {
			int rem = twoLen-oneLen;
			rem = twoLen - rem;
			
			remain = str2.substring(rem+1);
			
			for (int i = 0; i <= twoLen-(twoLen-oneLen); i++) {
				for (int j = i; j <= i; j++) {
					dummy += str1.charAt(i) + "" + str2.charAt(j);
				}
			}
			
		}

		return dummy.concat(remain);
	}

}
