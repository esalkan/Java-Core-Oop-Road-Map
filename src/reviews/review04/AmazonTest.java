package reviews.review04;

public class AmazonTest {

	public static void main(String[] args) {
		
		System.out.println("--Starting Amazon Search Functional Test--");
		openBrowser();
		navigateToAmazonPage();
		searchForAnItem();
		verifyResultsAreDisplayed();
		System.out.println("Amazon Search Functional Test compeleted-PASS-");

		System.out.println("--------------------------------");
		
		System.out.println("--Starting Amazon Search Functional Test With Loaded Method--");
		openBrowser();
		navigateToAmazonPage();
		searchForAnItem("JAVA");
		verifyResultsAreDisplayed();
		System.out.println("Amazon Search Functional Test compeleted-PASS-");
		
	}
	
	public static void openBrowser() {
		System.out.println("Launching Chrome Browser");
	}
	
	public static void navigateToAmazonPage() {
		System.out.println("Navigating to https;://www.amazon.com/");
	}
	
	public static void searchForAnItem () {
		System.out.println("Search for Wooden Spoon");
	}
	
	public static void verifyResultsAreDisplayed() {
		System.out.println("PASS: Search results are successfully displayed");
	}
	

	public static void searchForAnItem (String item) {
		System.out.println("Search for "+item);
	}
	
	
	
}
