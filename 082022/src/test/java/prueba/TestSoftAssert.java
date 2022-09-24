package prueba;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestSoftAssert {
	SoftAssert softAssert = new SoftAssert();
	
  @Test
  public void f() {
	  int a = 5;
	  int b= 10; 
	  int x= 8;
	  int y=8;
	  
	  softAssert.assertEquals(a, b, "a y b no son iguales");
	  softAssert.assertEquals(x, y);
	  
	  softAssert.assertAll();
	  
	  
	  
  }
  
}
