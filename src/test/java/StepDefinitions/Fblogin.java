package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fblogin {
	WebDriver driver;
	String fb="Facebook";
	@Given("open browser And Open Facebook")
	public void open_browser_and_open_facebook() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
	}

	@When("enter Username And Password And click loginButton")
	public void enter_username_and_password_and_click_login_button() {
		driver.findElement(By.name("email")).sendKeys("9705650785");
		driver.findElement(By.name("pass")).sendKeys("9876543238");
		driver.findElement(By.name("login")).click();;
	}

	@Then("Verify Homepage")
	public void verify_homepage() {
		String pgTitle = driver.getTitle();
		if (pgTitle.contains(fb))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
	}

}
