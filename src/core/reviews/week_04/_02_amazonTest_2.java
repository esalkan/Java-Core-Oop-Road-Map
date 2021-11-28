package core.reviews.week_04;

/**
 * @author esalkan
 */
public class _02_amazonTest_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--Starting Amazon Search Functional Test--");
		_01_amazonTest.openBrowser();
		_01_amazonTest.navigateToAmazonPage();
		_01_amazonTest.searchForAnItem("Selenium");
		_01_amazonTest.verifyResultsAreDisplayed();
		System.out.println("Amazon Search Functional Test compeleted-PASS-");
	}

}
