package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//to navigate back in url browser
		driver.navigate().back();
		Thread.sleep(1000);
		
		//to navigate forward to url browser
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//refresh our webpage
		driver.navigate().refresh();
		

	}

}