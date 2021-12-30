package core.JC18_readingUserInput;

import java.util.Scanner;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_userInput_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter a string:");
		String str = sc.nextLine();

		System.out.println("Output:" + num1 + ":" + num2 + ":" + str);
	}
}
