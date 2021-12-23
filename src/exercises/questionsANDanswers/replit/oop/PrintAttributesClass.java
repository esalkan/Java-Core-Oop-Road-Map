package exercises.questionsANDanswers.replit.oop;

/**
 * @author esalkan
 */
public class PrintAttributesClass {
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
	 * 
	 * 
	 */

	public String name;
	public String color;
	public int amount;

	public void asString() {
		System.out.println("name: " + name + " color: " + color + " amount: " + amount);
	}
}
