package core.day_33_Class_Objects_ConstructorsA;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _07_BankAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		System.out.println("What is your starting balance");
		
		input = sc.next();

		_08_BankAccountClass account = new _08_BankAccountClass(input);
		
		System.out.println("How much where you paid this month?");
		
		input = sc.next();
		
		account.deposit(input);
		
		System.out.println("Your pay has been deposited. Your Current Balance is : " + account.getBalance());
	}

}
