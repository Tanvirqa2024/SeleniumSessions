package SeleniumSession;

import org.openqa.selenium.By;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		browserutil util=new browserutil();
		
		util.launchBrowser("chrome");
		
		//hit a url 
		util.driver.get("https://www.orangehrm.com/");
		Thread.sleep(2000);
		

	
		

	}

}