package core.day_30_wrapperClassA;

/**
 * @author esalkan
 *
 */
public class _07_task_96_ConvertingTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * str = "Today weather is sunny and 72 degree. It is a perfect day to practice
		 * java.";
		 * 
		 * Write a program to output: 72 degree is equal to 22.22 celcius
		 */

		String str = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";

		String[] arr = str.split("and ");

		arr = arr[1].split(" degree");

		String degree = arr[0];

		double degreeF = Double.parseDouble(degree);

		double degreeC = (degreeF - 32) * 5 / 9;

		System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");

	}

}
