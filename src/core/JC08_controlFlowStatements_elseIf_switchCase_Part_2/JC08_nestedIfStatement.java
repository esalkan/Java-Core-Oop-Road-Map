package core.JC08_controlFlowStatements_elseIf_switchCase_Part_2;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC08_nestedIfStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isRushHour = true;

		int carType = 2;

		double price = 0.0;

		if (carType == 1) {

			if (isRushHour) {

				price = 30.0;

			} else {

				price = 5.0;

			}

		} else if (carType == 2) {

			if (!isRushHour) {

				price = 55.30;

			} else {

				price = 15.99;
			}

		}

		System.out.println("Toll Cost: " + price);

	}

}
