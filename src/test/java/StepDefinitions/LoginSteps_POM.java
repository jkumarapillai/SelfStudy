package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.UserLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps_POM {
	WebDriver driver;
	UserLogin login;
	
//	
//	@Given("user has opened the login page")
//	public void user_has_opened_the_login_page() throws InterruptedException {
//		System.out.println("this is the GIVEN step");
//		String projectPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.navigate().to("https://example.testproject.io/web/");
//		Thread.sleep(2000);
//		
//	}
//
//	@And("^typed in (.*) and (.*)$")
//	public void typed_in_username_and_password(String username,String password) throws InterruptedException {
//		System.out.println("this is the AND step");
//		login= new UserLogin(driver);
//		login.enterusername(username);
//		login.enterpassword(password);
//		
//	}
//
//	@When("user clicks the login button")
//	public void user_clicks_the_login_button() throws InterruptedException {
//		System.out.println("this is the WHEN step");
//		login.clicklogin();
//		Thread.sleep(2000);
//	}
//
//	@Then("home page should be loaded")
//	public void home_page_should_be_loaded() {
//		System.out.println("this is the THEN step");
//		driver.findElement(By.id("logout")).isDisplayed();
//		driver.close();
//		driver.quit();
//		
//	}

}
