package oop.JOOP33_Class_Objects_Constructors;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class OOP07_BankAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		System.out.println("What is your starting balance");

		input = sc.next();

		OOP08_BankAccountClass account = new OOP08_BankAccountClass(input);

		System.out.println("How much where you paid this month?");

		input = sc.next();

		account.deposit(input);

		System.out.println("Your pay has been deposited. Your Current Balance is : " + account.getBalance());
	}

}
