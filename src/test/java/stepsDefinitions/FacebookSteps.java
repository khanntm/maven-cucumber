package stepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	
	@Given("^Open Facebook application$")
	public void openFacebookApplication()  {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^Input to Username textbox$") 
	public void inputToUsernameTextbox() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("automation@gmail.com");
	}
	@When("^Input to Password textbox$") 
	public void inputToPasswordTextbox() {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("automation");
	}
	
	@When("^Input to Username textbox with \"([^\"]*)\"$") 
	public void inputToUsernameTextboxWith(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
	}
	@When("^Input to Password textbox with \"([^\"]*)\"$") 
	public void inputToPasswordTextboxWith(String password) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@When("^Input to Username with \"([^\"]*)\" and Password with \"([^\"]*)\"$")
	public void InpuToUsernameWithAndPasswordWith(String email, String password){
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	 @When("^Input to Username and Password$")
	    public void inputToUsernameAndPassword(DataTable table) {
	        
	    }
	
	@When("^Click to Submit button$") 
	public void clickToSubmitButton() {
		driver.findElement(By.name("login")).click();
	}

	
	@And("^Close application$")
	public void closeApplication()  {
		driver.quit();;
	}



}
