package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
				
		WebElement femaleRadioButton=driver.findElement(By.id("inlineRadio2"));
		femaleRadioButton.click();
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		button.click();
		
	
		boolean maleselectedornot =	maleRadioButton.isSelected();
		System.out.println(maleselectedornot);
		
		boolean femaleselectedornot = femaleRadioButton.isSelected();
		System.out.println(femaleselectedornot);
		
		boolean maleEnable = maleRadioButton.isEnabled();
		System.out.println(maleEnable);
		
		boolean femaleEnable = femaleRadioButton.isEnabled();
		System.out.println(femaleEnable);
		
		boolean femaleIsdisplayed = femaleRadioButton.isDisplayed();
		System.out.println(femaleIsdisplayed);
		
		//patientGenderRadiobutton
		WebElement  malePatientRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		 malePatientRadioButton.click();
		WebElement femalepatientRadioButton = driver.findElement(By.id("inlineRadio21"));
		femalepatientRadioButton.click();
		
		boolean malepatientselectedornot =	malePatientRadioButton.isSelected();
		System.out.println(malepatientselectedornot);
		
		boolean femalepatientselectedornot = femalepatientRadioButton.isSelected();
		System.out.println(femalepatientselectedornot);
		
		boolean malepatientsEnable = malePatientRadioButton.isEnabled();
		System.out.println(malepatientsEnable);

		boolean femalepatientEnable = femalepatientRadioButton.isEnabled();
		System.out.println(femalepatientEnable);
		
		boolean femalepatientIsdisplayed = femalepatientRadioButton.isDisplayed();
		System.out.println(femalepatientIsdisplayed);
		
	//patientsAgeGroup
		
		WebElement ageGroup1to18RadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		ageGroup1to18RadioButton.click();
		

		WebElement ageGroup19to44RadioButton = driver.findElement(By.id("inlineRadio23"));
		ageGroup19to44RadioButton.click();
		
		WebElement ageGroup45to60RadioButton = driver.findElement(By.id("inlineRadio24"));
		//ageGroup45to60RadioButton.click();
		
		
		WebElement resultbutton = driver.findElement(By.xpath("//button[text()='Get Results']"));
		resultbutton.click();
		
		boolean ageGroup1to18selectedornot = ageGroup1to18RadioButton.isSelected();
		System.out.println(ageGroup1to18selectedornot);
		
		boolean ageGroup19to44selectedornot = ageGroup19to44RadioButton.isSelected();
		System.out.println(ageGroup19to44selectedornot);
		
		boolean ageGroup45to60selectedornot = ageGroup45to60RadioButton.isSelected();
		System.out.println(ageGroup45to60selectedornot);
		
		boolean ageGroup1to18Enable = ageGroup1to18RadioButton.isEnabled();
		System.out.println("ageGroup1to18Enable : " + ageGroup1to18selectedornot);
		
		boolean ageGroup19to44Enable = ageGroup19to44RadioButton.isEnabled();
		System.out.println("ageGroup19to44Enable : " + ageGroup19to44selectedornot);
		
		boolean ageGroup45to60Enable = ageGroup45to60RadioButton.isEnabled();
		System.out.println("ageGroup45to60Enable : " + ageGroup45to60selectedornot);
		
		
		boolean ageGroup1to18Display = ageGroup1to18RadioButton.isDisplayed();
		System.out.println("ageGroup1to18Display : " + ageGroup1to18selectedornot);
		
		boolean ageGroup19to44Display = ageGroup19to44RadioButton.isDisplayed();
		System.out.println("ageGroup19to44Display : " + ageGroup19to44selectedornot);
		
		boolean ageGroup45to60Display = ageGroup45to60RadioButton.isDisplayed();
		System.out.println("ageGroup45to60Display : " + ageGroup45to60selectedornot);
			
	}

}
