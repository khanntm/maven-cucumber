package liveGuru.stepsDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.MyDashboardPageObject;
import pageObjects.PageGeneratorManager_Live_Guru;

public class LoginPageSteps {
	WebDriver driver; 
	String emailAddress, Password;
	LoginPageObject loginPage;
	HomePageObject homePage;
	MyDashboardPageObject myDashboardPage;
	 
	 public LoginPageSteps(WebDriver driver) {
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager_Live_Guru.getHomePage(driver);
	}
	 	@When("^Click on Login link$")
	    public void clickOnLoginLink()  {
	        loginPage = homePage.clickToLogInLink();
	    }

	    @And("^Input to Email textbox$")
	    public void inputToEmailTextbox()  {
	        loginPage.inputToEmailAddressTextbox(emailAddress);
	    }

	    @And("^Input to Password textbox$")
	    public void inputToPasswordTextbox()  {
	        loginPage.inputToPasswordTextbox(Password);
	    }

	    @And("^ Click to login button$")
	    public void clickToLoginButton()  {
	        loginPage.clickToLoginButon();
	    }
	    @Then("^Dashboard page is displayed$")
	    public void dashboardPageIsDisplayed()  {
	        myDashboardPage = PageGeneratorManager_Live_Guru.getMyDashboardPage(driver);
	    }

}
