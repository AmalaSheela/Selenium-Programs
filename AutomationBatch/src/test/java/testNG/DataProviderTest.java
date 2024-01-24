package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider(name="data-provider")
	public Object[][] dpMethod()
	{
		return new Object[][] {{2,3}, {5,7}};
	}

  @Test(dataProvider="data-provider")
  public void testcase(int a,int b) {
	  System.out.println(a+b);
  }
  @Test(dataProvider="Scroll-test",dataProviderClass=ScrollTest.class)
  public void testcaseString(String  a,String  b) {
	  System.out.println(a);
	  System.out.println(b);
  }
  
  
  
  
}
