package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Before_AfterMethodTest {
  @Test(groups="Run")
  public void testcase01() {
 System.out.println("Testcase 01");
 
  }
  @Test
  public void testcase02()
  {
	  System.out.println("Testcase 02");
  }
  
  @Test
  public void testcase03()
  {
	  System.out.println("Testcase 03");
  } 
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

}
