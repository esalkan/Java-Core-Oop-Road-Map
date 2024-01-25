package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC07_task_14_convertFahrenheitToCelcius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		// Fahrenheit'dan Celsius dereceye sıcaklığı dönüştürmek için bir Java programı yazın.

		double fahrenheit, celcius;
		celcius = 70.2;
		fahrenheit = 9 * celcius / 5 + 32;

		System.out.println(celcius + " Celcius is equal to = " + fahrenheit + " Fahrenheit");
	}
}
