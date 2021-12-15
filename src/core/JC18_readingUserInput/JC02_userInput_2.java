package core.JC18_readingUserInput;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class JC02_userInput_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a sentence and I will repeat it:");
		// String str = sc.next();

		String str2 = sc.nextLine();

		System.out.println(str2);
	}

}
