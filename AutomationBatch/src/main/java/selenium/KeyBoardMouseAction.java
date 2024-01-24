package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardMouseAction {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions actionObj = new Actions(driver);
		
		WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
		actionObj.doubleClick(doubleClickMe).perform();
		
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		actionObj.contextClick(rightClick).perform();
		//MouseHowering//
		actionObj.moveToElement(doubleClickMe);
		//Keyboard->keys//
		actionObj.sendKeys(Keys.ARROW_DOWN).perform();

	}

}
