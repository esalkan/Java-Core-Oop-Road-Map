/**
 * 
 */
package core.day_19_stringClass_stringManipulation_Part_01;

/**
 * @author esalkan
 *
 */
public class notes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * What is String? -> String is basically an object that represents sequence of
		 * char values. -> We can create strings in java by using three classes which
		 * are String, StringBuffer, StringBuilder. -> The java.lang.String class is
		 * used to create a string object. -> There are two ways to create String
		 * object. -> By string literal -> By new keyword
		 */

		/**
		 * String Literal -> Java String literal is created by using double quotes.
		 * 
		 * String str = "Java";
		 * 
		 * Each time you create a string literal, the JVM checks the “string pool”
		 * first. If the string already exists in the pool, a reference to the pooled
		 * instance is returned. If the string does not exist in the pool, a new string
		 * instance is created and placed in the pool.
		 */

		/**
		 * String Pool -> String Pool in Java corresponds to an allocation of memory in
		 * Java heap memory. It consists of a collection of String objects, which are
		 * shared and reused among several String object references for same String
		 * content.
		 * 
		 * 
		 * String str1 = "Java"; String str2 = "Java";
		 * 
		 * str1 and str2 placed STACK memory when some values assigned to them their
		 * assigned values placed in HEAP memory under the string pool.
		 */

		/**
		 * By new Keyword
		 * 
		 * String firstHelloWorld = new String("Hello World");
		 */
	}

}
