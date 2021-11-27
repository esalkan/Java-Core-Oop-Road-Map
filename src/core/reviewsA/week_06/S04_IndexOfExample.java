package core.reviewsA.week_06;

/**
 * @author esalkan
 *
 */
public class S04_IndexOfExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n----- indexOf() Example -----");
		String message = "Java is Awesome!";
		for (int i = 0; i < message.length(); i++) {
			System.out.println(i + ". index char is : " + message.charAt(i));
		}
		// this method takes a String and returns it's index
		// for printing Awesome
		int begining = message.indexOf("A");
		int ending = message.indexOf("me!")+2;
		String word = message.substring(begining, ending);
		System.out.println(word);

	}

}
