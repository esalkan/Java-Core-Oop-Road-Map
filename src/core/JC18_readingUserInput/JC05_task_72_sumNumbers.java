package core.JC18_readingUserInput;

import java.util.Scanner;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC05_task_72_sumNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		System.out.println("Sum of numbers:" + sum);
	}

}
