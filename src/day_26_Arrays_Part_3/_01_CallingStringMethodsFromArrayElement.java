/**
 * 
 */
package day_26_Arrays_Part_3;

/**
 * @author esalkan
 *
 */
public class _01_CallingStringMethodsFromArrayElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Calling String Methods From Array Element
		 * 
		 * Because each element of a String array is String Object, you can use an
		 * element to call a String Method
		 * 
		 */

		System.out.println("+----- Reaching a char value in a array list member -----+\n");

		String[] names = { "Mike", "Smith", "Tom", "Bill" };

		char letter = names[3].charAt(0);

		System.out.println(letter);

		/**
		 * 
		 * Keep in Mind
		 * 
		 * Arrays have a field named length and String objects have a method named
		 * length. When working with String arrays, do not confuse the two. Because the
		 * array's length member is a field, you do not write a set of parentheses after
		 * its name.
		 * 
		 * Dizilerin length adında bir alanı ve String nesnelerinin de length adında bir
		 * yöntemi vardır.
		 * 
		 * Dize dizileriyle çalışırken ikisini karıştırmamak gerekir. Dizinin uzunluk
		 * üyesi bir alan olduğundan, adından sonra bir parantez takımı yazmazsınız.
		 * 
		 */

		System.out.println("\n+----- Keep in mind -----+");
		System.out.println("+----- Searching Each of array member and find their length -----+\n");
		String[] names1 = { "Mike", "Smith", "Tom", "Bill" };
		for (int i = 0; i < names1.length; i++) {
			System.out.println(names[i].length());
		}

	}

}
