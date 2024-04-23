package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webelementutil {
	
	private WebDriver driver;

	public webelementutil(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="password_step_input")
	WebElement typePassword;
	public WebElement typePassword() {
		return typePassword;
	}

	
	@FindBy(name="reg_email__")
	WebElement typeMobileNumber;
	
	public WebElement typeMobileNumbers() {
		return typeMobileNumber;
	}
	
	@FindBy(name="email")
	WebElement typeEmail;
	
	public WebElement typeEmail() {
		return typeEmail;
	}
	
	
	@FindBy(name="firstname")
	public
	WebElement typeFirstName;
	
	public WebElement typeFirstName() {
		return typeFirstName;
	}
	
	
	@FindBy(xpath="//select[@name=\"birthday_month\"]")
	public
	WebElement SelMonth;
	
	public WebElement SelMonth() {
		return SelMonth;
	}
	
	
	
	@FindBy(name="lastname")
	public
	WebElement typeLastName;
	
	public WebElement typeLastNames() {
		return typeLastName;
	}
	
	
	@FindBy(xpath="//input[@name=\"reg_passwd__\"]")
	WebElement typeNewPW;
	
	public WebElement typeNewPW() {
		return typeNewPW;
	}
	
	
	@FindBy(id="draggable")
	WebElement Dragable;
	
	public WebElement Dragable() {
		return Dragable;
	}
	
	
	@FindBy(id="droppable")
	WebElement Dropable;
	
	public WebElement Dropable() {
		return Dropable;
	}
	
	
}