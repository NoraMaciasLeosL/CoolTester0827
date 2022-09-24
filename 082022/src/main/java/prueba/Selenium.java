package prueba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	String exePath="./src/test/resources/driver/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
		
	WebElement searchBar = driver.findElement(By.id("search_query_top"));
	WebElement searchBtn =  driver.findElement(By.xpath("(//*[@type= \"submit\"])[1]"));
	
	searchBar.sendKeys("dress");
	searchBtn.click();
	
	
	//metodos de explorador
	String title = driver.getTitle();
	System.out.println(title);
	String urlSearch = driver.getCurrentUrl();
	System.out.println("la url es" + urlSearch);
	
	// metodos de navegacion
	
//	driver.navigate().back();
//	Thread.sleep(3000);
//	driver.navigate().forward(); // usar boton de navegador
//	Thread.sleep(3000);
//	driver.navigate().refresh();
//	Thread.sleep(3000);

	
	// verificiar elemento desplegado en la pagina
	boolean prodContainer =  driver.findElement(By.className("product-container")).isDisplayed();
	if(prodContainer) {
		System.out.println("el articulo esta desplegado");
		
		}
	 	
		
	// obtener texto webelement
		String prodName = driver.findElement(By.className("product-container")).getText(); // todo lo que esta abajo del div de la clase
		
		boolean prodNameContains= prodName.contains("Printed Summer Dress"); // el navtivo de java compara 2 strings y regresa boleano
		
		if(prodNameContains) {
			System.out.println("el nombre de producto es correcto");
			
		}else{
			System.out.println("el nombre de producto es incorrecto");
		}
			
		 // dropdown element
		Select sortDrpDwn   = new Select(driver.findElement(By.id("selectProductSort")));
		
//		sortDrpDwn.SelectByVisibleText("Price: Lowest first");
//		sortDrpDwn.SelectByIndex(2);
	
		
		
		// findelements
		List<WebElement> prodList =  driver.findElements(By.className("product-container"));
		System.out.println("numero de elementos en productos"+ prodList.size());
		
		String tercerProd = prodList.get(2).getText();
		System.out.println(tercerProd);
		
		for (int i=0; i < prodList.size(); i++) {
			System.out.println("Los product son"+ prodList.get(i).getText());
				System.out.println();
			if (!prodList.get(i).getText().contains("Dress")) {
				System.out.println("EL producto no es vestido");
				break;
			}
			
			
		}
		
		
		}
	


	}


