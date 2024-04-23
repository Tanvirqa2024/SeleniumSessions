package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SeleniumSession.webelementutil;

public class ActionConceptP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//website hit
		
		driver.get("https://www.dell.com/en-us");
		webelementutil webutil=new webelementutil(driver);
		
	Actions act=new Actions(driver);
	
	act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Computers & Accessories')]"))).build().perform();
	Thread.sleep(2000);
	
	act.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Desktops & All-in-Ones')]"))).build().perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[contains(text(),'XPS Desktops')]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[contains(@href,'www.dell.com/en-us/shop/desktop-computers/xps-desktop/spd/xps-8960-desktop/usextpbts8960gljk')]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();

	
	}

}
