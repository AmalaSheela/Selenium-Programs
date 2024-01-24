package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement sourceBank = driver.findElement(By.xpath("//li[@id='credit2']//a[@class='button button-orange']"));
		
		WebElement target = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Actions actionObj = new Actions(driver);
		actionObj.dragAndDrop(sourceBank, target).perform();
		driver.close();
		
	}

}
