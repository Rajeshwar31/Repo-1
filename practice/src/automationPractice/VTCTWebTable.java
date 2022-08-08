package automationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTCTWebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Multiple Elements i.e data from web table
		
		List <WebElement> columnHeaders = driver.findElements(By.xpath("//html//table//tbody//tr//th"));
		System.out.println("No. of column- "+ columnHeaders.size());

		for(int i=0; i<columnHeaders.size(); i++)
		{
			String result =columnHeaders.get(i).getText();
			System.out.println(result);
		}
		List <WebElement> columncells = driver.findElements(By.xpath("//html//tbody//tr//td"));
		System.out.println("No. of cells in table- "+columncells.size());
		for(int i=0;i<columncells.size();i++)
		{
			String cellResults = columncells.get(i).getText();
			System.out.println(cellResults);
		}
	}

}
