package POM;
//This is a new edit in pom /userlogin.java
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLogin {
	WebDriver driver;
	By usernametxt = By.id("name");
	By passwordtxt = By.id("password");
	By loginbtn = By.id("login");
	By logoutbtn = By.id("logout");
	
	public UserLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterusername(String username)
	{
	driver.findElement(usernametxt).sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
	driver.findElement(passwordtxt).sendKeys(password);
	}
	
	public void clicklogin()
	{
	driver.findElement(loginbtn).click();
	}
	
	
	
}
