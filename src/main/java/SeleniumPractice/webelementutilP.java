package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webelementutilP {
	
	private WebDriver driver;

	public webelementutilP(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="firstName")
	WebElement typeFirstName;
	public WebElement typeFirstName() {
		return typeFirstName;
	}

	@FindBy(name="email")
	WebElement typeEmailAddress;
	
	public WebElement typeEmailAddress() {
		return typeEmailAddress;
	}
	

	@FindBy(id="lastName")
	WebElement typeLastName;
	
	public WebElement typeLastName() {
		return typeLastName;
	}
	
	@FindBy(name="email")
	WebElement typeEmail;
	
	public WebElement typeEmail() {
		return typeEmail;
	}
	
	
	@FindBy(name="fld-p1")
	WebElement typePassword;
	
	public WebElement typePassword() {
		return typePassword;
	}
	
	@FindBy(name="reenterPassword")
	WebElement typeConfirmPassword;
	
	public WebElement typeConfirmPassword() {
		return typeConfirmPassword;
	}
	
	@FindBy(name="phone")
	WebElement typePhone;
	
	public WebElement typePhone() {
		return typePhone;
	}
	
	
}