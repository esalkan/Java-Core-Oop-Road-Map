package core.JC07_controlFlowStatements_if_ifElse_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC12_task_whatWillBeTheOutput2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfWaterMelon;
		boolean lotsOfWaterMelon;
		lotsOfWaterMelon = false;

		numberOfWaterMelon = 40;

		if (numberOfWaterMelon >= 20) {
			System.out.println("I have more than 20 watermelon");
		}

		if (lotsOfWaterMelon) {
			System.out.println("Good Job");
		}

		if (lotsOfWaterMelon == false) {
			System.out.println("I need more watermelon");
		}

	}

}
