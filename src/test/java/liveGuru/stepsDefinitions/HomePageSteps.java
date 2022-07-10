package liveGuru.stepsDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import junit.framework.Assert;
import pageObjects.HomePageObject;
import pageObjects.PageGeneratorManager_Live_Guru;

public class HomePageSteps {
	
	WebDriver driver; 
	HomePageObject homePage;
	
	 public HomePageSteps(WebDriver driver) {
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager_Live_Guru.getHomePage(driver);
	}

	@Then("^Home page is displayed$")
	    public void homePageIsDisplayed()  {
	      Assert.assertEquals(homePage.getPageTitle(driver), "Home Page"); 
	    }
}
