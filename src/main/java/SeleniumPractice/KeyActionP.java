package SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumPractice.webelementutilP;

public class KeyActionP {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		webelementutilP webele=new webelementutilP(driver);
		
		//website hit
		driver.get("https://www.bestbuy.com/identity/newAccount?token=tid%3A650afcbe-dcee-11ee-ad65-0a918c1de34d");
		
		Robot rb=new Robot();
		webele.typeFirstName.click();
		webele.typeFirstName.sendKeys("Sheikh");
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);

		webele.typeLastName.sendKeys("Arafin");
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		webele.typeEmail.sendKeys("sktanvir999@gmail.com");
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		webele.typePassword.sendKeys("1234qwer");
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		webele.typeConfirmPassword.sendKeys("1234qwer");
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		webele.typePhone.sendKeys("0123456789");
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}		
