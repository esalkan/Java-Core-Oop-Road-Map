/**
 * 
 */
package day_19_stringClass_stringManipulation_Part_01;

/**
 * @author esalkan
 *
 */
public class _03_stringChatAt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * charAt() 
		 * --> charAt() method returns a char value at the given index number.
		 * --> String indexes are zero-based: The first character is in position 0, the
		 * second in 1 , and so on
		 * 
		 * 
		 * charAt(indexNumber) : Returns a char value at given index numbers.
		 */
		
		String name = "Eyüp Sabri ALKAN";
		System.out.println(name.charAt(0)); // E
		System.out.println(name.charAt(1)); // y
		System.out.println(name.charAt(2)); // ü
		System.out.println(name.charAt(3)); // p
		System.out.println(name.charAt(4)); // 
		System.out.println(name.charAt(5)); // S
		System.out.println(name.charAt(6)); // a
		System.out.println(name.charAt(7)); // b
		System.out.println(name.charAt(8)); // r
		System.out.println(name.charAt(9)); // i
		System.out.println(name.charAt(10)); // 
		System.out.println(name.charAt(11)); // A
		System.out.println(name.charAt(12)); // L
		System.out.println(name.charAt(13)); // K
		System.out.println(name.charAt(14)); // A
		System.out.println(name.charAt(15)); // N
		
		System.out.println("\n+---------------------------+\n");
		
		//Check if first character is 'E'
		System.out.println("Check if first character is 'E'");
		if(name.charAt(0) == 'E') {
			System.out.println("E is first Character");
		} else {
			System.out.println("E is not first Character");
		}
		
		System.out.println("\n+---------------------------+\n");
		
		// Check if first and last characters are same 
		// This is hard coded way.
		System.out.println("Hard Coded\nCheck if first and last characters are same");
		
		char firstCharacter = name.charAt(0); 
		char lastCharacter = name.charAt(15);
		
		if(firstCharacter == lastCharacter) {
			System.out.println("First and Last Characters are Match");
		} else {
			System.out.println("First and Last Characters are not Match");
		}
		
		System.out.println("\n+---------------------------+\n");
		
		// Check if first and last characters are same 
		// Without Hard Coded
		System.out.println("Without Coded\nCheck if first and last characters are same");

		char firstCh = name.charAt(0);
		char lastCh = name.charAt(name.length()-1);
		
		
		if (firstCh == lastCh) {
			System.out.println("First and Last Characters are Match");
		} else {
			System.out.println("First and Last Characters are not Match");
		}
		
	}

}
