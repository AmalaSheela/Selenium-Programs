package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='loginform-username']"));
		userNameField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.id("loginform-password"));
		passwordField.sendKeys("Password12*");
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Login']"));
		loginbutton.click();
		userNameField.clear();
		
	
		String fontSize = loginbutton.getCssValue("font-size");
		System.out.println(fontSize);
		String backGroundColor = loginbutton.getCssValue("background-color");
		System.out.println(backGroundColor);
		
		String attributeValue = loginbutton.getAttribute("class");
		System.out.println(attributeValue);
		String tagName = loginbutton.getTagName();
		System.out.println(tagName);
		String elementText = loginbutton.getText();
		System.out.println(elementText);
		driver.close();
	
		
	}
	

}
