package prueba;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Test_HardAssert {
 
 
  @Test
 public void VerificarTituloDePagina() {
	  String exePath="./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle ="My Store";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	  
	  
  }
  
  
}
