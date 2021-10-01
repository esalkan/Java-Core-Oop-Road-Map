package core.day_14_methods_Part_2;

/**
 * @author esalkan
 */
public class _06_lab_06_cigarParty {

	/*
	 * When chipmonks get together for a party, they like to have cigars. A chipmonk
	 * party is successfull when the number of cigars is between 40 and 60. Unless
	 * it is the weekend, in which case there is no upper bound on the number of
	 * cigars. Write a method that accepts number of cigars and a boolean for
	 * weekend, and prints true if the party with the given values is successful, or
	 * false otherwise. cigarParty(30, false) → false cigarParty(50, false) → true
	 * cigarParty(70, true) → true
	 */

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
	}

	public static void cigarParty(int numberCigar, boolean isWekeend) {
		if (isWekeend) {
			if (numberCigar >= 40) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if (numberCigar >= 40 && numberCigar <= 60) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}
