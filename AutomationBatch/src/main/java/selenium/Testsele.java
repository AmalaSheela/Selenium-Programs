package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testsele {

	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "\"D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.manage().window().maximize();
	
	WebElement clickOf = driver.findElement(By.id("gridCheck"));
	clickOf.click();
	
	
	

	}

}
