package core.reviews.week_08;

/**
 * @author esalkan
 *
 */
public class _06_WrapperClassCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcd1234!@#&£efgh6789#$ABCD";

		// we will sort our String into different parts Digits, Letters.....

		String letter = "";
		String upperCase = "";
		String lowerCase = "";
		String digits = "";
		String specialChars = "";

		// for and if statements
		for (char each : s.toCharArray()) {
			if (Character.isLetter(each)) {
				letter += each;
				if (Character.isLowerCase(each)) {
					lowerCase += each;
				} else {
					upperCase += each;
				}
			} else if (Character.isDigit(each)) {
				digits += each;
			} else {
				specialChars += each;
			}
		}

		System.out.println(letter);
		System.out.println(digits);
		System.out.println(lowerCase);
		System.out.println(upperCase);
		System.out.println(specialChars);

	}

}
