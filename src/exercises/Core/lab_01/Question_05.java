package exercises.Core.lab_01;

/**
 * @author esalkan
 */
public class Question_05 {

	/**
	 * QUESTION 5 :
	 * 
	 * You are driving a little too fast, and a police officer stops you. Write a
	 * method to compute the result: 0=no ticket, 1=small ticket, 2=big ticket.
	 * 
	 * If speed is 60 or less, the result is 0. If speed is between 61 and 80
	 * inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless
	 * it is your birthday -- on that day, your speed can be 5 higher in all cases.
	 * 
	 * caughtSpeeding(60, false) → 0 caughtSpeeding(65, false) → 1
	 * caughtSpeeding(65, true) → 0
	 * 
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		caughtSpeeding(86, true);
	}

	public static void caughtSpeeding(int speed, boolean birthDay) {

		int lowestLimit = 60;
		int highestLimit = 80;
		int tolerance = 5;

		if (speed <= lowestLimit) {

			System.out.println("Your Speed is : " + speed + "\n0 : no ticket");

		} else if (speed >= lowestLimit & speed <= highestLimit + tolerance & birthDay == true) {

			System.out.println("Your Speed is : " + speed + "\n0 = no ticket because its my bday ");

		} else if (speed >= lowestLimit & speed <= highestLimit + tolerance & birthDay == false) {

			System.out.println("Your Speed is : " + speed + "\n1 = small ticket");

		} else if (speed >= highestLimit + tolerance) {

			if (birthDay == false) {
				System.out.println("your speed is : " + speed + "\n2 = big ticket, nobody can help to you :)");
			} else {
				System.out.println(
						"your speed is : " + speed + "\n2 = big ticket, doesn't matter it is your birthday or not :)");
			}

		}
	}

}
