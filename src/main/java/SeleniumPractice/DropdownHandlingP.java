package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import SeleniumSession.webelementutil;

public class DropdownHandlingP {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		webelementutil webUtil=new webelementutil(driver);
		//website hit
		driver.get("https://www.facebook.com/signup");
		webelementutil webutil=new webelementutil(driver);
		
		
		Select sel=new Select(webutil.SelMonth);
		sel.selectByIndex(0);
		sel.selectByValue("1");
		sel.selectByVisibleText("Jun");
		
		
		
		Select sel1=new Select(driver.findElement(By.xpath("//select[@aria-label=\"Year\"]")));
		sel1.selectByIndex(0);
		sel1.selectByValue("1990");
		sel1.selectByVisibleText("2023");
		
		
		Select sel3=new Select (driver.findElement(By.xpath("//select[@name=\"birthday_day\"]")));
		sel3.selectByValue("10");
		
		
		
		
		
		
	}

}