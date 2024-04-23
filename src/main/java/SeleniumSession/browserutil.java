package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserutil {
	
	WebDriver driver;
	
	public void launchBrowser(String browserName) {

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			
			driver=new ChromeDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;
			
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		default:
			System.out.println("plz pass the right browser name..." + browserName);
			
		}
		driver.manage().window().maximize();
		
		
	}
	

	
	

}