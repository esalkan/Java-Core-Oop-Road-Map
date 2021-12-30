package core.JC30_wrapperClass;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC06_ParsingValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println(numberAsString);

		int number = Integer.parseInt(numberAsString);
		System.out.println(number);

		numberAsString = numberAsString + 1;
		number = number + 1;

		System.out.println(numberAsString);
		System.out.println(number);

		double number2 = Double.parseDouble(numberAsString);
		System.out.println(number2);

		int i = 10;
		String s = String.valueOf(i);
		System.out.println(s); // it will return "10"

		String s2 = Integer.toString(i);
		System.out.println(s2); // it will return "10"

	}

}
