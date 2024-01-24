package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testtable1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.drive","D:\\Amala_selenium\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
		//heading
		List<WebElement>tableHeader = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		for(int i=0;i<tableHeader.size();i++)
		{
		String header= tableHeader.get(i).getText();
		System.out.print(header + "  ");
	    }
		System.out.println();
		List<WebElement>tableRows = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td"));
		for(int j=0;j<tableRows.size();j++)
		{
			String rows = tableRows.get(j).getText();
			System.out.print(rows + "  ");
		}
		
	}

}
