package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {

	

	@FindBy(id="name")
	WebElement usernametext;
	
	@FindBy(id="password")
	WebElement passwordtext;
	
	@FindBy(id="login")
	WebElement loginbutton;
	
	WebDriver driver;
	
	public loginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterusername(String username) {
		usernametext.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		passwordtext.sendKeys(password);
	}
	
	public void clicklogin() {
		loginbutton.click();
	}
	
	
}
