package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessConcept {

	public static void main(String[] args) throws InterruptedException {
		//No browser at all
		//browser will be invisible
		//Testing is happening behind the browser
		 //Faster than normal execution
		//when u are running in local, headless mode allow u to do other works in ur local machine
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver;
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//website hit
		driver.get("https://www.amazon.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Facebook - log in or sign up")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		

	}

}