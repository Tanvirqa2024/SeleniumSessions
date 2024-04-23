package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathConceptP {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		webelementutilP webUtil=new webelementutilP(driver);
		//website hit
		driver.get("https://www.bestbuy.com/identity/newAccount?token=tid%3A1de43468-dcda-11ee-ad65-0a918c1de34d");
		
		Thread.sleep(1000);
		
	
		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"firstName\"]")).sendKeys("Sheikh");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Arafin");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("sktanvir999@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name=\"fld-p1\"]")).sendKeys("000111ABCDEF");
		
		Thread.sleep(1000);


		driver.findElement(By.xpath("//input[contains(@name,'reenterPassword')]")).sendKeys("000111ABCDEF");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@name,\"phone\")]")).sendKeys("2140009999");

		Thread.sleep(1000);

		String a=driver.findElement(By.xpath("//p[contains(text(),'People')]")).getText();
		System.out.println(a);
		
		driver.close();
		
		
		
	}

}