package exercises.questionsANDanswers.replit.oop;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class PrintAttributes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * You have two classes Main and Atts. Do not touch the Main class. Finish the
		 * Atts class to have attributes:
		 * 
		 * Strings: name, color int: amount Method: asString() (returns String in format
		 * shown below) All attributes should be public
		 * 
		 * Example:
		 * 
		 * Atts a = new Atts(); a.name = "table"; a.color = "brown"; a.amount = 1;
		 * 
		 * System.out.println(a.asString()); copied! Atts a = new Atts(); a.name =
		 * "table"; a.color = "brown"; a.amount = 1;
		 * 
		 * System.out.println(a.asString()); Output
		 * 
		 * name: table color: brown amount: 1
		 */
		
		   Scanner in = new Scanner(System.in);
		   PrintAttributesClass a = new PrintAttributesClass();
		   a.name = in.nextLine();
		   a.color = in.nextLine();
		   a.amount = in.nextInt();
		   
		  a.asString();
		  
	}

}
