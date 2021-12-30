package exercises.questionsANDanswers.replit.strings;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Alejandro_I {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * Alejandro has many emails and only has time to read the emails that refer to
		 * him. Check if his name is found in the email and if it does print "read", but
		 * if his name is not in the email print "don't read"
		 */
		
	    Scanner s = new Scanner(System.in);
	    String a = s.nextLine();

	    if(a.equals("alejandro")){
	      System.out.println("read");
	    } else {
	      System.out.println("don't read");
	    }
		

	}

}
