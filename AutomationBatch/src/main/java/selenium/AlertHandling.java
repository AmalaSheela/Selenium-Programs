package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.drive","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php\\r\\n");
		driver.manage().window().maximize();
		
		WebElement clickMeButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeButton.click();
		driver.switchTo().alert().accept();
		
		WebElement clickMeButton2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMeButton2.click();
		
		
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().dismiss();
		
		WebElement clickForPromptBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickForPromptBox.click();
		
		Alert alertSend = driver.switchTo().alert();
		alertSend.sendKeys("Enter data");
		alertSend.accept();
			
		
	}

}
