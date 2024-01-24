package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiLineSelect {

	public static void main(String[] args) {
	//Chrome
	System.setProperty("Webdriver.driver.chrome","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	//EDGE
		/*System.setProperty("webdriver.chrome.driver","D:\\Amala_selenium\\Driver\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");*/
	//Firefox	
		/*System.setProperty("webdriver.chrome.driver","D:\\Amala_selenium\\Driver\\Firefox\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://selenium.obsqurazone.com/check-box-demo.php");*/
	driver.manage().window().maximize();
	 
	
	 WebElement multiLineSelectButton  = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	 multiLineSelectButton.click();
	 
	 List<WebElement> list1 = driver.findElements(By.xpath("//input[@class='check-box-list']"));	
	 for(int i=0;i<list1.size();i++)
	 {
		 boolean selected = list1.get(i).isSelected();
		 System.out.println("CheckboxisSelectedOrNot"  + i + " : " + selected);
		 boolean displayed = list1.get(i).isDisplayed();
		 System.out.println("CheckboxIsDisplayed "  + i + " : " + displayed);
		 boolean enable = list1.get(i).isEnabled();
		 System.out.println("CheckboxIsEnabled "  + i + " : " + enable);
		 
	 }

	 
		//driver.close();	
	
	}

}
