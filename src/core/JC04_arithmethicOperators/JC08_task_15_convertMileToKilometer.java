package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC08_task_15_convertMileToKilometer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double mile, km, convertingToKm;
		mile = 85.0;
		convertingToKm = mile * 1.609344;
		km = convertingToKm;

		System.out.println(mile + "Mile is equal to " + km + "Km");
	}

}
