package exercises.questionsANDanswers.replit.statements;

import java.util.Scanner;

/**
 * @author esalkan
 */
public class Citizens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solved and Test Cases Passed
		// 1. Declare int variables: seniorCitizens, nonSeniorCitizens, age
		// 2. Create a Scanner object
		// 3. Ask user to enter count for seniorCitizens and nonSeniorCitizens using
		// message:
		// "Enter current count for seniorCitizens and nonSeniorCitizens:"
		// 4. Ask user to enter age:
		// "What is new citizen's age?"
		// if citizen's age is more than or equals to 65 then print "Senior Citizen" and
		// increment seniorCitizens variable by 1.
		// if citizen's age is less than 65 then print "Non-Senior Citizen" and
		// increment nonSeniorCitizens variable by 1.
		// 5. Last print another message:
		// "New seniorCitizens count ValueOfVariable"
		// "New nonSeniorCitizens count ValueOfVariable"
		// WRITE YOUR CODE HERE
		int seniorCitizens, nonSeniorCitizens, age;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens = scan.nextInt();
		nonSeniorCitizens = scan.nextInt();

		System.out.println("What is new citizen's age?");
		age = scan.nextInt();

		if (age >= 65) {
			seniorCitizens = ++seniorCitizens;
			System.out.println("Senior Citizen");
			System.out.println("New seniorCitizens count " + seniorCitizens);
			System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
		} else {
			nonSeniorCitizens = ++nonSeniorCitizens;
			System.out.println("Non-Senior Citizen");
			System.out.println("New seniorCitizens count " + seniorCitizens);
			System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
		}

	}

}
