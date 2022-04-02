package reviews.review12.interface_demo;

public class UIAutomationTest {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver(); // polymorphic way
	
 	// WebDriver driver = new WebDriver() ; NOT possible
	ChromeDriver driver1 = new ChromeDriver();	
	
	FirefoxDriver driver2 = new FirefoxDriver();
	
	driver1.get("http://practice.codesofmine.com/");
	driver1.findElement("//input[@att='value']");
	System.out.println(driver1.getTitle());
	driver1.quit();
	
	System.out.println("================================================");
	
	driver2.get("http://practice.codesofmine.com/");
	driver2.findElement("//input[@att='value']");
	System.out.println(driver2.getTitle());
	driver2.quit();
	
	System.out.println("==============Beauty of Polymorphism=================");	
		driver.get("http://practice.codesofmine.com/");
		driver.quit();
		
		driver = new FirefoxDriver();
		driver.get("http://practice.codesofmine.com/");
		driver.quit();
		
		driver = new ChromeDriver();
		
		((ChromeDriver)driver).uniqueMethodOfChrome();
		
		
	}
	
}
