package live_reviews.week_07;

/**
 * @author esalkan
 *
 */
public class _07_SentenceSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String amazonResult = "1-48 x of x over x 6,000 x results x for x java";

		String[] resultArray = amazonResult.split("x");
		System.out.println(resultArray.length);
		System.out.println("How many results are there in my search: " + resultArray[3]);
		System.out.println("First element : " + resultArray[0]);
		System.out.println("Second Element : " + resultArray[1]);
		System.out.println("Number of 'x' in my statement : " + (resultArray.length - 1));

	}

}
