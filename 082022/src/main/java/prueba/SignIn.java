package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
WebDriver driver=null;
	public SignIn (WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		this.driver=driver;
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// click in sign in 
		WebElement signInbtn = driver.findElement(By.className("//a[@class='login']"));
		signInbtn.click();
		
		// Email
		WebElement UserTxt = driver.findElement(By.id("email"));
		//Password
		WebElement PasswordTxt = driver.findElement(By.id("passwd"));

		//Signbutton
		WebElement SignBtn = driver.findElement(By.id("SubmitLogin"));
		UserTxt.sendKeys("");
		PasswordTxt.sendKeys("");
		SignBtn.click();
		
		
	}

}
