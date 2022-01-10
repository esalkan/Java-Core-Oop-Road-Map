package reviews.review12.interface_demo;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		System.out.println("Launching Firefox Browser");
	}
	
	
	@Override
	public void get(String url) {
		System.out.println("FirefoxDriver -- navigate to "+ url);
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println("FirefoxDriver--- locating element by "+locator);
		
	}

	@Override
	public void quit() {
		System.out.println("FirefoxDriver -- ending/killing all the opened sessions");
		
	}

	@Override
	public String getTitle() {
		return "Firefox: EU7 is the Greatest";
	}
}
