package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {

			System.setProperty("Webdriver.chrome.drive","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.qabible.in/payrollapp/site/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
	  
			WebElement userName = driver.findElement(By.id("loginform-username"));
			
			//explicit wait
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.attributeToBe(userName, "id", "loginform-username"));
			wait.until(ExpectedConditions.alertIsPresent());
			userName.sendKeys("Amala");
			
			//fluent wait
			FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(30))
		            .pollingEvery(Duration.ofSeconds(5))
		            .ignoring(NoSuchElementException.class);
			
			fluentWait.until(ExpectedConditions.attributeToBe(userName, "id", "loginform-username"));
		
	}

}
