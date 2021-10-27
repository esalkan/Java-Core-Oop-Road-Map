/**
 * 
 */
package day_09_controlFlowStatements_Part_3;

/**
 * @author esalkan
 *
 */
public class _01_loopModels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
