package testCases_Search;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import NaviationPages.HomePages;
import NaviationPages.SearchResultPage;
import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;

public class TC_01_SearchDress {
	
	// declarar e inicizaliar webdriver
	WebDriver driver = DriverSetup.SetupDriver();
	
	//Pageobjetcs
	  HomePages Home_Page = new HomePages(driver);
	  SearchResultPage searchPage= new SearchResultPage (driver);
	  
	  @BeforeTest
	  public void startWebDriver() {
		  driver.get(GlobalVariables.Home_Page);
	  
}
	  
  @Test
  public void TC_01() {
	  Home_Page.search("Dress");
	  boolean visibleText= searchPage.getProdText("Dress");
	  Assert.assertTrue(visibleText,"El texto no esga desplegado");
	
	  
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
}
