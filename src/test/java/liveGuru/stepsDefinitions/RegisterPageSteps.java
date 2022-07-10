package liveGuru.stepsDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.MyDashboardPageObject;
import pageObjects.PageGeneratorManager_Live_Guru;
import pageObjects.RegisterPageObject;

public class RegisterPageSteps {
	WebDriver driver; 
	String Email, Password;
	RegisterPageObject registerPage;
	MyDashboardPageObject dashboardPage;
	 
	//Constructor to get driver and new register page
	 public RegisterPageSteps(WebDriver driver) {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager_Live_Guru.getRegisterPage(driver);
	}
	 
	@Given("^Open register page$")
    public void openRegisterPage()  {
        registerPage.clickToRegisterButton();
    }

    @When("^Input to First Name textbox with \"([^\"]*)\"$")
    public void inputToFirstNameTextboxWithSomething(String firstname)  {
        registerPage.inputToFirstNameTextbox(firstname);
    }

    @And("^Input to Last Name textbox with \"([^\"]*)\"$")
    public void inputToLastNameTextboxWithSomething(String lastname)  {
        registerPage.inputToLastNameTextbox(lastname);
    }

    @And("^Input to Email textbox with \"([^\"]*)\"$")
    public void inputToEmailTextboxWithSomething(String emailaddress)  {
        registerPage.inputToEmailTextbox(emailaddress);
    }

    @And("^Input to Password textbox with \"([^\"]*)\"$")
    public void inputToPasswordTextboxWithSomething(String password)  {
        registerPage.inputToPasswordTextbox(password);
    }

    @And("^Input to ConfirmPassword textbox \"([^\"]*)\"$")
    public void inputToConfirmPasswordTextboxSomething(String confirmpassword)  {
        registerPage.inputToConfirmPasswordTextbox(confirmpassword);
    }

    @And("^Click to Register button$")
    public void clickToRegisterButton()  {
        registerPage.clickToRegisterButton();
        dashboardPage = PageGeneratorManager_Live_Guru.getMyDashboardPage(driver);
    }
    
    @Then("^Dashboard page is displayed$")
    public void dashboardPageIsDisplayed()  {
    	dashboardPage.getRegisterSuccessMessage();
    }
    
    @When("^Click on Logout link$")
    public void clickOnLogoutLink()  {
        dashboardPage.clickToAccountLink();
        dashboardPage.clickToLogoutLink();
    }

   

}
