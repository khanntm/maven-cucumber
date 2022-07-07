package stepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	
	@Given("^Open Facebook application$")
	public void openFacebookApplication()  {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^Verify email textbox is displayed$")
	public void verifyEmailTextboxIsDisplayed()  {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());

	}

	@Then("^verify password textbox is displayed$")
	public void verifyPasswordTextboxIsDisplayed()  {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='pass']")).isDisplayed());
	}
	
	@And("^Close application$")
	public void closeApplication()  {
		driver.quit();;
	}



}
