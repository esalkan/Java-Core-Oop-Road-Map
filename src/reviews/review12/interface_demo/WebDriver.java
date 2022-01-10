package reviews.review12.interface_demo;

public interface WebDriver {
	// these are all abstract method with no Return or vith return
	void get (String url); // public abstract 
	void findElement(String locator);
	void quit();
	String getTitle();
	

}
