package core.JC09_controlFlowStatements_Part_3;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC05_switchRules {

	/**
	 * @param args
	 */

	// Data types supported by switch statements:
	// - int
	// - byte
	// - short
	// - char
	// - String

	// Data types NOT supported by switch statements:
	// - boolean
	// - long
	// - double
	// - float

	// Switch statements data type for case statements must all match the data
	// type of the switch variable

	// Case statement value must be final constant variable

	// "" is using for string values
	// '' is using just for char values

	public static void main(String[] args) {
		final String lastName = "Smith";
		String firstName = "Mike";
		int id = 0;

		switch (firstName) {
		case "Mike":
			System.out.println("Test");
			break;
		case lastName: // if this case statement value is came from
						// it is must be cover with final as shown above
			id = 5;
			break;
		// case 5:
		// break
		}
	}

}
