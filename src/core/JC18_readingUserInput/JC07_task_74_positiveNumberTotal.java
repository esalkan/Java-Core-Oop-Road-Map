package core.JC18_readingUserInput;

import java.util.Scanner;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC07_task_74_positiveNumberTotal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		Scanner sc = new Scanner(System.in);

		String str = "Apple"; // literal //string pool
		String str2 = new String("Apple"); // new
		System.out.println(str);
		System.out.println(str2);

		do {
			System.out.print("Enter your number:");
			num = sc.nextInt();
			if (num < 0) {
				break;
			} else {
				sum = sum + num;
			}
		} while (true);

		System.out.println("Total is:" + sum);

	}

}
