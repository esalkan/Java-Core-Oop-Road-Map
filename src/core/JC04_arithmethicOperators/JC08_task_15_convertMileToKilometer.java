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
		// Write a Java program to convert mile to kilometer.
		// Mil'i kilometreye dönüştürmek için bir Java programı yazın.

		double mile, km, convertingToKm;
		mile = 85.0;
		convertingToKm = mile * 1.609344;
		km = convertingToKm;

		System.out.println(mile + "Mile is equal to " + km + "Km");
	}

}
