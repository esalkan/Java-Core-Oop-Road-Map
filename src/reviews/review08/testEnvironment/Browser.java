package reviews.review08.testEnvironment;

public class Browser {
	
	private String browserType;
	
	public Browser() {
		
	}
	
	public Browser(String name) {
		browserType = name;       // I do not need this. keyword
	}

	
	public String toString() {
		return "Browser [browserType=" + browserType + "]";
	}

	public String getBrowserType() {
		return browserType;
	}

	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}
	
	
	
}
