package testNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ScrollTest {
	@DataProvider(name="Scroll-test")
	public Object[][] dpMethod()
	{
		return new Object[][] {{"a","b"}, {"xy","z"},{"mn","l"}};
	}
	
  @Test
  public void ScrollTestCase() {
	  System.setProperty("Webdriver.chrome.drive","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,4500)");//x,y axis
	    
	    WebElement element =driver.findElement(null);
	    js.executeScript("arguments[0].click()", element);//for click
	    
	    
  }
}
