package core.JC13_methods_Part_1;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_creditCardMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double salary = 50000;
		int creditRating = 5;
		// true && false = false
		if (salary >= 20000 && creditRating >= 7) {

			qualify();

		} else {

			noQualify();

		}

	}

	public static void noQualify() {

		System.out.println("I am sorry, you are not qualified for the CC ");

	}

	public static void qualify() {

		System.out.println("Congrat, you are qualified for the CC ");

	}

}
