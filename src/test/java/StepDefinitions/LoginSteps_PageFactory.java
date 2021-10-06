package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.loginPageFactory;

public class LoginSteps_PageFactory {
	WebDriver driver=null;
	loginPageFactory login;
	
	@Given("user has opened the login page")
	public void user_has_opened_the_login_page() throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(2000);
	}

	@And("^typed in (.*) and (.*)$")
	public void typed_in_username_and_password(String username,String password) throws InterruptedException {
		System.out.println("this is the And step");
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
		login = new loginPageFactory(driver);
		Thread.sleep(2000);
		login.enterusername(username);
		login.enterpassword(password);
		
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		System.out.println("this is the when step");
		//driver.findElement(By.id("login")).click();
		login.clicklogin();
		Thread.sleep(2000);
	}

	@Then("home page should be loaded")
	public void home_page_should_be_loaded() {
		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
		
	}

}
