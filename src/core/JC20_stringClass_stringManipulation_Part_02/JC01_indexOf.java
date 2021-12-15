/**
 * 
 */
package core.JC20_stringClass_stringManipulation_Part_02;

/**
 * @author esalkan
 *
 */
public class JC01_indexOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * indexOf() Method
		 * 
		 * --> indexOf() method returns the index within the calling String of the first
		 * occurrence of the specified value, starting fromIndex. Returns -1 if the
		 * value is not found.
		 */
		String word = "github";
		System.out.println(word.indexOf("g"));
		System.out.println(word.indexOf("th"));
		System.out.println(word.indexOf("hu"));
		System.out.println(word.indexOf("b"));

		System.out.println(word.indexOf("java"));

		String url = "www.codesofmine.com";
		int i = url.indexOf(".");

		System.out.println("Position of '.' " + i);

		System.out.println(url.charAt(i + 1));

		System.out.println();
		// Find position of '-' and check if space is on right and left side

		String title = "Java - Google Search";

		System.out.println(title.indexOf('-'));
		System.out.println(title.charAt(5 + 2));
		System.out.println(title.charAt(5 - 2));

		String country = "Türkiye Cumhuriyeti";
		int states = country.indexOf("Cumhuriyet");
		System.out.println("Position of Cumhuriyet : " + states);

		String word2 = "java, c++, python, tomcat, eclipse";
		// check if c++ is in the word2

		// 1- contains();
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}

		// 2- indexOf();
		if (word2.indexOf("c++") > 1) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
	}

}
