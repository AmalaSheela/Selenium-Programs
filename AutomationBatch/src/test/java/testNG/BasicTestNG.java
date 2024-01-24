package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicTestNG {
  @Test(groups="Run")
  public void testcase01()
  {
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
  
  @Test
  public void testcase04()
  {
	  System.out.println("Testcase 04");
  }
  
  @Test
  public void testcase05()
  {
	  System.out.println("Testcase 05");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after Suite");
  }

}
