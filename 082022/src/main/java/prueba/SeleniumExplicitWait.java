package prueba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath="./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		WebElement  searchbar=  new WebDriverWait (driver,Duration.ofSeconds(10).until(ExpectedConditions.elementToBeClickable(By.id("search_query_top"))));
		//WebElement  searchbar=  new WebDriverWait (driver,Duration.ofSeconds(10).until(ExpectedConditions.elementToBeClickable(By.id("search_query_top"))));

	}

}
