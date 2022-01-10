package reviews.review12.interface_demo;

public class ChromeDriver implements WebDriver{

	public ChromeDriver() {
		System.out.println("Launching Chrome Browser");
	}
	
	
	@Override
	public void get(String url) {
		System.out.println("ChromeDriver -- navigate to "+ url);
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println("ChromeDriver--- locating element by "+locator);
		
	}

	@Override
	public void quit() {
		System.out.println("ChromeDriver -- ending/killing all the opened sessions");
		
	}

	@Override
	public String getTitle() {
		return "ChromeDriver: EU7 is the Greatest";
	}
	
	public void uniqueMethodOfChrome() {
		System.out.println("I am the problem child");
	}

}
