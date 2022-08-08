package automationPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupesh\\Desktop\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.apple.com/in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL); // Actual URL with all the end points 
		
		String Title = driver.getTitle();
		System.out.println(Title); // title of the web-site
		Dimension d = new Dimension (200,500);//set size of the browser creating or calling he dimension class of Selenium
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(9000);
		//Position of browser
		
		Point p = new Point(500,300);
		
		driver.manage().window().setPosition(p);
		
		
		

		
		
		driver.close();

	
	
	}

}
