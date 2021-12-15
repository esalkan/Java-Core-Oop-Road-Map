package exercises.Core.assignment_2_variables;

/**
 * @author esalkan
 */
public class Question_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Five friends are going to the theater.
		// They have purchased a row of five seats with an aisle on either end.
		// Declare 5 String variables and store their names.

		// James doesn't want to sit next to Jill
		// Betty and Herb are dating and want to sit next to each other
		// Bob wants to sit on a left side aisle
		// James wants to sit on the aisle
		// Provide a seating order that conforms to the above rules.
		// An example of an invalid seating order is:
		// James, Betty, Herb, Bob, Jill

		// The above arrangement is invalid because: Bob is not sitting on the left
		// aisle.
		// Specify the seating order as the names separated by commas and space (as in
		// the above example).
		// Use variables and print names in the right order.

		String person1, person2, person3, person4, person5;
		person1 = "James";
		person2 = "Jill";
		person3 = "Betty";
		person4 = "Bob";
		person5 = "Herb";

		System.out.println("Seating Order is: ");
		System.out.println(person4 + ", " + person2 + ", " + person3 + ", " + person5 + ", " + person1);

	}

}
