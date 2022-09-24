package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssert2 {
	
	SoftAssert SoftAssert = new SoftAssert();
	
	
  @Test
  public void test2() {
	  String exePath="./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Store";
		String badTitle= "mystore";
		
		SoftAssert.assertEquals(actualTitle, expectedTitle);
		SoftAssert.assertEquals(actualTitle, badTitle);
		
		SoftAssert.assertAll();
		
	  
	 
  }
}
