package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.drive","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//switch by name or id
		//driver.switchTo().frame("frame1");//...step1
		
		//switch by WebElement
		WebElement iframeElement = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		
		
		WebElement frameText = driver.findElement(By.id("sampleHeading"));//step2
		System.out.println(frameText.getText());
		//switching back to parent //step3
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

	}

}
