package exercises.questionsANDanswers.replit.methods;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class SplitPersonInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		/**
		 * The method person has a string arguement with this format: "name,last
		 * name,age". Print out the person's information
		 * 
		 * person("jon,doe,30");
		 * 
		 * output: person name: jon last name: doe age: 30
		 */
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person(s);
	}

	public static void person(String info) {
		String[] splitted = info.split(",");
		System.out.println("person name: " + splitted[0]);
		System.out.println("last name: " + splitted[1]);
		System.out.println("age: " + splitted[2]);
	}
}
