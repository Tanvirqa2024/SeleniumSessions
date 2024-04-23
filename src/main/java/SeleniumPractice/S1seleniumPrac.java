package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class S1seleniumPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver;
		Driver=new EdgeDriver();
		Driver.manage().window().maximize();
		//website hit
		Driver.get("https://www.ebay.com/");
		String title=Driver.getTitle();
		System.out.println(title);
		if (title.contains("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
			System.out.println("eBay Right Title");
		}
		else 
		{
			System.out.println("Wrong");
		}
		Driver.close();

	}

}
