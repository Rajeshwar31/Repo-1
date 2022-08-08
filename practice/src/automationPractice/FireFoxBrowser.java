package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFoxBrowser 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\FireFoxDriver\\geckodriver.exe");
		
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://amazon.com");
	}
}
