package java_mix;

public class DriverFactory {
	
	// Create a method with browser as a parameter and initialize the chrome and firefox browser.
	
	public static WebDriver getBrowser(String browser) {
		
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome")){
			
			driver = new ChromeDriver();
				
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else {
			System.out.print("Invalid browser name. Please pass the correct browser name 'chrome' or 'firefox'");
		}
		
		
	}

}
