
package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandle {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.drive","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
	    String parentWindow = driver.getWindowHandle();
		WebElement newTabClick = driver.findElement(By.id("tabButton"));
	    newTabClick.click();
	    
	
	    System.out.println(parentWindow);
	    
	    Set<String> allWindows = driver.getWindowHandles();//
	    for(String childWindow :allWindows)
	    {
		if(!parentWindow.equals(childWindow))
		{
			System.out.println(childWindow);
			driver.switchTo().window(childWindow);
		WebElement textTabText = driver.findElement(By.id("sampleHeading"));
		System.out.println(textTabText.getText());

	     }
   
        }
	    driver.switchTo().window(parentWindow);
	    
}
}
