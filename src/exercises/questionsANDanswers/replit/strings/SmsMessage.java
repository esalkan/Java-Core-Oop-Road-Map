/**
 * 
 */
package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class SmsMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		
		/**
		 * 
		 * Given a String message in the following format: Sender:<Mike Smith>. From
		 * Number:[202-123-3456]. Message:{I love programing and problem solving} assign
		 * the value of the sender, phoneNumber, and messageBody variables and print
		 * them.
		 * 
		 * Sender: Mike Smith
		 * 
		 * Phone Number: 202-123-3456
		 * 
		 * Message body: I love programing and problem solving
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();

		int sChar1 = message.indexOf("<");
		int sChar2 = message.indexOf(">");
		int pNChar1 = message.indexOf("[");
		int pNChar2 = message.indexOf("]");
		int mBChar1 = message.indexOf("{");
		int mBChar2 = message.indexOf("}");

		String sender = message.substring(sChar1 + 1, sChar2);
		String phoneNumber = message.substring(pNChar1 + 1, pNChar2);
		String messageBody = message.substring(mBChar1 + 1, mBChar2);

		System.out.println("Sender: " + sender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Message body: " + messageBody);

	}

}
