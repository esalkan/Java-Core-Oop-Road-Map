package exercises.Core.qa01_test01;

/**
 * @author esalkan
 */
public class Question_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// What will be the output of this code?

		int x = 4;
		int y = x * 4 - x++;

		if (y < 10) {
			System.out.println("Too Low");
		} else if (y > 10 && y <= 15) {
			System.out.println("Just Right");
		} else {
			System.out.println("Too High");
		}
	}

}
