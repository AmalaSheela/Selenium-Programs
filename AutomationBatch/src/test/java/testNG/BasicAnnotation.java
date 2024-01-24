package testNG;

import org.testng.annotations.Test;

public class BasicAnnotation {
  @Test(groups="Run")
  public void testcase01()
  {
	  System.out.println("Testcase 01");
  }
  
  @Test(enabled=true,groups="Run")
 
  public void testcase02()
  {
	  System.out.println("Testcase 02");
  }
  
  @Test(enabled=false)
  
  public void testcase03()
  {
  System.out.println("Testcase 03");
  }
  
  
  @Test(priority=1)
	  public void testcase04()
	  {
		  System.out.println("Testcase 04");
	  }
  
  @Test(priority=2)
  public void testcase05()
  {
	  System.out.println("Testcase 05");
  }
   
  @Test
  public void testcase06()
  {
	  System.out.println("Testcase 06");
  }
  
  @Test
  public void testcase07()
  {
	  System.out.println("Testcase 07");
  }
  
  
}



