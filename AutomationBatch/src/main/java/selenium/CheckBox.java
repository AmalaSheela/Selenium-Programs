package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
	//	SingleCheckBoxDemo
		WebElement singleCheckBoxButton = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckBoxButton.click();
		
		boolean singleCheckBoxButtonisSelectedorNot = singleCheckBoxButton.isSelected();
		System.out.println(singleCheckBoxButtonisSelectedorNot +":singleCheckBoxButtonisSelectedorNot");
		
		boolean singleCheckBoxButtonEnable = singleCheckBoxButton.isEnabled();
		System.out.println(singleCheckBoxButtonEnable+":singleCheckBoxButtonEnable");
		
		boolean singleCheckBoxButtonDisplay = singleCheckBoxButton.isDisplayed();
		System.out.println(singleCheckBoxButtonDisplay+":singleCheckBoxButtonDisplay");
		//MultipleCheckBoxDemo
		List<WebElement> list1 =  driver.findElements(By.xpath("//input[@class='check-box-list']"));
			//->list1:multipleCheckBoxButton	
		for(int i=0;i<list1.size();i++)
		{
			list1.get(i).click();//
		}
	
		for(int j=0;j<list1.size();j++)	
		{
			boolean selected = list1.get(j).isSelected();
			System.out.println("checkbox" + j + " Selected :" + selected);
			boolean displayed = list1.get(j).isDisplayed();
			System.out.println("checkbox" + j + " Displayed :" + displayed);
			boolean enable = list1.get(j).isEnabled();
			System.out.println("checkbox" + j + " Enabled :" + enable);
			 
		}
			
		
		driver.close();	

	}

}
