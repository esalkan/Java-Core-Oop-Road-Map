package exercises.questionsANDanswers.qa01_test01;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Question_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int temperature = 50;
		int upperLimit = 70;
		int lowerLimit = 30;

		if (temperature >= upperLimit) {
			System.out.println("soundAlarm");
			System.out.println("turnHeaterOff");
		} else if (temperature < lowerLimit) {
			System.out.println("soundAlarm");
			System.out.println("turnHeaterOn");
		} else if (temperature == (upperLimit - lowerLimit) / 2) {
			System.out.println("doingFine");
		} else {
			System.out.println("noCauseToWorry");
		}
	}

}
