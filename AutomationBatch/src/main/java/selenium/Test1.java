package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.drive","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://selenium.obsqurazone.com/select-input.php/r/n");
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
		//WebElement dropDown = driver.findElement(By.id("single-input-field"));
		
		//Select obj1 = new Select (dropDown);
		//obj1.selectByIndex(2);
		//obj1.selectByValue("Yellow");
		//obj1.selectByVisibleText("Green");
		
	//Single Check Box Demo	
		
		WebElement singlecheckDemoBox = driver.findElement(By.id("gridCheck"));
		singlecheckDemoBox .click();
		
		boolean singlecheckDemoBoxSelectedorNot = singlecheckDemoBox.isSelected();
		System.out.println(singlecheckDemoBoxSelectedorNot);
		
		boolean singlecheckDemoBoxEnable = singlecheckDemoBox.isEnabled();
		System.out.println(singlecheckDemoBoxEnable);
		
		boolean singlecheckDemoBoxDisplayed = singlecheckDemoBox.isDisplayed();
		System.out.println(singlecheckDemoBoxDisplayed);

		//Multiple Checkbox Demo:Checkboxone
		
		WebElement checkBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkBoxOne.click();
		
		boolean checkBoxOneSelectedorNot = checkBoxOne.isSelected();
		System.out.println(checkBoxOneSelectedorNot+ ":checkBoxOneSelectedorNot");
		
		boolean checkBoxOneEnable = checkBoxOne.isEnabled();
		System.out.println(checkBoxOneEnable + ":checkBoxOneEnable");
		
		boolean checkBoxOneDisplayed = checkBoxOne.isDisplayed();
		System.out.println(checkBoxOneDisplayed + ":checkBoxOneDisplayed");
		
		//checkboxtwo
		
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		//checkBoxTwo.click();
		
		boolean checkBoxTwoSelectedorNot=checkBoxTwo.isSelected();
		System.out.println(checkBoxTwoSelectedorNot +":checkBoxTwoSelectedorNot");
		
		
		boolean checkBoxTwoEnable =checkBoxTwo.isEnabled();
		System.out.println(checkBoxTwoEnable + ":checkBoxTwoEnable");
		
		boolean checkBoxTwoDisplayed = checkBoxTwo.isDisplayed();
		System.out.println(checkBoxTwoDisplayed + ":checkBoxTwoDisplayed");
		
		//checkboxthree
		
		WebElement checkBoxThree = driver.findElement(By.id("check-box-three"));
		//checkBoxThree.click();
		
		boolean checkBoxThreeisSelectedorNot = checkBoxThree.isSelected();
		System.out.println(checkBoxThreeisSelectedorNot + ":checkBoxThreeisSelectedorNot");
		
		boolean checkBoxThreeEnable = checkBoxThree.isEnabled();
		System.out.println(checkBoxThreeEnable +":checkBoxThreeEnable");
		
		boolean checkBoxThreeDisplay = checkBoxThree.isDisplayed();
		System.out.println(checkBoxThreeDisplay + ":checkBoxThreeDisplay");
		
		//checkboxFour
		
		WebElement checkBoxFour = driver.findElement(By.id("check-box-four"));
		checkBoxFour.click();
		
		boolean checkBoxFourisSelectedorNot = checkBoxFour.isSelected();
		System.out.println(checkBoxFourisSelectedorNot + ":checkBoxFourisSelectedorNot");
		
		boolean checkBoxFourEnable = checkBoxFour.isEnabled();
		System.out.println(checkBoxFourEnable + ":checkBoxFourEnable");
		
		boolean checkBoxFourdisplay = checkBoxFour.isDisplayed();
	    System.out.println(checkBoxFourdisplay + ":checkBoxFourdisplay");
	    
	    WebElement selectAllButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	    selectAllButton.click();
	    
	    //WebElement unSelectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
	    //unSelectAllButton.click();
	    
	    driver.close();

	}

}
