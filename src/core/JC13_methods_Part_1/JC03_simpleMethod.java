package core.JC13_methods_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC03_simpleMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello from main method...");

		displayMessage();

		System.out.println("Back in the main method...");
	}

	private static void displayMessage() {

		System.out.println("Hello from the displayMessage() method...");
	}

}
