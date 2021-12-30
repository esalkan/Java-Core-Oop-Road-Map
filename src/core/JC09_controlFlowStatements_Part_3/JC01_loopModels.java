package core.JC09_controlFlowStatements_Part_3;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC01_loopModels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String computer = "Apple";

		switch (computer) {
		case "Apple":
			System.out.println("No Virus");
			break;
		case "Dell":
			System.out.println("Tought One");
			break;
		case "Acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("Do not but that one");
		}
	}

}
