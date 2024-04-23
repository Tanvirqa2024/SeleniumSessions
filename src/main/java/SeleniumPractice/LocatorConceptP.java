package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConceptP {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//website hit
		
		driver.get("https://www.bestbuy.com/identity/newAccount?token=tid%3A5a1da491-d50c-11ee-8196-0ab1451fca07");
		
		Thread.sleep(3000);

		webelementutilP webUtil=new webelementutilP(driver);
		webUtil.typeFirstName.sendKeys("Sheikh");
		Thread.sleep(3000);
		webUtil.typeLastName.sendKeys("Arafin");
		Thread.sleep(3000);
		webUtil.typeEmail.sendKeys("sktanvir999@gmail.com");
		Thread.sleep(3000);
		webUtil.typePassword.sendKeys("DallasTexas24@");
		Thread.sleep(3000);
		webUtil.typeConfirmPassword.sendKeys("DallasTexas24@");
		Thread.sleep(3000);
		webUtil.typePhone.sendKeys("2144441111");
		Thread.sleep(3000);
		driver.close();



	}

}
